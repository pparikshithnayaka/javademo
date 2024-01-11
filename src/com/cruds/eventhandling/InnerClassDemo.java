package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InnerClassDemo extends Applet {

	@Override
	public void init() {
		addMouseListener(new MyMouseAdapter2());
	}
	
	class MyMouseAdapter2 extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e) {
			showStatus("Pleaseeeee Nooooooo");
		}
	}
}
