package com.cruds.swingdemo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloJFrame extends JFrame {
	
	private JButton btnClose;
	private JButton btnBeep;
	private JPanel panel;
	
	HelloJFrame()
	
	{
		setTitle("Hello Swing");
		setSize(330, 330);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		btnClose = new JButton("Close");
		btnBeep = new JButton("Beep");
		panel = new JPanel();
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnBeep.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getToolkit().beep();
				
			}
		});
		
		panel.add(btnClose);
		panel.add(btnBeep);
		
		add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new HelloJFrame();
	}

}
