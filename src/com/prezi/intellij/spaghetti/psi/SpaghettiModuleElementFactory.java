package com.prezi.intellij.spaghetti.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFileFactory;
import com.prezi.intellij.spaghetti.SpaghettiModuleFileType;

public class SpaghettiModuleElementFactory {
    public static SpaghettiModuleInterfaceDefinition createInterfaceDefinition(Project project, String name) {
        final SpaghettiModuleFile file = createFile(project, name);
        return (SpaghettiModuleInterfaceDefinition) file.getFirstChild();
    }

    public static SpaghettiModuleFile createFile(Project project, String text) {
        String name = "dummy.module";
        return (SpaghettiModuleFile) PsiFileFactory.getInstance(project).createFileFromText(name, SpaghettiModuleFileType.INSTANCE, text);
    }

}
