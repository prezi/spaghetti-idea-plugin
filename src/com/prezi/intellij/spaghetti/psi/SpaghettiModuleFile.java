package com.prezi.intellij.spaghetti.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.prezi.intellij.spaghetti.SpaghettiModuleFileType;
import com.prezi.intellij.spaghetti.SpaghettiModuleLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class SpaghettiModuleFile extends PsiFileBase {
    public SpaghettiModuleFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, SpaghettiModuleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return SpaghettiModuleFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "SpaghettiModule File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}