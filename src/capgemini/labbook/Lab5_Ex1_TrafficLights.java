package capgemini.labbook;

import java.awt.*;
import java.awt.Frame;
import java.awt.event.*;

public class Lab5_Ex1_TrafficLights extends WindowAdapter {
	public static void main(String[] args) {
		Frame f = new Frame("Traffic Signals");
		Label message = new Label("Select One");
		// message.setAlignment(Label.CENTER);
		message.setBounds(50, 30, 100, 30);
		f.add(message);
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox red = new Checkbox("Red", cbg, false);
		red.setBounds(30, 50, 100, 60);
		Checkbox yellow = new Checkbox("Yellow", cbg, false);
		yellow.setBounds(30, 100, 100, 60);
		Checkbox green = new Checkbox("Green", cbg, false);
		green.setBounds(30, 150, 100, 60);
		ItemListener listener = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				Checkbox c = (Checkbox) e.getSource();
				String lab = (c.getLabel());
				if (lab.equals("Red")) {
					message.setText("Stop");
					message.setBackground(Color.RED);
				} else if (lab.equals("Yellow")) {
					message.setText("Wait");
					message.setBackground(Color.YELLOW);
				} else {
					message.setText("Go");
					message.setBackground(Color.GREEN);
				}
			}
		};
		f.add(red);
		f.add(yellow);
		f.add(green);
		red.addItemListener(listener);
		yellow.addItemListener(listener);
		green.addItemListener(listener);
		// message.setText("Green");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
