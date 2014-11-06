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

public class SpaghettiModuleTypeArgumentsImpl extends ASTWrapperPsiElement implements SpaghettiModuleTypeArguments {

  public SpaghettiModuleTypeArgumentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitTypeArguments(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<SpaghettiModuleReturnType> getReturnTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SpaghettiModuleReturnType.class);
  }

}
