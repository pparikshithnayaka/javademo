package com.cruds.swingdemo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

    
public class CardLayoutDemo extends JFrame implements ActionListener{    
CardLayout card;    
JButton b1,b2,b3;    
Container c;    
    CardLayoutDemo(){    
            
        c=getContentPane();    
        card=new CardLayout(10,10);    
        c.setLayout(card);    
            
        b1=new JButton("Please");    
        b2=new JButton("Don't");    
        b3=new JButton("See...Me...!!");    
        b1.addActionListener(this);    
        b2.addActionListener(this);    
        b3.addActionListener(this);    
                
        c.add("a",b1);c.add("b",b2);c.add("c",b3);    
                            
    }    
    public void actionPerformed(ActionEvent e) {    
    card.next(c);    
    }    
    
    public static void main(String[] args) {    
        CardLayoutDemo cl=new CardLayoutDemo();    
        cl.setSize(400,420);  
        cl.setLocationRelativeTo(null);
        cl.setVisible(true);    
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);    
    }    
}    