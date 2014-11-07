package com.prezi.intellij.spaghetti;

import com.intellij.lang.refactoring.RefactoringSupportProvider;
import com.intellij.psi.PsiElement;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleInterfaceDefinition;

public class SpaghettiModuleRefactoringSupportProvider extends RefactoringSupportProvider {
    @Override
    public boolean isMemberInplaceRenameAvailable(PsiElement element, PsiElement context) {
        return element instanceof SpaghettiModuleInterfaceDefinition;
    }
}
