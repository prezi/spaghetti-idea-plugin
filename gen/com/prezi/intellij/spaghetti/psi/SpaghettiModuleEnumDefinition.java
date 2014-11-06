// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleEnumDefinition extends PsiElement {

  @Nullable
  SpaghettiModuleAnnotations getAnnotations();

  @NotNull
  List<SpaghettiModuleEnumValue> getEnumValueList();

  @NotNull
  PsiElement getId();

}
