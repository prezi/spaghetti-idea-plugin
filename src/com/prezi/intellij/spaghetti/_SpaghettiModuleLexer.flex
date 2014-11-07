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
FLOATVALUE=[0-9]+(\.[0-9]*)
INTVALUE=[0-9]+
STRINGVALUE=(\"([^\"\\]|\\.)*\")
ID=[a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "module"           { return MODULE; }
  "import"           { return IMPORT; }
  "extern"           { return EXTERN; }
  "interface"        { return INTERFACE; }
  "extends"          { return EXTENDS; }
  "struct"           { return STRUCT; }
  "const"            { return CONST; }
  "bool"             { return BOOL; }
  "int"              { return INT; }
  "float"            { return FLOAT; }
  "string"           { return STRING; }
  "enum"             { return ENUM; }
  "void"             { return VOID; }
  "any"              { return ANY; }
  "null"             { return NULL; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }

  {COMMENT}          { return COMMENT; }
  {FLOATVALUE}       { return FLOATVALUE; }
  {INTVALUE}         { return INTVALUE; }
  {STRINGVALUE}      { return STRINGVALUE; }
  {ID}               { return ID; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
