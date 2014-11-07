// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes.*;
import com.prezi.intellij.spaghetti.psi.*;

public class SpaghettiModuleInterfaceDefinitionImpl extends SpaghettiModuleNamedElementImpl implements SpaghettiModuleInterfaceDefinition {

  public SpaghettiModuleInterfaceDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitInterfaceDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SpaghettiModuleAnnotations getAnnotations() {
    return findChildByClass(SpaghettiModuleAnnotations.class);
  }

  @Override
  @NotNull
  public List<SpaghettiModuleInterfaceMethodDefinition> getInterfaceMethodDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SpaghettiModuleInterfaceMethodDefinition.class);
  }

  @Override
  @NotNull
  public List<SpaghettiModuleSuperInterfaceDefinition> getSuperInterfaceDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SpaghettiModuleSuperInterfaceDefinition.class);
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
  @Nullable
  public PsiElement getExtends() {
    return findChildByType(EXTENDS);
  }

  @Override
  @NotNull
  public PsiElement getInterface() {
    return findNotNullChildByType(INTERFACE);
  }

  public String getName() {
    return SpaghettiModulePsiImplUtil.getName(this);
  }

  public PsiElement getNameIdentifier() {
    return SpaghettiModulePsiImplUtil.getNameIdentifier(this);
  }

  public PsiElement setName(String newName) {
    return SpaghettiModulePsiImplUtil.setName(this, newName);
  }

}
