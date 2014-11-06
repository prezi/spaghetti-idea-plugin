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

public class SpaghettiModuleTypeDefinitionImpl extends ASTWrapperPsiElement implements SpaghettiModuleTypeDefinition {

  public SpaghettiModuleTypeDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitTypeDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SpaghettiModuleConstDefinition getConstDefinition() {
    return findChildByClass(SpaghettiModuleConstDefinition.class);
  }

  @Override
  @Nullable
  public SpaghettiModuleEnumDefinition getEnumDefinition() {
    return findChildByClass(SpaghettiModuleEnumDefinition.class);
  }

  @Override
  @Nullable
  public SpaghettiModuleInterfaceDefinition getInterfaceDefinition() {
    return findChildByClass(SpaghettiModuleInterfaceDefinition.class);
  }

  @Override
  @Nullable
  public SpaghettiModuleStructDefinition getStructDefinition() {
    return findChildByClass(SpaghettiModuleStructDefinition.class);
  }

}
