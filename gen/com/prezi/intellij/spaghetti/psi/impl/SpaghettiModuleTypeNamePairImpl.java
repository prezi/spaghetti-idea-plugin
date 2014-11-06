// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.prezi.intellij.spaghetti.psi.*;

public class SpaghettiModuleTypeNamePairImpl extends ASTWrapperPsiElement implements SpaghettiModuleTypeNamePair {

  public SpaghettiModuleTypeNamePairImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitTypeNamePair(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public SpaghettiModuleComplexType getComplexType() {
    return findNotNullChildByClass(SpaghettiModuleComplexType.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
