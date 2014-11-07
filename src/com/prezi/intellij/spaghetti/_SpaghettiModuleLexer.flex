package com.prezi.intellij.spaghetti;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes.*;

%%

%{
  public _SpaghettiModuleLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _SpaghettiModuleLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

COMMENT=("/"\*([^*]|[\r\n]|(\*+([^*/]|[\r\n])))*\*+"/")|("//".*)
INTVALUE=[0-9]+
FLOATVALUE=[0-9]+(\.[0-9]*)
ID=[a-zA-Z_0-9]*
STRINGVALUE=('([^'\\]|\\.)*'|\"([^\"\\]|\\.)*\")

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "?"                { return OPTIONAL; }
  "("                { return PL; }
  ")"                { return PR; }
  "{"                { return CL; }
  "}"                { return CR; }
  "as"               { return AS; }
  "const"            { return CONST; }
  "module"           { return MODULE; }
  "import"           { return IMPORT; }
  "extern"           { return EXTERN; }
  "extends"          { return EXTENDS; }
  "interface"        { return INTERFACE; }
  "struct"           { return STRUCT; }
  "enum"             { return ENUM; }
  "void"             { return VOID; }
  "any"              { return ANY; }
  "bool"             { return BOOL; }
  "int"              { return INT; }
  "float"            { return FLOAT; }
  "string"           { return STRING; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "null"             { return NULL; }

  {COMMENT}          { return COMMENT; }
  {INTVALUE}         { return INTVALUE; }
  {FLOATVALUE}       { return FLOATVALUE; }
  {ID}               { return ID; }
  {STRINGVALUE}      { return STRINGVALUE; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
