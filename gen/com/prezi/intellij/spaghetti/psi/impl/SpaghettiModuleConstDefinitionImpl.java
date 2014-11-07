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

public class SpaghettiModuleConstDefinitionImpl extends ASTWrapperPsiElement implements SpaghettiModuleConstDefinition {

  public SpaghettiModuleConstDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof SpaghettiModuleVisitor) ((SpaghettiModuleVisitor)visitor).visitConstDefinition(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public SpaghettiModuleAnnotations getAnnotations() {
    return findChildByClass(SpaghettiModuleAnnotations.class);
  }

  @Override
  @NotNull
  public List<SpaghettiModuleConstEntry> getConstEntryList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, SpaghettiModuleConstEntry.class);
  }

  @Override
  @NotNull
  public PsiElement getId() {
    return findNotNullChildByType(ID);
  }

}
