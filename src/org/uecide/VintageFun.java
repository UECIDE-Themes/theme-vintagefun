package org.uecide;

import java.io.*;
import java.awt.*;

class VintageFun extends ThemeControl {
    public static void init() {
        loadFont("/org/uecide/fonts/DOTMATRI.TTF");
        loadFont("/org/uecide/fonts/DOTMBold.TTF");
        loadFont("/org/uecide/fonts/DS-TERM.TTF");
    }

    static void loadFont(String path) {
        try {
            InputStream is = Base.class.getResourceAsStream(path);
            Font f = Font.createFont(Font.TRUETYPE_FONT, is);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(f);
            Debug.message("Loaded font " + f);
        } catch (Exception e) {
            Base.error(e);
        }
    }
}
