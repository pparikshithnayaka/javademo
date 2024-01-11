package com.cruds.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdapterDemoM extends Applet {

	@Override
	public void init() {
		addMouseListener(new MyMouseAdapter(this));;
	}
}

	class MyMouseAdapter extends MouseAdapter
	{
		Applet app;
		MyMouseAdapter(Applet app)
		{
			this.app = app;
		}
		
	public void mouseClicked(MouseEvent e)
	{
		app.showStatus("Mouse Clicked Pari");
	}

}
