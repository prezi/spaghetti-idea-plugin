// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleTypeChainElements extends PsiElement {

  @NotNull
  List<SpaghettiModuleTypeChainElement> getTypeChainElementList();

  @NotNull
  SpaghettiModuleTypeChainReturnType getTypeChainReturnType();

  @Nullable
  PsiElement getVoid();

}
