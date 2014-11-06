// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.prezi.intellij.spaghetti.SpaghettiModuleElementType;
import com.prezi.intellij.spaghetti.SpaghettiModuleTokenType;
import com.prezi.intellij.spaghetti.psi.impl.*;

public interface SpaghettiModuleTypes {

  IElementType ARRAY_QUALIFIER = new SpaghettiModuleElementType("ARRAY_QUALIFIER");
  IElementType BOOL_TYPE = new SpaghettiModuleElementType("BOOL_TYPE");
  IElementType COMPLEX_TYPE = new SpaghettiModuleElementType("COMPLEX_TYPE");
  IElementType EXTERN_TYPE_DEFINITION = new SpaghettiModuleElementType("EXTERN_TYPE_DEFINITION");
  IElementType IMPORT_DECLARATION = new SpaghettiModuleElementType("IMPORT_DECLARATION");
  IElementType METHOD_DEFINITION = new SpaghettiModuleElementType("METHOD_DEFINITION");
  IElementType METHOD_PARAMETERS = new SpaghettiModuleElementType("METHOD_PARAMETERS");
  IElementType MODULE_ELEMENT = new SpaghettiModuleElementType("MODULE_ELEMENT");
  IElementType MODULE_METHOD_DEFINITION = new SpaghettiModuleElementType("MODULE_METHOD_DEFINITION");
  IElementType MODULE_SPEC = new SpaghettiModuleElementType("MODULE_SPEC");
  IElementType OBJECT_TYPE = new SpaghettiModuleElementType("OBJECT_TYPE");
  IElementType PRIMITIVE_TYPE = new SpaghettiModuleElementType("PRIMITIVE_TYPE");
  IElementType QUALIFIED_NAME = new SpaghettiModuleElementType("QUALIFIED_NAME");
  IElementType RETURN_TYPE = new SpaghettiModuleElementType("RETURN_TYPE");
  IElementType TYPE = new SpaghettiModuleElementType("TYPE");
  IElementType TYPE_ARGUMENTS = new SpaghettiModuleElementType("TYPE_ARGUMENTS");
  IElementType TYPE_CHAIN = new SpaghettiModuleElementType("TYPE_CHAIN");
  IElementType TYPE_CHAIN_ELEMENT = new SpaghettiModuleElementType("TYPE_CHAIN_ELEMENT");
  IElementType TYPE_CHAIN_ELEMENTS = new SpaghettiModuleElementType("TYPE_CHAIN_ELEMENTS");
  IElementType TYPE_CHAIN_RETURN_TYPE = new SpaghettiModuleElementType("TYPE_CHAIN_RETURN_TYPE");
  IElementType TYPE_PARAMETERS = new SpaghettiModuleElementType("TYPE_PARAMETERS");

  IElementType ANY = new SpaghettiModuleTokenType("any");
  IElementType AS = new SpaghettiModuleTokenType("AS");
  IElementType CL = new SpaghettiModuleTokenType("{");
  IElementType CR = new SpaghettiModuleTokenType("}");
  IElementType EXTERN = new SpaghettiModuleTokenType("extern");
  IElementType FALSE = new SpaghettiModuleTokenType("false");
  IElementType ID = new SpaghettiModuleTokenType("ID");
  IElementType IMPORT = new SpaghettiModuleTokenType("import");
  IElementType INTERFACE = new SpaghettiModuleTokenType("interface");
  IElementType METHODPARAMETER = new SpaghettiModuleTokenType("methodParameter");
  IElementType MODULE = new SpaghettiModuleTokenType("module");
  IElementType TRUE = new SpaghettiModuleTokenType("true");
  IElementType VOID = new SpaghettiModuleTokenType("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARRAY_QUALIFIER) {
        return new SpaghettiModuleArrayQualifierImpl(node);
      }
      else if (type == BOOL_TYPE) {
        return new SpaghettiModuleBoolTypeImpl(node);
      }
      else if (type == COMPLEX_TYPE) {
        return new SpaghettiModuleComplexTypeImpl(node);
      }
      else if (type == EXTERN_TYPE_DEFINITION) {
        return new SpaghettiModuleExternTypeDefinitionImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new SpaghettiModuleImportDeclarationImpl(node);
      }
      else if (type == METHOD_DEFINITION) {
        return new SpaghettiModuleMethodDefinitionImpl(node);
      }
      else if (type == METHOD_PARAMETERS) {
        return new SpaghettiModuleMethodParametersImpl(node);
      }
      else if (type == MODULE_ELEMENT) {
        return new SpaghettiModuleModuleElementImpl(node);
      }
      else if (type == MODULE_METHOD_DEFINITION) {
        return new SpaghettiModuleModuleMethodDefinitionImpl(node);
      }
      else if (type == MODULE_SPEC) {
        return new SpaghettiModuleModuleSpecImpl(node);
      }
      else if (type == OBJECT_TYPE) {
        return new SpaghettiModuleObjectTypeImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new SpaghettiModulePrimitiveTypeImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new SpaghettiModuleQualifiedNameImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new SpaghettiModuleReturnTypeImpl(node);
      }
      else if (type == TYPE) {
        return new SpaghettiModuleTypeImpl(node);
      }
      else if (type == TYPE_ARGUMENTS) {
        return new SpaghettiModuleTypeArgumentsImpl(node);
      }
      else if (type == TYPE_CHAIN) {
        return new SpaghettiModuleTypeChainImpl(node);
      }
      else if (type == TYPE_CHAIN_ELEMENT) {
        return new SpaghettiModuleTypeChainElementImpl(node);
      }
      else if (type == TYPE_CHAIN_ELEMENTS) {
        return new SpaghettiModuleTypeChainElementsImpl(node);
      }
      else if (type == TYPE_CHAIN_RETURN_TYPE) {
        return new SpaghettiModuleTypeChainReturnTypeImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new SpaghettiModuleTypeParametersImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
