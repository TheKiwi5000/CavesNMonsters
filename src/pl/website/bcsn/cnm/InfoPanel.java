package pl.website.bcsn.cnm;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class InfoPanel extends JPanel {
	
	public float hp = 1.00F;
	public float hpMax = 1.00F;            //wszystko w procentach
	public float monsterChance = 0.00F;
	public int gold = 10;
	
	private JTextField tfHp = new JTextField(10);
	private JTextField tfMonsterChance = new JTextField(10);
	private JTextField tfGold = new JTextField(10);
	
}
