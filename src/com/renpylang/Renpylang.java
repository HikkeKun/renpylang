package com.renpylang;

import com.intellij.lang.Language;

public class Renpylang extends Language {
    public static final Renpylang INSTANCE = new Renpylang();

    private Renpylang() {
        super("Ren'Py");
    }
}
