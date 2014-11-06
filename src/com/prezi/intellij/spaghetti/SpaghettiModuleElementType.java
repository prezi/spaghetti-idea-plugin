package com.prezi.intellij.spaghetti;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SpaghettiModuleElementType extends IElementType {
    public SpaghettiModuleElementType(@NotNull @NonNls String debugName) {
        super(debugName, SpaghettiModuleLanguage.INSTANCE);
    }
}