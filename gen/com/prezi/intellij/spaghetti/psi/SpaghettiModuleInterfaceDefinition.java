// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleInterfaceDefinition extends PsiElement {

  @Nullable
  SpaghettiModuleAnnotations getAnnotations();

  @NotNull
  List<SpaghettiModuleInterfaceMethodDefinition> getInterfaceMethodDefinitionList();

  @NotNull
  List<SpaghettiModuleSuperInterfaceDefinition> getSuperInterfaceDefinitionList();

  @Nullable
  SpaghettiModuleTypeParameters getTypeParameters();

  @NotNull
  PsiElement getId();

  @Nullable
  PsiElement getExtends();

  @NotNull
  PsiElement getInterface();

}
