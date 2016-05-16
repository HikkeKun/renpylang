package com.renpylang.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import com.renpylang.*;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class RenpyFile extends PsiFileBase {
    public RenpyFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, Renpylang.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return RenpyFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Simple File";
    }

    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
