
package com.prezi.intellij.spaghetti;

import com.intellij.lang.ASTNode;
import com.intellij.lang.Language;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import com.prezi.intellij.spaghetti.parser.SpaghettiModuleParser;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleFile;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

public class SpaghettiModuleParserDefinition implements ParserDefinition{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(SpaghettiModuleTypes.COMMENT);
    public static final TokenSet KEYWORDS = TokenSet.create(SpaghettiModuleTypes.INTERFACE,
															SpaghettiModuleTypes.ENUM,
															SpaghettiModuleTypes.MODULE,
															SpaghettiModuleTypes.STRUCT,
															SpaghettiModuleTypes.CONST,
															SpaghettiModuleTypes.EXTERN,
															SpaghettiModuleTypes.EXTENDS);

	public static final TokenSet PRIMITIVE_TYPES = TokenSet.create(SpaghettiModuleTypes.INT,
														 SpaghettiModuleTypes.FLOAT,
														 SpaghettiModuleTypes.STRING,
														 SpaghettiModuleTypes.VOID);

	public static final TokenSet PRIMITIVE_VALUES = TokenSet.create(SpaghettiModuleTypes.TRUE,
																	SpaghettiModuleTypes.FALSE,
																	SpaghettiModuleTypes.ANY,
																	SpaghettiModuleTypes.NULL);

	public static final TokenSet NUMBER_VALUES = TokenSet.create(SpaghettiModuleTypes.INT_VALUE,
																 SpaghettiModuleTypes.FLOAT_VALUE);

	public static final IFileElementType FILE = new IFileElementType(Language.<SpaghettiModuleLanguage>findInstance(SpaghettiModuleLanguage.class));

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new FlexAdapter(new _SpaghettiModuleLexer((Reader) null));
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return WHITE_SPACES;
    }

    @NotNull
    public TokenSet getCommentTokens() {
        return COMMENTS;
    }

    @NotNull
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    public PsiParser createParser(final Project project) {
        return new SpaghettiModuleParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    public PsiFile createFile(FileViewProvider viewProvider) {
        return new SpaghettiModuleFile(viewProvider);
    }

    public SpaceRequirements spaceExistanceTypeBetweenTokens(ASTNode left, ASTNode right) {
        return SpaceRequirements.MAY;
    }

    @NotNull
    public PsiElement createElement(ASTNode node) {
        return SpaghettiModuleTypes.Factory.createElement(node);
    }
}