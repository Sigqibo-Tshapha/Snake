import javax.swing.JOptionPane;

public class SnakeGame {

	public static void main(String[] args) {
		int speed = 0;
		char difficulty = (JOptionPane.showInputDialog("Difficulty ( E for Easy, M for Medium, H for Hard ) : ")).toLowerCase().charAt(0);
		switch(difficulty) {
		case 'h':
			speed= 50;
			break;
		case 'm':
			speed= 120;
			break;
		case 'e':
			speed= 180;
			break;
		}
		JOptionPane.showConfirmDialog(null, "Start Game?");
		new GameFrame(speed);

	}

}
