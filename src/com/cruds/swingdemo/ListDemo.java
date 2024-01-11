package com.cruds.swingdemo;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListDemo extends JFrame {
	
	private JLabel label;
	private JList<String> techList;
	private String[] technologyArr = {"Java" , "C++" , "Microsoft" , "Python"};
	
	public ListDemo()
	{
		setTitle("JList Example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		
		techList = new JList<String>(technologyArr);
		techList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(! e.getValueIsAdjusting())
				{
					String techName = techList.getSelectedValue();
					label.setText(techName);
				}
			}
		});
		
		JScrollPane pane = new JScrollPane();
		pane.getViewport().add(techList);
		pane.setPreferredSize(new Dimension(250,300));
		panel.add(pane);
		label = new JLabel("Tech//");
		add(label, BorderLayout.SOUTH);
		
		add(panel);
		pack();
		
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new ListDemo();
				
			}
		});
	}

}
