package com.renpylang;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class RenpyFileType extends LanguageFileType {
    public static final RenpyFileType INSTANCE = new RenpyFileType();

    private RenpyFileType() {
        super(Renpylang.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Ren'Py file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Ren'Py language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "rpy";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return RenpyIcons.FILE;
    }
}
