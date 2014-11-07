// This is a generated file. Not intended for manual editing.
package com.prezi.intellij.spaghetti.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class SpaghettiModuleParser implements PsiParser {

  public static final Logger LOG_ = Logger.getInstance("com.prezi.intellij.spaghetti.parser.SpaghettiModuleParser");

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, null);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    if (root_ == ARRAY_QUALIFIER) {
      result_ = ArrayQualifier(builder_, 0);
    }
    else if (root_ == ANNOTATION) {
      result_ = annotation(builder_, 0);
    }
    else if (root_ == ANNOTATION_PARAMETER) {
      result_ = annotationParameter(builder_, 0);
    }
    else if (root_ == ANNOTATION_PARAMETERS) {
      result_ = annotationParameters(builder_, 0);
    }
    else if (root_ == ANNOTATION_VALUE) {
      result_ = annotationValue(builder_, 0);
    }
    else if (root_ == ANNOTATIONS) {
      result_ = annotations(builder_, 0);
    }
    else if (root_ == BOOL_VALUE) {
      result_ = boolValue(builder_, 0);
    }
    else if (root_ == COMPLEX_TYPE) {
      result_ = complexType(builder_, 0);
    }
    else if (root_ == CONST_DEFINITION) {
      result_ = constDefinition(builder_, 0);
    }
    else if (root_ == CONST_ENTRY) {
      result_ = constEntry(builder_, 0);
    }
    else if (root_ == CONST_ENTRY_DECL) {
      result_ = constEntryDecl(builder_, 0);
    }
    else if (root_ == ENUM_DEFINITION) {
      result_ = enumDefinition(builder_, 0);
    }
    else if (root_ == ENUM_VALUE) {
      result_ = enumValue(builder_, 0);
    }
    else if (root_ == EXTERN_TYPE_DEFINITION) {
      result_ = externTypeDefinition(builder_, 0);
    }
    else if (root_ == IMPORT_DECLARATION) {
      result_ = importDeclaration(builder_, 0);
    }
    else if (root_ == INTERFACE_DEFINITION) {
      result_ = interfaceDefinition(builder_, 0);
    }
    else if (root_ == INTERFACE_METHOD_DEFINITION) {
      result_ = interfaceMethodDefinition(builder_, 0);
    }
    else if (root_ == METHOD_DEFINITION) {
      result_ = methodDefinition(builder_, 0);
    }
    else if (root_ == METHOD_PARAMETER) {
      result_ = methodParameter(builder_, 0);
    }
    else if (root_ == METHOD_PARAMETERS) {
      result_ = methodParameters(builder_, 0);
    }
    else if (root_ == MODULE_ELEMENT) {
      result_ = moduleElement(builder_, 0);
    }
    else if (root_ == MODULE_METHOD_DEFINITION) {
      result_ = moduleMethodDefinition(builder_, 0);
    }
    else if (root_ == MODULE_SPEC) {
      result_ = moduleSpec(builder_, 0);
    }
    else if (root_ == OBJECT_TYPE) {
      result_ = objectType(builder_, 0);
    }
    else if (root_ == PRIMITIVE_TYPE) {
      result_ = primitiveType(builder_, 0);
    }
    else if (root_ == PROPERTY_DEFINITION) {
      result_ = propertyDefinition(builder_, 0);
    }
    else if (root_ == QUALIFIED_NAME) {
      result_ = qualifiedName(builder_, 0);
    }
    else if (root_ == RETURN_TYPE) {
      result_ = returnType(builder_, 0);
    }
    else if (root_ == STRUCT_DEFINITION) {
      result_ = structDefinition(builder_, 0);
    }
    else if (root_ == SUPER_INTERFACE_DEFINITION) {
      result_ = superInterfaceDefinition(builder_, 0);
    }
    else if (root_ == TYPE) {
      result_ = type(builder_, 0);
    }
    else if (root_ == TYPE_ARGUMENTS) {
      result_ = typeArguments(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN) {
      result_ = typeChain(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN_ARGUMENTS) {
      result_ = typeChainArguments(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN_ELEMENT) {
      result_ = typeChainElement(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN_ELEMENTS) {
      result_ = typeChainElements(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN_RETURN_TYPE) {
      result_ = typeChainReturnType(builder_, 0);
    }
    else if (root_ == TYPE_DEFINITION) {
      result_ = typeDefinition(builder_, 0);
    }
    else if (root_ == TYPE_NAME_PAIR) {
      result_ = typeNamePair(builder_, 0);
    }
    else if (root_ == TYPE_PARAMETERS) {
      result_ = typeParameters(builder_, 0);
    }
    else {
      result_ = parse_root_(root_, builder_, 0);
    }
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return SpaghettiModuleDefinition(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // '[' ']'
  public static boolean ArrayQualifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayQualifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<array qualifier>");
    result_ = consumeToken(builder_, "[");
    result_ = result_ && consumeToken(builder_, "]");
    exit_section_(builder_, level_, marker_, ARRAY_QUALIFIER, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // annotations?
  // 	'module' moduleSpec
  // 	moduleElement*
  static boolean SpaghettiModuleDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SpaghettiModuleDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SpaghettiModuleDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, MODULE);
    result_ = result_ && moduleSpec(builder_, level_ + 1);
    result_ = result_ && SpaghettiModuleDefinition_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // annotations?
  private static boolean SpaghettiModuleDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SpaghettiModuleDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // moduleElement*
  private static boolean SpaghettiModuleDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SpaghettiModuleDefinition_3")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!moduleElement(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "SpaghettiModuleDefinition_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // '@' ID (PL annotationParameters? PR)?
  public static boolean annotation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<annotation>");
    result_ = consumeToken(builder_, "@");
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && annotation_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ANNOTATION, result_, false, null);
    return result_;
  }

  // (PL annotationParameters? PR)?
  private static boolean annotation_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2")) return false;
    annotation_2_0(builder_, level_ + 1);
    return true;
  }

  // PL annotationParameters? PR
  private static boolean annotation_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PL);
    result_ = result_ && annotation_2_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // annotationParameters?
  private static boolean annotation_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotation_2_0_1")) return false;
    annotationParameters(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ID '=' annotationValue
  public static boolean annotationParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationParameter")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && annotationValue(builder_, level_ + 1);
    exit_section_(builder_, marker_, ANNOTATION_PARAMETER, result_);
    return result_;
  }

  /* ********************************************************** */
  // annotationValue | annotationParameter ( ',' annotationParameter )*
  public static boolean annotationParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationParameters")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<annotation parameters>");
    result_ = annotationValue(builder_, level_ + 1);
    if (!result_) result_ = annotationParameters_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, ANNOTATION_PARAMETERS, result_, false, null);
    return result_;
  }

  // annotationParameter ( ',' annotationParameter )*
  private static boolean annotationParameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationParameters_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = annotationParameter(builder_, level_ + 1);
    result_ = result_ && annotationParameters_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' annotationParameter )*
  private static boolean annotationParameters_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationParameters_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!annotationParameters_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "annotationParameters_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' annotationParameter
  private static boolean annotationParameters_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationParameters_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && annotationParameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // null | boolValue | intValue | floatValue | stringValue
  public static boolean annotationValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotationValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<annotation value>");
    result_ = consumeToken(builder_, NULL);
    if (!result_) result_ = boolValue(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, INTVALUE);
    if (!result_) result_ = consumeToken(builder_, FLOATVALUE);
    if (!result_) result_ = consumeToken(builder_, STRINGVALUE);
    exit_section_(builder_, level_, marker_, ANNOTATION_VALUE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // annotation+
  public static boolean annotations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "annotations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<annotations>");
    result_ = annotation(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!annotation(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "annotations", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, level_, marker_, ANNOTATIONS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // true | false
  public static boolean boolValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "boolValue")) return false;
    if (!nextTokenIs(builder_, "<bool value>", FALSE, TRUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bool value>");
    result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    exit_section_(builder_, level_, marker_, BOOL_VALUE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // typeChain | type
  public static boolean complexType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "complexType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<complex type>");
    result_ = typeChain(builder_, level_ + 1);
    if (!result_) result_ = type(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPLEX_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // annotations? const ID '{' constEntry* '}'
  public static boolean constDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<const definition>");
    result_ = constDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, CONST, ID);
    result_ = result_ && consumeToken(builder_, CL);
    result_ = result_ && constDefinition_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CR);
    exit_section_(builder_, level_, marker_, CONST_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean constDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // constEntry*
  private static boolean constDefinition_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constDefinition_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!constEntry(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constDefinition_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // annotations? constEntryDecl
  public static boolean constEntry(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntry")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<const entry>");
    result_ = constEntry_0(builder_, level_ + 1);
    result_ = result_ && constEntryDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONST_ENTRY, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean constEntry_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntry_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // bool? ID '=' boolValue
  // 	| int? ID '=' intValue
  // 	| float? ID '=' floatValue
  // 	| string? ID '=' stringValue
  public static boolean constEntryDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<const entry decl>");
    result_ = constEntryDecl_0(builder_, level_ + 1);
    if (!result_) result_ = constEntryDecl_1(builder_, level_ + 1);
    if (!result_) result_ = constEntryDecl_2(builder_, level_ + 1);
    if (!result_) result_ = constEntryDecl_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, CONST_ENTRY_DECL, result_, false, null);
    return result_;
  }

  // bool? ID '=' boolValue
  private static boolean constEntryDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constEntryDecl_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && boolValue(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // bool?
  private static boolean constEntryDecl_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_0_0")) return false;
    consumeToken(builder_, BOOL);
    return true;
  }

  // int? ID '=' intValue
  private static boolean constEntryDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constEntryDecl_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && consumeToken(builder_, INTVALUE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // int?
  private static boolean constEntryDecl_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_1_0")) return false;
    consumeToken(builder_, INT);
    return true;
  }

  // float? ID '=' floatValue
  private static boolean constEntryDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constEntryDecl_2_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && consumeToken(builder_, FLOATVALUE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // float?
  private static boolean constEntryDecl_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_2_0")) return false;
    consumeToken(builder_, FLOAT);
    return true;
  }

  // string? ID '=' stringValue
  private static boolean constEntryDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = constEntryDecl_3_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, "=");
    result_ = result_ && consumeToken(builder_, STRINGVALUE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // string?
  private static boolean constEntryDecl_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constEntryDecl_3_0")) return false;
    consumeToken(builder_, STRING);
    return true;
  }

  /* ********************************************************** */
  // annotations? 'enum' ID '{'	enumValue* '}'
  public static boolean enumDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum definition>");
    result_ = enumDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ENUM);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, CL);
    result_ = result_ && enumDefinition_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CR);
    exit_section_(builder_, level_, marker_, ENUM_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean enumDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // enumValue*
  private static boolean enumDefinition_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumDefinition_4")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!enumValue(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "enumDefinition_4", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // annotations? ID
  public static boolean enumValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<enum value>");
    result_ = enumValue_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    exit_section_(builder_, level_, marker_, ENUM_VALUE, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean enumValue_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumValue_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // annotations? extern interface qualifiedName
  public static boolean externTypeDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "externTypeDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<extern type definition>");
    result_ = externTypeDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, EXTERN, INTERFACE);
    result_ = result_ && qualifiedName(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, EXTERN_TYPE_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean externTypeDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "externTypeDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // import qualifiedName (AS ID)?
  public static boolean importDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importDeclaration")) return false;
    if (!nextTokenIs(builder_, IMPORT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPORT);
    result_ = result_ && qualifiedName(builder_, level_ + 1);
    result_ = result_ && importDeclaration_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, IMPORT_DECLARATION, result_);
    return result_;
  }

  // (AS ID)?
  private static boolean importDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importDeclaration_2")) return false;
    importDeclaration_2_0(builder_, level_ + 1);
    return true;
  }

  // AS ID
  private static boolean importDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "importDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AS, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // annotations?
  // 	interface ID typeParameters?
  // 	( extends superInterfaceDefinition ( ',' superInterfaceDefinition )* )?
  // 	'{' interfaceMethodDefinition* '}'
  public static boolean interfaceDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<interface definition>");
    result_ = interfaceDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, INTERFACE, ID);
    result_ = result_ && interfaceDefinition_3(builder_, level_ + 1);
    result_ = result_ && interfaceDefinition_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CL);
    result_ = result_ && interfaceDefinition_6(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CR);
    exit_section_(builder_, level_, marker_, INTERFACE_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean interfaceDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // typeParameters?
  private static boolean interfaceDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_3")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  // ( extends superInterfaceDefinition ( ',' superInterfaceDefinition )* )?
  private static boolean interfaceDefinition_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_4")) return false;
    interfaceDefinition_4_0(builder_, level_ + 1);
    return true;
  }

  // extends superInterfaceDefinition ( ',' superInterfaceDefinition )*
  private static boolean interfaceDefinition_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTENDS);
    result_ = result_ && superInterfaceDefinition(builder_, level_ + 1);
    result_ = result_ && interfaceDefinition_4_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( ',' superInterfaceDefinition )*
  private static boolean interfaceDefinition_4_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_4_0_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!interfaceDefinition_4_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interfaceDefinition_4_0_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' superInterfaceDefinition
  private static boolean interfaceDefinition_4_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_4_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && superInterfaceDefinition(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // interfaceMethodDefinition*
  private static boolean interfaceDefinition_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDefinition_6")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!interfaceMethodDefinition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interfaceDefinition_6", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // annotations? methodDefinition
  public static boolean interfaceMethodDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceMethodDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<interface method definition>");
    result_ = interfaceMethodDefinition_0(builder_, level_ + 1);
    result_ = result_ && methodDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, INTERFACE_METHOD_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean interfaceMethodDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceMethodDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // annotations? typeParameters? returnType ID '(' methodParameters? ')'
  public static boolean methodDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method definition>");
    result_ = methodDefinition_0(builder_, level_ + 1);
    result_ = result_ && methodDefinition_1(builder_, level_ + 1);
    result_ = result_ && returnType(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, PL);
    result_ = result_ && methodDefinition_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PR);
    exit_section_(builder_, level_, marker_, METHOD_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean methodDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // typeParameters?
  private static boolean methodDefinition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodDefinition_1")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  // methodParameters?
  private static boolean methodDefinition_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodDefinition_5")) return false;
    methodParameters(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // OPTIONAL? typeNamePair
  public static boolean methodParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodParameter")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method parameter>");
    result_ = methodParameter_0(builder_, level_ + 1);
    result_ = result_ && typeNamePair(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, METHOD_PARAMETER, result_, false, null);
    return result_;
  }

  // OPTIONAL?
  private static boolean methodParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodParameter_0")) return false;
    consumeToken(builder_, OPTIONAL);
    return true;
  }

  /* ********************************************************** */
  // methodParameter ( ',' methodParameter )*
  public static boolean methodParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodParameters")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method parameters>");
    result_ = methodParameter(builder_, level_ + 1);
    result_ = result_ && methodParameters_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, METHOD_PARAMETERS, result_, false, null);
    return result_;
  }

  // ( ',' methodParameter )*
  private static boolean methodParameters_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodParameters_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!methodParameters_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "methodParameters_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' methodParameter
  private static boolean methodParameters_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodParameters_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && methodParameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // importDeclaration | externTypeDefinition | typeDefinition | moduleMethodDefinition
  public static boolean moduleElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleElement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module element>");
    result_ = importDeclaration(builder_, level_ + 1);
    if (!result_) result_ = externTypeDefinition(builder_, level_ + 1);
    if (!result_) result_ = typeDefinition(builder_, level_ + 1);
    if (!result_) result_ = moduleMethodDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MODULE_ELEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // annotations? methodDefinition
  public static boolean moduleMethodDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleMethodDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module method definition>");
    result_ = moduleMethodDefinition_0(builder_, level_ + 1);
    result_ = result_ && methodDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MODULE_METHOD_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean moduleMethodDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleMethodDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // qualifiedName (AS ID)?
  public static boolean moduleSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleSpec")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    result_ = result_ && moduleSpec_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, MODULE_SPEC, result_);
    return result_;
  }

  // (AS ID)?
  private static boolean moduleSpec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleSpec_1")) return false;
    moduleSpec_1_0(builder_, level_ + 1);
    return true;
  }

  // AS ID
  private static boolean moduleSpec_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleSpec_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, AS, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // qualifiedName typeArguments?
  public static boolean objectType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectType")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    result_ = result_ && objectType_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, OBJECT_TYPE, result_);
    return result_;
  }

  // typeArguments?
  private static boolean objectType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectType_1")) return false;
    typeArguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // any | bool | int | float | string
  public static boolean primitiveType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitiveType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<primitive type>");
    result_ = consumeToken(builder_, ANY);
    if (!result_) result_ = consumeToken(builder_, BOOL);
    if (!result_) result_ = consumeToken(builder_, INT);
    if (!result_) result_ = consumeToken(builder_, FLOAT);
    if (!result_) result_ = consumeToken(builder_, STRING);
    exit_section_(builder_, level_, marker_, PRIMITIVE_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // annotations?	OPTIONAL? typeNamePair
  public static boolean propertyDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<property definition>");
    result_ = propertyDefinition_0(builder_, level_ + 1);
    result_ = result_ && propertyDefinition_1(builder_, level_ + 1);
    result_ = result_ && typeNamePair(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PROPERTY_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean propertyDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // OPTIONAL?
  private static boolean propertyDefinition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "propertyDefinition_1")) return false;
    consumeToken(builder_, OPTIONAL);
    return true;
  }

  /* ********************************************************** */
  // ID ('.' ID)*
  public static boolean qualifiedName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedName")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ID);
    result_ = result_ && qualifiedName_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, QUALIFIED_NAME, result_);
    return result_;
  }

  // ('.' ID)*
  private static boolean qualifiedName_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedName_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!qualifiedName_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "qualifiedName_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '.' ID
  private static boolean qualifiedName_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "qualifiedName_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ".");
    result_ = result_ && consumeToken(builder_, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // complexType | void
  public static boolean returnType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<return type>");
    result_ = complexType(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, VOID);
    exit_section_(builder_, level_, marker_, RETURN_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // annotations?
  // 	struct ID typeParameters?
  // 	'{' propertyDefinition* '}'
  public static boolean structDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<struct definition>");
    result_ = structDefinition_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, STRUCT, ID);
    result_ = result_ && structDefinition_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CL);
    result_ = result_ && structDefinition_5(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CR);
    exit_section_(builder_, level_, marker_, STRUCT_DEFINITION, result_, false, null);
    return result_;
  }

  // annotations?
  private static boolean structDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDefinition_0")) return false;
    annotations(builder_, level_ + 1);
    return true;
  }

  // typeParameters?
  private static boolean structDefinition_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDefinition_3")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  // propertyDefinition*
  private static boolean structDefinition_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structDefinition_5")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!propertyDefinition(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "structDefinition_5", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // qualifiedName typeArguments?
  public static boolean superInterfaceDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "superInterfaceDefinition")) return false;
    if (!nextTokenIs(builder_, ID)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = qualifiedName(builder_, level_ + 1);
    result_ = result_ && superInterfaceDefinition_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, SUPER_INTERFACE_DEFINITION, result_);
    return result_;
  }

  // typeArguments?
  private static boolean superInterfaceDefinition_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "superInterfaceDefinition_1")) return false;
    typeArguments(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // primitiveType ArrayQualifier* | objectType ArrayQualifier*
  public static boolean type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type>");
    result_ = type_0(builder_, level_ + 1);
    if (!result_) result_ = type_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE, result_, false, null);
    return result_;
  }

  // primitiveType ArrayQualifier*
  private static boolean type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = primitiveType(builder_, level_ + 1);
    result_ = result_ && type_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ArrayQualifier*
  private static boolean type_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ArrayQualifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // objectType ArrayQualifier*
  private static boolean type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = objectType(builder_, level_ + 1);
    result_ = result_ && type_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ArrayQualifier*
  private static boolean type_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!ArrayQualifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "type_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  /* ********************************************************** */
  // '<' returnType ( ',' returnType )* '>'
  public static boolean typeArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeArguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type arguments>");
    result_ = consumeToken(builder_, "<");
    result_ = result_ && returnType(builder_, level_ + 1);
    result_ = result_ && typeArguments_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ">");
    exit_section_(builder_, level_, marker_, TYPE_ARGUMENTS, result_, false, null);
    return result_;
  }

  // ( ',' returnType )*
  private static boolean typeArguments_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeArguments_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!typeArguments_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeArguments_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' returnType
  private static boolean typeArguments_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeArguments_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && returnType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // typeChainElements | '(' typeChainElements ')' ArrayQualifier+
  public static boolean typeChain(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChain")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain>");
    result_ = typeChainElements(builder_, level_ + 1);
    if (!result_) result_ = typeChain_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN, result_, false, null);
    return result_;
  }

  // '(' typeChainElements ')' ArrayQualifier+
  private static boolean typeChain_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChain_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PL);
    result_ = result_ && typeChainElements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PR);
    result_ = result_ && typeChain_1_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ArrayQualifier+
  private static boolean typeChain_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChain_1_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ArrayQualifier(builder_, level_ + 1);
    int pos_ = current_position_(builder_);
    while (result_) {
      if (!ArrayQualifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeChain_1_3", pos_)) break;
      pos_ = current_position_(builder_);
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // typeChainElement ( '->' typeChainElement &('->' typeChainReturnType) )* | void
  public static boolean typeChainArguments(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainArguments")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain arguments>");
    result_ = typeChainArguments_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, VOID);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN_ARGUMENTS, result_, false, null);
    return result_;
  }

  // typeChainElement ( '->' typeChainElement &('->' typeChainReturnType) )*
  private static boolean typeChainArguments_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainArguments_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeChainElement(builder_, level_ + 1);
    result_ = result_ && typeChainArguments_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( '->' typeChainElement &('->' typeChainReturnType) )*
  private static boolean typeChainArguments_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainArguments_0_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!typeChainArguments_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeChainArguments_0_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '->' typeChainElement &('->' typeChainReturnType)
  private static boolean typeChainArguments_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainArguments_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "->");
    result_ = result_ && typeChainElement(builder_, level_ + 1);
    result_ = result_ && typeChainArguments_0_1_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // &('->' typeChainReturnType)
  private static boolean typeChainArguments_0_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainArguments_0_1_0_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_, null);
    result_ = typeChainArguments_0_1_0_2_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, null, result_, false, null);
    return result_;
  }

  // '->' typeChainReturnType
  private static boolean typeChainArguments_0_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainArguments_0_1_0_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "->");
    result_ = result_ && typeChainReturnType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // type | '(' typeChain ')'
  public static boolean typeChainElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain element>");
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = typeChainElement_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN_ELEMENT, result_, false, null);
    return result_;
  }

  // '(' typeChain ')'
  private static boolean typeChainElement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, PL);
    result_ = result_ && typeChain(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // typeChainArguments '->' typeChainReturnType
  public static boolean typeChainElements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain elements>");
    result_ = typeChainArguments(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "->");
    result_ = result_ && typeChainReturnType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN_ELEMENTS, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // typeChainElement | void
  public static boolean typeChainReturnType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainReturnType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain return type>");
    result_ = typeChainElement(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, VOID);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN_RETURN_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // interfaceDefinition | structDefinition | constDefinition | enumDefinition
  public static boolean typeDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type definition>");
    result_ = interfaceDefinition(builder_, level_ + 1);
    if (!result_) result_ = structDefinition(builder_, level_ + 1);
    if (!result_) result_ = constDefinition(builder_, level_ + 1);
    if (!result_) result_ = enumDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_DEFINITION, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // complexType ID
  public static boolean typeNamePair(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeNamePair")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type name pair>");
    result_ = complexType(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    exit_section_(builder_, level_, marker_, TYPE_NAME_PAIR, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // '<' ID ( ',' ID )* '>'
  public static boolean typeParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type parameters>");
    result_ = consumeToken(builder_, "<");
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && typeParameters_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ">");
    exit_section_(builder_, level_, marker_, TYPE_PARAMETERS, result_, false, null);
    return result_;
  }

  // ( ',' ID )*
  private static boolean typeParameters_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters_2")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!typeParameters_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeParameters_2", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // ',' ID
  private static boolean typeParameters_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParameters_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ",");
    result_ = result_ && consumeToken(builder_, ID);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

}
