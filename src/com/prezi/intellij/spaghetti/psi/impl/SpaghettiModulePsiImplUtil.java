package com.prezi.intellij.spaghetti.psi.impl;

import com.prezi.intellij.spaghetti.psi.*;

public class SpaghettiModulePsiImplUtil {
    public static String getName(SpaghettiModuleInterfaceDefinition element) {
        return element.getId().getText();
    }

}
