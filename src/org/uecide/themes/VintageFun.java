package org.uecide.themes;

public class VintageFun extends ThemeControl {
    public static void init() {
        System.err.println("Running init in VF");
        loadFont("/org/uecide/fonts/DOTMATRI.TTF");
        loadFont("/org/uecide/fonts/DOTMBold.TTF");
        loadFont("/org/uecide/fonts/DS-TERM.TTF");
    }
}
