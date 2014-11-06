package com.prezi.intellij.spaghetti;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class SpaghettiModuleTokenType extends IElementType {
    public SpaghettiModuleTokenType(@NotNull @NonNls String debugName) {
        super(debugName, SpaghettiModuleLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "SpaghettiModuleTokenType." + super.toString();
    }
}
