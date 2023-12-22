package digital_clock;

import java.awt.Font;
import java.awt.GridLayout;
import java.util.*;

import javax.swing.Timer;
import java.awt.event.*;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame {

	private JLabel heading;
	private JLabel clockLabel;
	private Font f = new Font("", Font.BOLD, 35);

	public MyWindow() {
		super.setTitle("Digital Clock");

		super.setSize(500, 500);
		super.setLocation(500, 100);

		this.createGUI();
		this.startClock();

		super.setVisible(true);
	}

	public void createGUI() {
		heading = new JLabel("MY Digital Clock");
		clockLabel = new JLabel("Clock");

		heading.setFont(f);
		clockLabel.setFont(f);

		this.setLayout(new GridLayout(2, 1));

		this.add(heading);
		this.add(clockLabel);
	}

	public void startClock() {
		Timer timer = new javax.swing.Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String dateTime = new Date().toString();

				Date d = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("hh : mm : ss a");
				String dateTime = sdf.format(d);
				clockLabel.setText(dateTime);
			}
		});
		timer.start();
	}

	public static void main(String[] args) {
		new MyWindow();
	}
}
