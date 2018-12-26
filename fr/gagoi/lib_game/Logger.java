package fr.gagoi.lib_game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

public class Logger {

	private static HashMap<String, PrintStream> files = new HashMap<>();
	
	public static void createLogOutput(String fileName, String id) {
		if (!id.equalsIgnoreCase("STDERR") && !id.equalsIgnoreCase("STDOUT") && !files.containsKey(id)) {
			File f = new File(fileName);
			if (!f.exists()) {
				if (!f.getParentFile().exists())
					f.getParentFile().mkdirs();
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
					return;
				}
			}
			try {
				files.put(id, new PrintStream(f));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void log(String id, String format, Object ... args) {
		if (id.equalsIgnoreCase("stderr"))
			System.err.printf(format, args);
		else if (id.equalsIgnoreCase("stdout"))
			System.out.printf(format, args);
		else
			files.getOrDefault(id, System.err).printf(format, args);
	}
}
