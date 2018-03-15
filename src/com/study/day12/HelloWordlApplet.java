package com.study.day12;

import java.applet.Applet;
import java.awt.*;

public class HelloWordlApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.drawString("Java Applet 程序",150,25);
    }
}
