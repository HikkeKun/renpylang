// This is a generated file. Not intended for manual editing.
package com.renpylang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.renpylang.psi.RenpyTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class RenpyParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == LABELDEF) {
      r = LABELDEF(b, 0);
    }
    else if (t == KEY_VALUE) {
      r = key_value(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return string_def(b, l + 1);
  }

  /* ********************************************************** */
  // LABEL KEY SEPARATOR? CRLF
  public static boolean LABELDEF(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LABELDEF")) return false;
    if (!nextTokenIs(b, LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LABEL, KEY);
    r = r && LABELDEF_2(b, l + 1);
    r = r && consumeToken(b, CRLF);
    exit_section_(b, m, LABELDEF, r);
    return r;
  }

  // SEPARATOR?
  private static boolean LABELDEF_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LABELDEF_2")) return false;
    consumeToken(b, SEPARATOR);
    return true;
  }

  /* ********************************************************** */
  // KEY VALUE (WHITESPACE) CRLF
  public static boolean key_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "key_value")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KEY, VALUE);
    r = r && consumeToken(b, WHITESPACE);
    r = r && consumeToken(b, CRLF);
    exit_section_(b, m, KEY_VALUE, r);
    return r;
  }

  /* ********************************************************** */
  // LABELDEF|COMMENT|CRLF
  static boolean string_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_def")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LABELDEF(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

}
