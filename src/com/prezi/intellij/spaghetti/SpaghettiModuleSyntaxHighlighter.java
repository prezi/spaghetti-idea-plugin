package com.prezi.intellij.spaghetti;

import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class SpaghettiModuleSyntaxHighlighter extends SyntaxHighlighterBase {
	public static final TextAttributesKey COMMENT = createTextAttributesKey("SPAGHETTI_MODULE_COMMENT", SyntaxHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey NUMBER = createTextAttributesKey("SPAGHETTI_MODULE_NUMBER", SyntaxHighlighterColors.NUMBER);
	public static final TextAttributesKey STRING = createTextAttributesKey("SPAGHETTI_MODULE_STRING", SyntaxHighlighterColors.STRING);
	public static final TextAttributesKey KEY = createTextAttributesKey("SPAGHETTI_MODULE_KEY", SyntaxHighlighterColors.KEYWORD);
	public static final TextAttributesKey PRIMITIVE_TYPE = createTextAttributesKey("SPAGHETTI_MODULE_TYPE", SyntaxHighlighterColors.KEYWORD);
	public static final TextAttributesKey PRIMITIVE_VALUES = createTextAttributesKey("SPAGHETTI_MODULE_VALUES", SyntaxHighlighterColors.KEYWORD);

	private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{ COMMENT };
	private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{ KEY };
	private static final TextAttributesKey[] PRIMITIVE_TYPE_KEYS = new TextAttributesKey[]{ PRIMITIVE_TYPE };
	private static final TextAttributesKey[] PRIMITIVE_VALUE_KEYS = new TextAttributesKey[]{ PRIMITIVE_VALUES };
	private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{ NUMBER };
	private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{ STRING };

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		return new SpaghettiModuleLexer();
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if (tokenType.equals(SpaghettiModuleTypes.COMMENT)) {
			return COMMENT_KEYS;
		}
		else if (SpaghettiModuleParserDefinition.KEYWORDS.contains(tokenType)) {
			return KEY_KEYS;
		}
		else if (SpaghettiModuleParserDefinition.PRIMITIVE_TYPES.contains(tokenType)) {
			return PRIMITIVE_TYPE_KEYS;
		}
		else if (SpaghettiModuleParserDefinition.PRIMITIVE_VALUES.contains(tokenType)) {
			return PRIMITIVE_VALUE_KEYS;
		}
		else if (SpaghettiModuleParserDefinition.NUMBER_VALUES.contains(tokenType)) {
			return NUMBER_KEYS;
		}
		else if (tokenType.equals(SpaghettiModuleTypes.STRING_VALUE)) {
			return STRING_KEYS;
		}
		return new TextAttributesKey[0];
	}
}
