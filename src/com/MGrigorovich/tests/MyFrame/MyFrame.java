package com.MGrigorovich.tests.MyFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {

    jFrame.add(jPanel);
    JButton jButton = new JButton("Metal");
    JButton jButton1 = new JButton("Nimbus");
    JButton jButton2 = new JButton("Motif");
    JButton jButton3 = new JButton("Mac OS X");
    jPanel.add(jButton);
    jPanel.add(jButton1);
    jPanel.add(jButton2);
    jPanel.add(jButton3);
    jButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    });

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    UIManager.setLookAndFeel("com.apple.laf.AquaLookAndFeel");
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

//    UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
//    for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos) {
//        System.out.println(lookAndFeelInfo.getName());
//        System.out.println(lookAndFeelInfo.getClassName());
//    }
    }

    static JFrame getFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 300,dimension.height/2 - 150,600, 300);
        return jFrame;
    }
}
