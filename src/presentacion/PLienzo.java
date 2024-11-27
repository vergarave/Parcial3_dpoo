package presentacion;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class PLienzo extends JPanel{
	public int figura;
	
	public PLienzo(int figura) {
		this.figura=figura;
		
	}
		
	
	public int getFigura() {
		return figura;
	}

	public void setFigura(int figura) {
		this.figura = figura;
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(new Color(255, 255, 255));
		
		if (figura==1) {
			g2d.fillRect(100, 100, 100, 100);
		}
		else if (figura==2) {
			g2d.fillOval(100, 100, 100, 100);
		}
		
	}
	
	public void update() {
		setFigura(1);
	}

}
