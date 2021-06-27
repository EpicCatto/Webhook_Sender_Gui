import java.awt.EventQueue;

import notthatuwu.webhooksender.Gui.WebHookGUI;

public class Main {

	public static boolean isTerm = false;
	
	public static void main(String[] args) {
		if (!isTerm) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						WebHookGUI window = new WebHookGUI();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
	
}
