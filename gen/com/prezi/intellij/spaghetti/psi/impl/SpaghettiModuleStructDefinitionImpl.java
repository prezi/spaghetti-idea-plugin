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

public class SpaghettiModuleStructDefinitionImpl extends ASTWrapperPsiElement implements SpaghettiModuleStructDefinition {

  public SpaghettiModuleStructDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitStructDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SpaghettiModuleAnnotations getAnnotations() {
    return findChildByClass(SpaghettiModuleAnnotations.class);
  }

  @Override
  @NotNull
  public List<SpaghettiModulePropertyDefinition> getPropertyDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SpaghettiModulePropertyDefinition.class);
  }

  @Override
  @Nullable
  public SpaghettiModuleTypeParameters getTypeParameters() {
    return findChildByClass(SpaghettiModuleTypeParameters.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

  @Override
  @NotNull
  public PsiElement getStruct() {
    return findNotNullChildByType(STRUCT);
  }

}