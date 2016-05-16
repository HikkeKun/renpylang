package com.renpylang.psi;

import com.intellij.psi.tree.IElementType;
import com.renpylang.Renpylang;
import org.jetbrains.annotations.*;

public class RenpyElementType extends IElementType {
    public RenpyElementType(@NotNull @NonNls String debugName) {
        super(debugName, Renpylang.INSTANCE);
    }
}
