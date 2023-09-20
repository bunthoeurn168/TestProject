package awtclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// AWT with associate
public class AwtDemoAssociate {

	public AwtDemoAssociate() {
		Frame frame = new Frame();
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				frame.dispose();
			}
		});
		
		frame.setSize(350, 350);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new AwtDemoAssociate();
	}
}
