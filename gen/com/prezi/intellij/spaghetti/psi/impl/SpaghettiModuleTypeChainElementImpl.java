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

public class SpaghettiModuleTypeChainElementImpl extends ASTWrapperPsiElement implements SpaghettiModuleTypeChainElement {

  public SpaghettiModuleTypeChainElementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitTypeChainElement(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SpaghettiModuleType getType() {
    return findChildByClass(SpaghettiModuleType.class);
  }

  @Override
  @Nullable
  public SpaghettiModuleTypeChain getTypeChain() {
    return findChildByClass(SpaghettiModuleTypeChain.class);
  }

}
