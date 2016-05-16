package com.renpylang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.renpylang.psi.RenpyTypes;
import com.intellij.psi.TokenType;

%%

%class RenpyLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\n|\r|\r\n
KEY=[a-z]+
VALUE=[a-z0-9]+
COMMENT="#"[^\r\n]*
WHITESPACE=[\s\t\f]
SEPARATOR=[:=]
LABEL="label"

%%

{COMMENT}         { yybegin(YYINITIAL); return RenpyTypes.COMMENT; }

{CRLF}+           { yybegin(YYINITIAL); return RenpyTypes.CRLF; }

{WHITESPACE}      { yybegin(YYINITIAL); return RenpyTypes.WHITESPACE; }

.               { return TokenType.BAD_CHARACTER; }