package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setVisible(true);// make frame visible
        this.setSize(500, 500); // sets x dimension and y dimension
        this.setTitle("JFrame title goes here"); // sets titel of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit of aplication
        this.setResizable(false);//prevent frame for being resized

        ImageIcon image = new ImageIcon("src/girl.jpg");//crate an image icon
        this.setIconImage(image.getImage());// change icon of frame
        this.getContentPane().setBackground(new Color(155,125,125)); // change color of bacground
    }
}
