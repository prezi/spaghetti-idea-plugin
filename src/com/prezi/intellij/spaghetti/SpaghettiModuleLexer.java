package com.prezi.intellij.spaghetti;

import com.intellij.lexer.FlexAdapter;

/**
 * Created by balintgabor on 11/6/14.
 */
public class SpaghettiModuleLexer extends FlexAdapter {
    public SpaghettiModuleLexer() {
        super(new _SpaghettiModuleLexer());
    }
}
