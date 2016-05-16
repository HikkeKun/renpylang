// This is a generated file. Not intended for manual editing.
package com.renpylang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.renpylang.psi.impl.*;

public interface RenpyTypes {

  IElementType KEY_VALUE = new RenpyElementType("KEY_VALUE");
  IElementType LABELDEF = new RenpyElementType("LABELDEF");

  IElementType COMMENT = new RenpyTokenType("COMMENT");
  IElementType CRLF = new RenpyTokenType("CRLF");
  IElementType KEY = new RenpyTokenType("KEY");
  IElementType LABEL = new RenpyTokenType("LABEL");
  IElementType SEPARATOR = new RenpyTokenType("SEPARATOR");
  IElementType VALUE = new RenpyTokenType("VALUE");
  IElementType WHITESPACE = new RenpyTokenType("WHITESPACE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == KEY_VALUE) {
        return new RenpyKeyValueImpl(node);
      }
      else if (type == LABELDEF) {
        return new RenpyLabeldefImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
