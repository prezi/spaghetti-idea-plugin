package com.prezi.spaghetti;

import com.intellij.lang.Language;

public class SpaghettiModuleLanguage extends Language {
	public static final SpaghettiModuleLanguage INSTANCE = new SpaghettiModuleLanguage();

	private SpaghettiModuleLanguage() {
		super("SpaghettiModule");
	}
}
