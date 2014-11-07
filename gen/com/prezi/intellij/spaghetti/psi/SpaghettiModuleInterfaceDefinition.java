// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleInterfaceDefinition extends SpaghettiModuleNamedElement {

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

  String getName();

  PsiElement getNameIdentifier();

  PsiElement setName(String newName);

}
