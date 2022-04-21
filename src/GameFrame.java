import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	public GameFrame(int speed) {
		this.add(new GamePanel(speed));
		this.setTitle("Play Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	
	
}
