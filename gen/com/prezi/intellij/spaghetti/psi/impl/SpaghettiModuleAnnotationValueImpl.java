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

public class SpaghettiModuleAnnotationValueImpl extends ASTWrapperPsiElement implements SpaghettiModuleAnnotationValue {

  public SpaghettiModuleAnnotationValueImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitAnnotationValue(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SpaghettiModuleBoolValue getBoolValue() {
    return findChildByClass(SpaghettiModuleBoolValue.class);
  }

  @Override
  @Nullable
  public PsiElement getFloatValue() {
    return findChildByType(FLOATVALUE);
  }

  @Override
  @Nullable
  public PsiElement getIntValue() {
    return findChildByType(INTVALUE);
  }

  @Override
  @Nullable
  public PsiElement getStringValue() {
    return findChildByType(STRINGVALUE);
  }

}
