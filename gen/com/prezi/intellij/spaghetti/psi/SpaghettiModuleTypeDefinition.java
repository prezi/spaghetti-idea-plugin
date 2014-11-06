// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface SpaghettiModuleTypeDefinition extends PsiElement {

  @Nullable
  SpaghettiModuleConstDefinition getConstDefinition();

  @Nullable
  SpaghettiModuleEnumDefinition getEnumDefinition();

  @Nullable
  SpaghettiModuleInterfaceDefinition getInterfaceDefinition();

  @Nullable
  SpaghettiModuleStructDefinition getStructDefinition();

}
