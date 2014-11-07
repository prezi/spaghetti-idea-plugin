package com.prezi.intellij.spaghetti;

import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleInterfaceDefinition;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class SpaghettiModuleReference extends PsiReferenceBase<PsiElement> implements PsiPolyVariantReference {
    private String name;

    public SpaghettiModuleReference(@NotNull PsiElement element, TextRange textRange) {
        super(element, textRange);
        name = element.getText().substring(textRange.getStartOffset(), textRange.getEndOffset());
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        Project project = myElement.getProject();
        final List<SpaghettiModuleInterfaceDefinition> properties = SpaghettiModuleUtil.findInterfaceDefinitions(project, name);
        List<ResolveResult> results = new ArrayList<ResolveResult>();
        for (SpaghettiModuleInterfaceDefinition property : properties) {
            results.add(new PsiElementResolveResult(property));
        }
        return results.toArray(new ResolveResult[results.size()]);
    }

    @Nullable
    @Override
    public PsiElement resolve() {
        ResolveResult[] resolveResults = multiResolve(false);
        return resolveResults.length == 1 ? resolveResults[0].getElement() : null;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        Project project = myElement.getProject();
        List<SpaghettiModuleInterfaceDefinition> interfaceDefinitions = SpaghettiModuleUtil.findInterfaceDefinitions(project);
        List<LookupElement> variants = new ArrayList<LookupElement>();
        for (final SpaghettiModuleInterfaceDefinition interfaceDefinition : interfaceDefinitions) {
            if (interfaceDefinition.getName() != null && interfaceDefinition.getName().length() > 0) {
                variants.add(LookupElementBuilder.create(interfaceDefinition).
                                withIcon(SpaghettiModuleIcons.FILE).
                                withTypeText(interfaceDefinition.getContainingFile().getName())
                );
            }
        }
        return variants.toArray();
    }

}
