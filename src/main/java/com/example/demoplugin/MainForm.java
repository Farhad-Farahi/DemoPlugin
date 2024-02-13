package com.example.demoplugin;

import javax.swing.*;

public class MainForm extends JFrame{
    private JPanel mainPanel;

    public MainForm(){
        setContentPane(mainPanel);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
