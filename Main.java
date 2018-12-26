import de.gurkenlabs.litiengine.Game;
import fr.gagoi.test.MenuScreen;

public class Main {

	public static void main(String args[]) {
		Game.init(args);
		Game.start();
		Game.getScreenManager().addScreen(new MenuScreen());
		Game.getScreenManager().displayScreen("MENU");
	}
}
