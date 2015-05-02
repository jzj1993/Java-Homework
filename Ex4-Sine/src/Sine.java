
import java.awt.*;
import javax.swing.*;

public class Sine {
	public static void main(String[] args) {
		JFrame frame = new JFrame("drawSine");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setBackground(Color.WHITE);
		SinPanel panel = new SinPanel();
		frame.add(panel);
		frame.setVisible(true);
	}
}

class SinPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics graphics) {
		super.paintComponents(graphics);
		graphics.setColor(Color.BLUE);
		graphics.drawLine(this.getWidth() / 2 - 300, this.getHeight() / 2,
				this.getWidth() / 2 + 300, this.getHeight() / 2);
		graphics.drawLine(this.getWidth() / 2, this.getHeight() / 2 + 150,
				this.getWidth() / 2, this.getHeight() / 2 - 150);

		int[] sinX = new int[540];
		int[] sinY = new int[540];

		for (int i = -270; i < 270; i++) {
			sinX[i + 270] = this.getWidth() / 2 + i;
			sinY[i + 270] = (int) (this.getHeight() / 2 + 100 * Math.sin(Math
					.toRadians(2 * i)));
		}
		graphics.drawPolyline(sinX, sinY, 540);
	}
}
