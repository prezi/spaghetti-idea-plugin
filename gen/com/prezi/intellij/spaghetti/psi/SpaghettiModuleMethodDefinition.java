// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleMethodDefinition extends PsiElement {

  @Nullable
  SpaghettiModuleAnnotations getAnnotations();

  @Nullable
  SpaghettiModuleMethodParameters getMethodParameters();

  @NotNull
  SpaghettiModuleReturnType getReturnType();

  @Nullable
  SpaghettiModuleTypeParameters getTypeParameters();

  @NotNull
  PsiElement getId();

}
