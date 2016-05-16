package com.renpylang.psi;

import com.intellij.psi.tree.IElementType;
import com.renpylang.Renpylang;
import org.jetbrains.annotations.*;

public class RenpyTokenType extends IElementType {
    public RenpyTokenType(@NotNull @NonNls String debugName) {
        super(debugName, Renpylang.INSTANCE);
    }

    @Override
    public String toString() {
        return "RenpyTokenType." + super.toString();
    }
}
