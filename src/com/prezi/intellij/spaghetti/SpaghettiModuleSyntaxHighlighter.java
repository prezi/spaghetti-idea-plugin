package com.prezi.intellij.spaghetti;

import com.intellij.openapi.editor.SyntaxHighlighterColors;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.tree.IElementType;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class SpaghettiModuleSyntaxHighlighter extends SyntaxHighlighterBase {
	public static final TextAttributesKey COMMENT = createTextAttributesKey("SIMPLE_COMMENT", SyntaxHighlighterColors.LINE_COMMENT);
	private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};

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

		return new TextAttributesKey[0];
	}
}
