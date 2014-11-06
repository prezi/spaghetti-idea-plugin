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
    else if (root_ == BOOL_TYPE) {
      result_ = boolType(builder_, 0);
    }
    else if (root_ == COMPLEX_TYPE) {
      result_ = complexType(builder_, 0);
    }
    else if (root_ == EXTERN_TYPE_DEFINITION) {
      result_ = externTypeDefinition(builder_, 0);
    }
    else if (root_ == IMPORT_DECLARATION) {
      result_ = importDeclaration(builder_, 0);
    }
    else if (root_ == METHOD_DEFINITION) {
      result_ = methodDefinition(builder_, 0);
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
    else if (root_ == QUALIFIED_NAME) {
      result_ = qualifiedName(builder_, 0);
    }
    else if (root_ == RETURN_TYPE) {
      result_ = returnType(builder_, 0);
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
    else if (root_ == TYPE_CHAIN_ELEMENT) {
      result_ = typeChainElement(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN_ELEMENTS) {
      result_ = typeChainElements(builder_, 0);
    }
    else if (root_ == TYPE_CHAIN_RETURN_TYPE) {
      result_ = typeChainReturnType(builder_, 0);
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
  // 'module' moduleSpec
  // 	CL
  // 	moduleElement*
  // 	CR
  static boolean SpaghettiModuleDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SpaghettiModuleDefinition")) return false;
    if (!nextTokenIs(builder_, MODULE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MODULE);
    result_ = result_ && moduleSpec(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CL);
    result_ = result_ && SpaghettiModuleDefinition_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, CR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
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
  // true | false
  public static boolean boolType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "boolType")) return false;
    if (!nextTokenIs(builder_, "<bool type>", FALSE, TRUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<bool type>");
    result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    exit_section_(builder_, level_, marker_, BOOL_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // type | typeChain
  public static boolean complexType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "complexType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<complex type>");
    result_ = type(builder_, level_ + 1);
    if (!result_) result_ = typeChain(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, COMPLEX_TYPE, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // 'extern' 'interface' qualifiedName
  public static boolean externTypeDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "externTypeDefinition")) return false;
    if (!nextTokenIs(builder_, EXTERN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERN);
    result_ = result_ && consumeToken(builder_, INTERFACE);
    result_ = result_ && qualifiedName(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXTERN_TYPE_DEFINITION, result_);
    return result_;
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
  // typeParameters? returnType ID '(' /* TODO methodParameters? */ ')'
  public static boolean methodDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<method definition>");
    result_ = methodDefinition_0(builder_, level_ + 1);
    result_ = result_ && returnType(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ID);
    result_ = result_ && consumeToken(builder_, "(");
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, level_, marker_, METHOD_DEFINITION, result_, false, null);
    return result_;
  }

  // typeParameters?
  private static boolean methodDefinition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodDefinition_0")) return false;
    typeParameters(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // methodParameter ( ',' methodParameter )*
  public static boolean methodParameters(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodParameters")) return false;
    if (!nextTokenIs(builder_, METHODPARAMETER)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, METHODPARAMETER);
    result_ = result_ && methodParameters_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, METHOD_PARAMETERS, result_);
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
    result_ = result_ && consumeToken(builder_, METHODPARAMETER);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // importDeclaration | externTypeDefinition | moduleMethodDefinition
  public static boolean moduleElement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleElement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module element>");
    result_ = importDeclaration(builder_, level_ + 1);
    if (!result_) result_ = externTypeDefinition(builder_, level_ + 1);
    if (!result_) result_ = moduleMethodDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MODULE_ELEMENT, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // methodDefinition
  public static boolean moduleMethodDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleMethodDefinition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<module method definition>");
    result_ = methodDefinition(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, MODULE_METHOD_DEFINITION, result_, false, null);
    return result_;
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
  // any | boolType
  public static boolean primitiveType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "primitiveType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<primitive type>");
    result_ = consumeToken(builder_, ANY);
    if (!result_) result_ = boolType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, PRIMITIVE_TYPE, result_, false, null);
    return result_;
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
  // void | complexType
  public static boolean returnType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "returnType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<return type>");
    result_ = consumeToken(builder_, VOID);
    if (!result_) result_ = complexType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, RETURN_TYPE, result_, false, null);
    return result_;
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
    result_ = consumeToken(builder_, "(");
    result_ = result_ && typeChainElements(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
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
    result_ = consumeToken(builder_, "(");
    result_ = result_ && typeChain(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ")");
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // void '->' typeChainReturnType | typeChainElement ( '->' typeChainElement )* '->' typeChainReturnType
  public static boolean typeChainElements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain elements>");
    result_ = typeChainElements_0(builder_, level_ + 1);
    if (!result_) result_ = typeChainElements_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN_ELEMENTS, result_, false, null);
    return result_;
  }

  // void '->' typeChainReturnType
  private static boolean typeChainElements_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElements_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, VOID);
    result_ = result_ && consumeToken(builder_, "->");
    result_ = result_ && typeChainReturnType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeChainElement ( '->' typeChainElement )* '->' typeChainReturnType
  private static boolean typeChainElements_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElements_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = typeChainElement(builder_, level_ + 1);
    result_ = result_ && typeChainElements_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "->");
    result_ = result_ && typeChainReturnType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ( '->' typeChainElement )*
  private static boolean typeChainElements_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElements_1_1")) return false;
    int pos_ = current_position_(builder_);
    while (true) {
      if (!typeChainElements_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeChainElements_1_1", pos_)) break;
      pos_ = current_position_(builder_);
    }
    return true;
  }

  // '->' typeChainElement
  private static boolean typeChainElements_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainElements_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "->");
    result_ = result_ && typeChainElement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // void | typeChainElement
  public static boolean typeChainReturnType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeChainReturnType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<type chain return type>");
    result_ = consumeToken(builder_, VOID);
    if (!result_) result_ = typeChainElement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, TYPE_CHAIN_RETURN_TYPE, result_, false, null);
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
