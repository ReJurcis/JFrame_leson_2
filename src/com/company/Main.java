package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main{

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("src/image.png");
        Border border = BorderFactory.createLineBorder(Color.green);// crates border
        JLabel label = new JLabel();// crates label

        label.setText("Bro do you even code?"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text center
        label.setVerticalTextPosition(JLabel.TOP);// set text on TOP, CENTER, BOTTOM of image
        label.setForeground(new Color(0x00FF00)); //set font color
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));// set font of text
        label.setIconTextGap(-5);// set gab of text from image
        label.setBackground(Color.black);
        label.setOpaque(true);//this will display background color
        label.setBorder(border); //sets border
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER);// set horizontal position icon+text within label
        //label.setBounds(100, 0, 350, 350);// set x,y position within as well as dimensions



                JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,600);
       //frame.setLayout(null);
       frame.setVisible(true);
       frame.add(label);
       //pack has to be after all the components
       frame.pack();// adjusts components within the label based on settings

    }
}
