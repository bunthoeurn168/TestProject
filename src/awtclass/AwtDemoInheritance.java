package awtclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// AWT with Inheritance
public class AwtDemoInheritance extends Frame{
	
	public AwtDemoInheritance(){
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		setSize(350, 350);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AwtDemoInheritance();
	}
}
