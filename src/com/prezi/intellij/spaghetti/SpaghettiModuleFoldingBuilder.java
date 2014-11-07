package com.prezi.intellij.spaghetti;

import com.intellij.lang.ASTNode;
import com.intellij.lang.folding.FoldingBuilderEx;
import com.intellij.lang.folding.FoldingDescriptor;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.FoldingGroup;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleInterfaceDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SpaghettiModuleFoldingBuilder extends FoldingBuilderEx {
	@NotNull
	@Override
	public FoldingDescriptor[] buildFoldRegions(@NotNull PsiElement root, @NotNull Document document, boolean quick) {
		FoldingGroup group = FoldingGroup.newGroup("SpaghettiModule");

		List<FoldingDescriptor> descriptors = new ArrayList<FoldingDescriptor>();
		Collection<SpaghettiModuleInterfaceDefinition> interfaceDefinitions = PsiTreeUtil.findChildrenOfType(root, SpaghettiModuleInterfaceDefinition.class);
		for (final SpaghettiModuleInterfaceDefinition interfaceDefinition : interfaceDefinitions) {
			String value = interfaceDefinition.getName();
			if (value != null) {

				descriptors.add(new FoldingDescriptor(interfaceDefinition.getNode(),
						new TextRange(interfaceDefinition.getTextRange().getStartOffset(),
								interfaceDefinition.getTextRange().getEndOffset()), group) {
					@Nullable
					@Override
					public String getPlaceholderText() {
						return "interface " + interfaceDefinition.getName();
					}
				});
			}
		}
		return descriptors.toArray(new FoldingDescriptor[descriptors.size()]);
	}

	@Nullable
	@Override
	public String getPlaceholderText(@NotNull ASTNode node) {
		return "...";
	}

	@Override
	public boolean isCollapsedByDefault(@NotNull ASTNode node) {
		return true;
	}
}