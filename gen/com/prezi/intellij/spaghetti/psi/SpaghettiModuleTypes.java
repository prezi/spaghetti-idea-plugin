// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.prezi.intellij.spaghetti.SpaghettiModuleElementType;
import com.prezi.intellij.spaghetti.SpaghettiModuleTokenType;
import com.prezi.intellij.spaghetti.psi.impl.*;

public interface SpaghettiModuleTypes {

  IElementType ANNOTATION = new SpaghettiModuleElementType("ANNOTATION");
  IElementType ANNOTATIONS = new SpaghettiModuleElementType("ANNOTATIONS");
  IElementType ANNOTATION_PARAMETER = new SpaghettiModuleElementType("ANNOTATION_PARAMETER");
  IElementType ANNOTATION_PARAMETERS = new SpaghettiModuleElementType("ANNOTATION_PARAMETERS");
  IElementType ANNOTATION_VALUE = new SpaghettiModuleElementType("ANNOTATION_VALUE");
  IElementType ARRAY_QUALIFIER = new SpaghettiModuleElementType("ARRAY_QUALIFIER");
  IElementType BOOL_VALUE = new SpaghettiModuleElementType("BOOL_VALUE");
  IElementType COMPLEX_TYPE = new SpaghettiModuleElementType("COMPLEX_TYPE");
  IElementType CONST_DEFINITION = new SpaghettiModuleElementType("CONST_DEFINITION");
  IElementType CONST_ENTRY = new SpaghettiModuleElementType("CONST_ENTRY");
  IElementType CONST_ENTRY_DECL = new SpaghettiModuleElementType("CONST_ENTRY_DECL");
  IElementType ENUM_DEFINITION = new SpaghettiModuleElementType("ENUM_DEFINITION");
  IElementType ENUM_VALUE = new SpaghettiModuleElementType("ENUM_VALUE");
  IElementType EXTERN_TYPE_DEFINITION = new SpaghettiModuleElementType("EXTERN_TYPE_DEFINITION");
  IElementType IMPORT_DECLARATION = new SpaghettiModuleElementType("IMPORT_DECLARATION");
  IElementType INTERFACE_DEFINITION = new SpaghettiModuleElementType("INTERFACE_DEFINITION");
  IElementType INTERFACE_METHOD_DEFINITION = new SpaghettiModuleElementType("INTERFACE_METHOD_DEFINITION");
  IElementType METHOD_DEFINITION = new SpaghettiModuleElementType("METHOD_DEFINITION");
  IElementType METHOD_PARAMETER = new SpaghettiModuleElementType("METHOD_PARAMETER");
  IElementType METHOD_PARAMETERS = new SpaghettiModuleElementType("METHOD_PARAMETERS");
  IElementType MODULE_ELEMENT = new SpaghettiModuleElementType("MODULE_ELEMENT");
  IElementType MODULE_METHOD_DEFINITION = new SpaghettiModuleElementType("MODULE_METHOD_DEFINITION");
  IElementType MODULE_SPEC = new SpaghettiModuleElementType("MODULE_SPEC");
  IElementType OBJECT_TYPE = new SpaghettiModuleElementType("OBJECT_TYPE");
  IElementType PRIMITIVE_TYPE = new SpaghettiModuleElementType("PRIMITIVE_TYPE");
  IElementType PROPERTY_DEFINITION = new SpaghettiModuleElementType("PROPERTY_DEFINITION");
  IElementType QUALIFIED_NAME = new SpaghettiModuleElementType("QUALIFIED_NAME");
  IElementType RETURN_TYPE = new SpaghettiModuleElementType("RETURN_TYPE");
  IElementType STRUCT_DEFINITION = new SpaghettiModuleElementType("STRUCT_DEFINITION");
  IElementType SUPER_INTERFACE_DEFINITION = new SpaghettiModuleElementType("SUPER_INTERFACE_DEFINITION");
  IElementType TYPE = new SpaghettiModuleElementType("TYPE");
  IElementType TYPE_ARGUMENTS = new SpaghettiModuleElementType("TYPE_ARGUMENTS");
  IElementType TYPE_CHAIN = new SpaghettiModuleElementType("TYPE_CHAIN");
  IElementType TYPE_CHAIN_ELEMENT = new SpaghettiModuleElementType("TYPE_CHAIN_ELEMENT");
  IElementType TYPE_CHAIN_ELEMENTS = new SpaghettiModuleElementType("TYPE_CHAIN_ELEMENTS");
  IElementType TYPE_CHAIN_RETURN_TYPE = new SpaghettiModuleElementType("TYPE_CHAIN_RETURN_TYPE");
  IElementType TYPE_DEFINITION = new SpaghettiModuleElementType("TYPE_DEFINITION");
  IElementType TYPE_NAME_PAIR = new SpaghettiModuleElementType("TYPE_NAME_PAIR");
  IElementType TYPE_PARAMETERS = new SpaghettiModuleElementType("TYPE_PARAMETERS");

  IElementType ANY = new SpaghettiModuleTokenType("any");
  IElementType AS = new SpaghettiModuleTokenType("AS");
  IElementType BOOL = new SpaghettiModuleTokenType("bool");
  IElementType CL = new SpaghettiModuleTokenType("{");
  IElementType COMMENT = new SpaghettiModuleTokenType("COMMENT");
  IElementType CONST = new SpaghettiModuleTokenType("const");
  IElementType CR = new SpaghettiModuleTokenType("}");
  IElementType ENUM = new SpaghettiModuleTokenType("enum");
  IElementType EXTENDS = new SpaghettiModuleTokenType("extends");
  IElementType EXTERN = new SpaghettiModuleTokenType("extern");
  IElementType FALSE = new SpaghettiModuleTokenType("false");
  IElementType FLOAT = new SpaghettiModuleTokenType("float");
  IElementType FLOATVALUE = new SpaghettiModuleTokenType("floatValue");
  IElementType ID = new SpaghettiModuleTokenType("id");
  IElementType IMPORT = new SpaghettiModuleTokenType("import");
  IElementType INT = new SpaghettiModuleTokenType("int");
  IElementType INTERFACE = new SpaghettiModuleTokenType("interface");
  IElementType INTVALUE = new SpaghettiModuleTokenType("intValue");
  IElementType MODULE = new SpaghettiModuleTokenType("module");
  IElementType NULL = new SpaghettiModuleTokenType("null");
  IElementType OPTIONAL = new SpaghettiModuleTokenType("?");
  IElementType PL = new SpaghettiModuleTokenType("(");
  IElementType PR = new SpaghettiModuleTokenType(")");
  IElementType STRING = new SpaghettiModuleTokenType("string");
  IElementType STRINGVALUE = new SpaghettiModuleTokenType("stringValue");
  IElementType STRUCT = new SpaghettiModuleTokenType("struct");
  IElementType TRUE = new SpaghettiModuleTokenType("true");
  IElementType VOID = new SpaghettiModuleTokenType("void");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ANNOTATION) {
        return new SpaghettiModuleAnnotationImpl(node);
      }
      else if (type == ANNOTATIONS) {
        return new SpaghettiModuleAnnotationsImpl(node);
      }
      else if (type == ANNOTATION_PARAMETER) {
        return new SpaghettiModuleAnnotationParameterImpl(node);
      }
      else if (type == ANNOTATION_PARAMETERS) {
        return new SpaghettiModuleAnnotationParametersImpl(node);
      }
      else if (type == ANNOTATION_VALUE) {
        return new SpaghettiModuleAnnotationValueImpl(node);
      }
      else if (type == ARRAY_QUALIFIER) {
        return new SpaghettiModuleArrayQualifierImpl(node);
      }
      else if (type == BOOL_VALUE) {
        return new SpaghettiModuleBoolValueImpl(node);
      }
      else if (type == COMPLEX_TYPE) {
        return new SpaghettiModuleComplexTypeImpl(node);
      }
      else if (type == CONST_DEFINITION) {
        return new SpaghettiModuleConstDefinitionImpl(node);
      }
      else if (type == CONST_ENTRY) {
        return new SpaghettiModuleConstEntryImpl(node);
      }
      else if (type == CONST_ENTRY_DECL) {
        return new SpaghettiModuleConstEntryDeclImpl(node);
      }
      else if (type == ENUM_DEFINITION) {
        return new SpaghettiModuleEnumDefinitionImpl(node);
      }
      else if (type == ENUM_VALUE) {
        return new SpaghettiModuleEnumValueImpl(node);
      }
      else if (type == EXTERN_TYPE_DEFINITION) {
        return new SpaghettiModuleExternTypeDefinitionImpl(node);
      }
      else if (type == IMPORT_DECLARATION) {
        return new SpaghettiModuleImportDeclarationImpl(node);
      }
      else if (type == INTERFACE_DEFINITION) {
        return new SpaghettiModuleInterfaceDefinitionImpl(node);
      }
      else if (type == INTERFACE_METHOD_DEFINITION) {
        return new SpaghettiModuleInterfaceMethodDefinitionImpl(node);
      }
      else if (type == METHOD_DEFINITION) {
        return new SpaghettiModuleMethodDefinitionImpl(node);
      }
      else if (type == METHOD_PARAMETER) {
        return new SpaghettiModuleMethodParameterImpl(node);
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
      else if (type == PROPERTY_DEFINITION) {
        return new SpaghettiModulePropertyDefinitionImpl(node);
      }
      else if (type == QUALIFIED_NAME) {
        return new SpaghettiModuleQualifiedNameImpl(node);
      }
      else if (type == RETURN_TYPE) {
        return new SpaghettiModuleReturnTypeImpl(node);
      }
      else if (type == STRUCT_DEFINITION) {
        return new SpaghettiModuleStructDefinitionImpl(node);
      }
      else if (type == SUPER_INTERFACE_DEFINITION) {
        return new SpaghettiModuleSuperInterfaceDefinitionImpl(node);
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
      else if (type == TYPE_DEFINITION) {
        return new SpaghettiModuleTypeDefinitionImpl(node);
      }
      else if (type == TYPE_NAME_PAIR) {
        return new SpaghettiModuleTypeNamePairImpl(node);
      }
      else if (type == TYPE_PARAMETERS) {
        return new SpaghettiModuleTypeParametersImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
