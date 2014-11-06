// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleExternTypeDefinition extends PsiElement {

  @Nullable
  SpaghettiModuleAnnotations getAnnotations();

  @NotNull
  SpaghettiModuleQualifiedName getQualifiedName();

  @NotNull
  PsiElement getExtern();

  @NotNull
  PsiElement getInterface();

}
