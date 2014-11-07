package com.prezi.intellij.spaghetti;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilder;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleInterfaceDefinition;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class SpaghettiModuleFoldingBuilder implements FoldingBuilder {
	@NotNull
	@Override
	public FoldingDescriptor[] buildFoldRegions(@NotNull ASTNode node, @NotNull Document document) {
		List<FoldingDescriptor> list = new ArrayList<FoldingDescriptor>();
		buildFolding(node, list);
		FoldingDescriptor[] descriptors = new FoldingDescriptor[list.size()];
		return list.toArray(descriptors);
	}
	private static void buildFolding(ASTNode node, List<FoldingDescriptor> list) {
		if (node.getElementType() == SpaghettiModuleTypes.INTERFACE_DEFINITION) {
			final TextRange range = node.getTextRange();
			list.add(new FoldingDescriptor(node, range));
		}
		for (ASTNode child : node.getChildren(null)) {
			buildFolding(child, list);
		}
	}
	@Nullable
	@Override
	public String getPlaceholderText(@NotNull ASTNode node) {
		ASTNode name = node.findChildByType(SpaghettiModuleTypes.ID);
		return name == null ? null : "interface " + name.getText() + "{...}";
	}
	@Override
	public boolean isCollapsedByDefault(@NotNull ASTNode node) {
		return true;
	}
}
