package fr.gagoi.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import de.gurkenlabs.litiengine.gui.screens.Screen;

public class MenuScreen extends Screen {

	Font f;
	
	public MenuScreen() {
		super("MENU");
		//f = new Font("arial.ttf", 0, 0);
	}

	  @Override
	  public void render(final Graphics2D g) {
	    super.render(g);
	    g.setFont(f);
	    g.setColor(Color.RED);
	    g.drawString("Test text", 100, 100);
	  }
}
