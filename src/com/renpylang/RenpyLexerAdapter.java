package com.renpylang;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class RenpyLexerAdapter extends FlexAdapter {
    public RenpyLexerAdapter() {
        super(new RenpyLexer((Reader) null));
    }
}
