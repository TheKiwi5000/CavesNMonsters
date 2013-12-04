package pl.website.bcsn.cnm.gui;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class IndicatorPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public IndicatorPanel(String imageURL, JTextField tf){
		add(new IconPanel(imageURL), BorderLayout.CENTER);
		add(tf, BorderLayout.LINE_END);
	}
	
	
	
}
