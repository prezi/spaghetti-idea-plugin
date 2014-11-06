package com.prezi.intellij.spaghetti;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SpaghettiModuleFileType extends LanguageFileType {
    public static final SpaghettiModuleFileType INSTANCE = new SpaghettiModuleFileType();

    private SpaghettiModuleFileType() {
        super(SpaghettiModuleLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "SpaghettiModule file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "SpaghettiModule language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "module";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SpaghettiModuleIcons.FILE;
    }
}