package com.prezi.intellij.spaghetti.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.prezi.intellij.spaghetti.psi.*;

public class SpaghettiModulePsiImplUtil {
    public static String getName(SpaghettiModuleInterfaceDefinition element) {
        return element.getId().getText();
    }

    public static PsiElement getNameIdentifier(SpaghettiModuleInterfaceDefinition element) {
        return element.getId();
//        ASTNode keyNode = element.getNode().findChildByType(SpaghettiModuleTypes.ID);
//        if (keyNode != null) {
//            return keyNode.getPsi();
//        } else {
//            return null;
//        }
    }

    public static PsiElement setName(SpaghettiModuleInterfaceDefinition element, String newName) {
        ASTNode keyNode = element.getNode().findChildByType(SpaghettiModuleTypes.ID);
        if (keyNode != null) {
            SpaghettiModuleInterfaceDefinition interfaceDefinition = SpaghettiModuleElementFactory.createInterfaceDefinition(element.getProject(), newName);
            ASTNode newKeyNode = interfaceDefinition.getFirstChild().getNode();
            element.getNode().replaceChild(keyNode, newKeyNode);
        }
        return element;
    }
}
