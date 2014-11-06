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

ID=[a-zA-Z_0-9]*

%%
<YYINITIAL> {
  {WHITE_SPACE}        { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "{"                  { return CL; }
  "}"                  { return CR; }
  "AS"                 { return AS; }
  "module"             { return MODULE; }
  "import"             { return IMPORT; }
  "extern"             { return EXTERN; }
  "interface"          { return INTERFACE; }
  "void"               { return VOID; }
  "any"                { return ANY; }
  "true"               { return TRUE; }
  "false"              { return FALSE; }
  "methodParameter"    { return METHODPARAMETER; }

  {ID}                 { return ID; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
