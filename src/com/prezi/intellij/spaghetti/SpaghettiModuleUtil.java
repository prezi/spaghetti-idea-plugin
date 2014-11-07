package com.prezi.intellij.spaghetti;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiManager;
import com.intellij.psi.search.FileTypeIndex;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.indexing.FileBasedIndex;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleFile;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleInterfaceDefinition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SpaghettiModuleUtil {
    public static List<SpaghettiModuleInterfaceDefinition> findInterfaceDefinitions(Project project, String key) {
        List<SpaghettiModuleInterfaceDefinition> result = null;
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, SpaghettiModuleFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            SpaghettiModuleFile simpleFile = (SpaghettiModuleFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                SpaghettiModuleInterfaceDefinition[] properties = PsiTreeUtil.getChildrenOfType(simpleFile, SpaghettiModuleInterfaceDefinition.class);
                if (properties != null) {
                    for (SpaghettiModuleInterfaceDefinition interfaceDefinition : properties) {
                        if (key.equals(interfaceDefinition.getId())) {
                            if (result == null) {
                                result = new ArrayList<SpaghettiModuleInterfaceDefinition>();
                            }
                            result.add(interfaceDefinition);
                        }
                    }
                }
            }
        }
        return result != null ? result : Collections.<SpaghettiModuleInterfaceDefinition>emptyList();
    }

    public static List<SpaghettiModuleInterfaceDefinition> findInterfaceDefinitions(Project project) {
        List<SpaghettiModuleInterfaceDefinition> result = new ArrayList<SpaghettiModuleInterfaceDefinition>();
        Collection<VirtualFile> virtualFiles = FileBasedIndex.getInstance().getContainingFiles(FileTypeIndex.NAME, SpaghettiModuleFileType.INSTANCE,
                GlobalSearchScope.allScope(project));
        for (VirtualFile virtualFile : virtualFiles) {
            SpaghettiModuleFile simpleFile = (SpaghettiModuleFile) PsiManager.getInstance(project).findFile(virtualFile);
            if (simpleFile != null) {
                SpaghettiModuleInterfaceDefinition[] interfaceDefinitions = PsiTreeUtil.getChildrenOfType(simpleFile, SpaghettiModuleInterfaceDefinition.class);
                if (interfaceDefinitions != null) {
                    Collections.addAll(result, interfaceDefinitions);
                }
            }
        }
        return result;
    }
}
