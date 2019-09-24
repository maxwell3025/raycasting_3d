package raycaster;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Display extends JPanel{
private static final long serialVersionUID = 1L;

private final JFrame window = new JFrame();
private BufferedImage frame;
private Raycaster raycaster;
private boolean paintFinished = false;

	public Display(int width, int height) {
		setPreferredSize(new Dimension(width, height));
		frame = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
		raycaster = new Raycaster(width,height);
		window.add(this);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(3);
		window.setVisible(true);
	}
	public void Update(){
		raycaster.copyToBufferedImage(frame);
		paintFinished = false;
		repaint();
		while(!paintFinished){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
			}
		}
	}
	public void paint(Graphics g){
		g.drawImage(frame, 0, 0, null);
		paintFinished = true;
	}

}
