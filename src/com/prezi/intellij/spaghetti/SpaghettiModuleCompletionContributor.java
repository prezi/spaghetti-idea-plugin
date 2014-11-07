package com.prezi.intellij.spaghetti;

import com.intellij.codeInsight.completion.*;
import com.intellij.codeInsight.lookup.LookupElementBuilder;
import com.intellij.patterns.PlatformPatterns;
import com.intellij.util.ProcessingContext;
import com.prezi.intellij.spaghetti.psi.SpaghettiModuleTypes;
import org.jetbrains.annotations.NotNull;

public class SpaghettiModuleCompletionContributor extends CompletionContributor {
    public SpaghettiModuleCompletionContributor() {
        extend(CompletionType.BASIC,
                PlatformPatterns.psiElement(SpaghettiModuleTypes.ID).withLanguage(SpaghettiModuleLanguage.INSTANCE),
                new CompletionProvider<CompletionParameters>() {
                    public void addCompletions(@NotNull CompletionParameters parameters,
                                               ProcessingContext context,
                                               @NotNull CompletionResultSet resultSet) {
                        resultSet.addElement(LookupElementBuilder.create("hello"));
                    }
                }
        );
    }
}
