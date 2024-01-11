package com.cruds.swingdemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class CheckBoxDemo extends JFrame {
	JCheckBox checkBox;
	
	public CheckBoxDemo()
	{
		checkBox = new JCheckBox("Java");
		checkBox.setFocusable(false);
		checkBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox.isSelected())
				{
					System.out.println("Java Selected");
				}
				else
				{
					System.out.println("Java Unselected");
				}
			}
		});
		
		add(checkBox);
		
		setSize(300,200);
		setTitle("CheckBox Example");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new CheckBoxDemo();				
			}
		});
	}

}
