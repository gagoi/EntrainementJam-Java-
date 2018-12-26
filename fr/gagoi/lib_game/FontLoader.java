package fr.gagoi.lib_game;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class FontLoader {

	private static HashMap<String, Font> fonts = new HashMap<>();

	public static void loadFont(String fileName, String id) {
		try {
			Font f = Font.createFont(0, new File(fileName));
			fonts.put(id, f);
		} catch (FontFormatException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Font getFont(String id) {
		return fonts.getOrDefault(id, GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()[0]);
	}

}
