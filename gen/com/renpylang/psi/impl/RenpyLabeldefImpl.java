// This is a generated file. Not intended for manual editing.
package com.renpylang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.renpylang.psi.RenpyTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.renpylang.psi.*;

public class RenpyLabeldefImpl extends ASTWrapperPsiElement implements RenpyLabeldef {

  public RenpyLabeldefImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RenpyVisitor visitor) {
    visitor.visitLabeldef(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RenpyVisitor) accept((RenpyVisitor)visitor);
    else super.accept(visitor);
  }

}
