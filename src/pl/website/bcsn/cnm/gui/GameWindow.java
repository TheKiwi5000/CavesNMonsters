package pl.website.bcsn.cnm.gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GameWindow extends JFrame{
	private static final long serialVersionUID = 1L;
	private JPanel topPanel = new JPanel();
	
	public static JTextField tfHp = new JTextField(5);
	public static JTextField tfMonsterChance = new JTextField(5);
	public static JTextField tfGold = new JTextField(5);
	
	
	
	private IndicatorPanel panelHp = new IndicatorPanel("img/heart.png", tfHp);
	private IndicatorPanel panelMonsterChance = new IndicatorPanel("img/heart.png", tfMonsterChance);
	private IndicatorPanel panelGold = new IndicatorPanel("img/money.png", tfGold);
	
	public GameWindow(String title){
		setTitle(title);
		setSize(800,600);
		setDefaultCloseOperation(3);
		setLocationRelativeTo(null);
		
		tfHp.setEditable(false);
		tfMonsterChance.setEditable(false);
		tfGold.setEditable(false);
		
		
		topPanel.add(panelHp, BorderLayout.CENTER);
		topPanel.add(panelMonsterChance, BorderLayout.LINE_END);
		topPanel.add(panelGold, BorderLayout.LINE_END);
		
		add(topPanel, BorderLayout.NORTH);
		
	}
	
}
