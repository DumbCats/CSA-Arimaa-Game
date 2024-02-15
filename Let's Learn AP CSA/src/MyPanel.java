import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.*;


public class MyPanel extends JPanel{
	MyPanel() {
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D)g;
		
		// Border
		g2D.setPaint(Color.decode("#C97e04"));
		int BorderSize = 400;
		g2D.fillRect(51,51,BorderSize,BorderSize);
		g2D.setStroke(new BasicStroke(4));
		g2D.setPaint(Color.black);
		g2D.drawRect(50,50,BorderSize,BorderSize);
		g2D.setStroke(new BasicStroke(1));
		
		// Cells
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				g2D.drawRect(50 + 50*j, 50 + 50*i, 50, 50);
			}
		}
	}
}