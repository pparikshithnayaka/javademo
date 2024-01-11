package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.GraphicAttribute;

public class MouseEventDemo extends Applet implements MouseListener {
	
	String msg = "";

	@Override
	public void init() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {
		g.drawString(msg, 10, 10);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		msg = "Mouse Clicked at" + e.getX() + "," + e.getY();
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		msg = "Mouse Entered";
		repaint();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		msg = "Mouse Exited";
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		msg = "Mouse Pressed";
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		msg = "Mouse Released";
		repaint();
	}

}
