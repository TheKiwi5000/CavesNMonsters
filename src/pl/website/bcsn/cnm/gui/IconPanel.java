package pl.website.bcsn.cnm.gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pl.website.bcsn.cnm.Logger;

public class IconPanel extends JPanel {


	private static final long serialVersionUID = 1L;
	
	
	public IconPanel(String imageURL){
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File(getClass().getResource(imageURL).getPath()));
		} catch (Exception e) {
			
			Logger.error("Exception during image loading: " + e.getMessage());
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel);
	}
}
