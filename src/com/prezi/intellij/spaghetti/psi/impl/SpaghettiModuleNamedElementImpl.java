package com.prezi.intellij.spaghetti.psi.impl;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleNamedElement;
import org.jetbrains.annotations.NotNull;

public abstract class SpaghettiModuleNamedElementImpl extends ASTWrapperPsiElement implements SpaghettiModuleNamedElement {
    public SpaghettiModuleNamedElementImpl(@NotNull ASTNode node) {
        super(node);
    }
}
