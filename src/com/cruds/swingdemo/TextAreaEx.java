package com.cruds.swingdemo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class TextAreaEx extends JFrame {
	JTextArea area;
	
	public TextAreaEx() {
		setTitle("JTextArea");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 30));
		
		JScrollPane pane = new JScrollPane();
		area = new JTextArea();
		
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setBorder(BorderFactory.createEmptyBorder(9, 10, 29, 59));
		pane.getViewport().add(area);
		
		JButton btn = new JButton("Submit");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(area.getText());
				
			}
		});
		
		panel.add(pane);
		panel.add(btn , BorderLayout.SOUTH);
		
		add(panel);
		setSize(new Dimension(400,500));
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new TextAreaEx();
				
			}
		});
	}

}
