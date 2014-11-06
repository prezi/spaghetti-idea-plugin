/* The following code was generated by JFlex 1.4.3 on 11/6/14 3:57 PM */

package com.prezi.intellij.spaghetti;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/6/14 3:57 PM from the specification file
 * <tt>/Users/balintgabor/prezi/workspace/spaghetti-idea-plugin/src/com/prezi/intellij/spaghetti/_SpaghettiModuleLexer.flex</tt>
 */
public class _SpaghettiModuleLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\1\1\0\1\1\1\1\22\0\1\1\17\0\12\2"+
    "\7\0\1\5\16\2\1\32\2\2\1\6\7\2\4\0\1\2\1\0"+
    "\1\24\1\2\1\25\1\11\1\14\1\23\1\2\1\31\1\15\2\2"+
    "\1\13\1\7\1\22\1\10\1\16\1\2\1\17\1\30\1\20\1\12"+
    "\1\26\1\2\1\21\1\27\1\2\1\3\1\0\1\4\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\1\3\1\1\1\4\1\5\10\1\1\6"+
    "\20\1\1\7\6\1\1\10\1\1\1\11\5\1\1\12"+
    "\1\13\1\1\1\14\1\15\6\1\1\16\5\1\1\17";

  private static int [] zzUnpackAction() {
    int [] result = new int[64];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\33\0\66\0\121\0\33\0\33\0\154\0\207"+
    "\0\242\0\275\0\330\0\363\0\u010e\0\u0129\0\121\0\u0144"+
    "\0\u015f\0\u017a\0\u0195\0\u01b0\0\u01cb\0\u01e6\0\u0201\0\u021c"+
    "\0\u0237\0\u0252\0\u026d\0\u0288\0\u02a3\0\u02be\0\u02d9\0\121"+
    "\0\u02f4\0\u030f\0\u032a\0\u0345\0\u0360\0\u037b\0\121\0\u0396"+
    "\0\121\0\u03b1\0\u03cc\0\u03e7\0\u0402\0\u041d\0\121\0\121"+
    "\0\u0438\0\121\0\121\0\u0453\0\u046e\0\u0489\0\u04a4\0\u04bf"+
    "\0\u04da\0\121\0\u04f5\0\u0510\0\u052b\0\u0546\0\u0561\0\121";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[64];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\4\1\10"+
    "\4\4\1\11\1\12\2\4\1\13\2\4\1\14\1\15"+
    "\1\4\1\16\4\4\34\0\1\3\33\0\1\4\2\0"+
    "\26\4\2\0\1\4\2\0\1\4\1\17\24\4\2\0"+
    "\1\4\2\0\3\4\1\20\3\4\1\21\16\4\2\0"+
    "\1\4\2\0\14\4\1\22\11\4\2\0\1\4\2\0"+
    "\2\4\1\23\12\4\1\24\10\4\2\0\1\4\2\0"+
    "\12\4\1\25\13\4\2\0\1\4\2\0\17\4\1\26"+
    "\6\4\2\0\1\4\2\0\15\4\1\27\10\4\2\0"+
    "\1\4\2\0\3\4\1\30\22\4\2\0\1\4\2\0"+
    "\4\4\1\31\21\4\2\0\1\4\2\0\13\4\1\32"+
    "\12\4\2\0\1\4\2\0\13\4\1\33\12\4\2\0"+
    "\1\4\2\0\11\4\1\34\14\4\2\0\1\4\2\0"+
    "\13\4\1\35\12\4\2\0\1\4\2\0\5\4\1\36"+
    "\20\4\2\0\1\4\2\0\6\4\1\37\17\4\2\0"+
    "\1\4\2\0\22\4\1\40\3\4\2\0\1\4\2\0"+
    "\10\4\1\41\15\4\2\0\1\4\2\0\5\4\1\42"+
    "\20\4\2\0\1\4\2\0\24\4\1\43\1\4\2\0"+
    "\1\4\2\0\7\4\1\44\16\4\2\0\1\4\2\0"+
    "\3\4\1\45\22\4\2\0\1\4\2\0\7\4\1\46"+
    "\16\4\2\0\1\4\2\0\7\4\1\47\16\4\2\0"+
    "\1\4\2\0\23\4\1\50\2\4\2\0\1\4\2\0"+
    "\4\4\1\51\21\4\2\0\1\4\2\0\6\4\1\52"+
    "\17\4\2\0\1\4\2\0\3\4\1\53\22\4\2\0"+
    "\1\4\2\0\12\4\1\54\13\4\2\0\1\4\2\0"+
    "\12\4\1\55\13\4\2\0\1\4\2\0\12\4\1\56"+
    "\13\4\2\0\1\4\2\0\7\4\1\57\16\4\2\0"+
    "\1\4\2\0\7\4\1\60\16\4\2\0\1\4\2\0"+
    "\4\4\1\61\21\4\2\0\1\4\2\0\15\4\1\62"+
    "\10\4\2\0\1\4\2\0\13\4\1\63\12\4\2\0"+
    "\1\4\2\0\16\4\1\64\7\4\2\0\1\4\2\0"+
    "\25\4\1\65\2\0\1\4\2\0\17\4\1\66\6\4"+
    "\2\0\1\4\2\0\17\4\1\67\6\4\2\0\1\4"+
    "\2\0\20\4\1\70\5\4\2\0\1\4\2\0\12\4"+
    "\1\71\13\4\2\0\1\4\2\0\7\4\1\72\16\4"+
    "\2\0\1\4\2\0\17\4\1\73\6\4\2\0\1\4"+
    "\2\0\2\4\1\74\23\4\2\0\1\4\2\0\7\4"+
    "\1\75\16\4\2\0\1\4\2\0\13\4\1\76\12\4"+
    "\2\0\1\4\2\0\7\4\1\77\16\4\2\0\1\4"+
    "\2\0\12\4\1\100\13\4";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1404];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\2\1\2\11\72\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[64];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /* user code: */
  public _SpaghettiModuleLexer() {
    this((java.io.Reader)null);
  }


  public _SpaghettiModuleLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _SpaghettiModuleLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 98) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { return INTERFACE;
          }
        case 16: break;
        case 7: 
          { return ANY;
          }
        case 17: break;
        case 9: 
          { return VOID;
          }
        case 18: break;
        case 13: 
          { return IMPORT;
          }
        case 19: break;
        case 15: 
          { return METHODPARAMETER;
          }
        case 20: break;
        case 11: 
          { return MODULE;
          }
        case 21: break;
        case 3: 
          { return com.intellij.psi.TokenType.WHITE_SPACE;
          }
        case 22: break;
        case 5: 
          { return CR;
          }
        case 23: break;
        case 2: 
          { return com.intellij.psi.TokenType.BAD_CHARACTER;
          }
        case 24: break;
        case 4: 
          { return CL;
          }
        case 25: break;
        case 1: 
          { return ID;
          }
        case 26: break;
        case 8: 
          { return TRUE;
          }
        case 27: break;
        case 6: 
          { return AS;
          }
        case 28: break;
        case 12: 
          { return EXTERN;
          }
        case 29: break;
        case 10: 
          { return FALSE;
          }
        case 30: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}