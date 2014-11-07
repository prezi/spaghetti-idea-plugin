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
                        resultSet.addElement(LookupElementBuilder.create("interface"));
                        resultSet.addElement(LookupElementBuilder.create("module"));
                        resultSet.addElement(LookupElementBuilder.create("import"));
                        resultSet.addElement(LookupElementBuilder.create("extern"));
                        resultSet.addElement(LookupElementBuilder.create("interface"));
                        resultSet.addElement(LookupElementBuilder.create("extends"));
                        resultSet.addElement(LookupElementBuilder.create("struct"));
                        resultSet.addElement(LookupElementBuilder.create("const"));
                        resultSet.addElement(LookupElementBuilder.create("bool"));
                        resultSet.addElement(LookupElementBuilder.create("int"));
                        resultSet.addElement(LookupElementBuilder.create("float"));
                        resultSet.addElement(LookupElementBuilder.create("string"));
                        resultSet.addElement(LookupElementBuilder.create("enum"));
                        resultSet.addElement(LookupElementBuilder.create("void"));
                        resultSet.addElement(LookupElementBuilder.create("any"));
                        resultSet.addElement(LookupElementBuilder.create("null"));
                        resultSet.addElement(LookupElementBuilder.create("true"));
                        resultSet.addElement(LookupElementBuilder.create("false"));
                    }
                }
        );
    }
}
