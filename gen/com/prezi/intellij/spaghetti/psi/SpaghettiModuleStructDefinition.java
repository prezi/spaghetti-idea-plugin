// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleStructDefinition extends PsiElement {

  @Nullable
  SpaghettiModuleAnnotations getAnnotations();

  @NotNull
  List<SpaghettiModulePropertyDefinition> getPropertyDefinitionList();

  @Nullable
  SpaghettiModuleTypeParameters getTypeParameters();

  @NotNull
  PsiElement getId();

  @NotNull
  PsiElement getStruct();

}
