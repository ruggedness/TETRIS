/* Key Event */
import java.awt.event.*;

public class TetrisKey implements KeyListener {
	/*
	 * 宣言
	 */
	public boolean UP;
	public boolean DOWN;
	public boolean LEFT;
	public boolean RIGHT;
	public boolean TURN_L;
	public boolean TURN_R;
	public boolean START;
	/**
	 * KeyPressed
	 * キーボードが押されたときの処理
	 */
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
			case KeyEvent.VK_UP :
				UP = true;
				break;
			case KeyEvent.VK_DOWN :
				DOWN = true;
				break;
			case KeyEvent.VK_LEFT :
				LEFT = true;
				break;
			case KeyEvent.VK_RIGHT :
				RIGHT = true;
				break;
			case KeyEvent.VK_ENTER :
			case KeyEvent.VK_SPACE :
				START = true;
				break;

		}
		switch(e.getKeyChar()){
			case 'z' :
			case 'Z' :
				TURN_L = true;
				break;
			case 'x' :
			case 'X' :
				TURN_R = true;
				break;
		}
	}
	/**
	 * KeyReleased
	 * キーボードが離されたときの処理
	 */
	public void keyReleased(KeyEvent e){
		switch(e.getKeyCode()){
			case KeyEvent.VK_UP :
				UP = false;
				break;
			case KeyEvent.VK_DOWN :
				DOWN = false;
				break;
			case KeyEvent.VK_LEFT :
				LEFT = false;
				break;
			case KeyEvent.VK_RIGHT :
				RIGHT = false;
				break;
			case KeyEvent.VK_ENTER :
			case KeyEvent.VK_SPACE :
				START = false;
				break;
		}
		switch(e.getKeyChar()){
			case 'z' :
			case 'Z' :
				TURN_L = false;
				break;
			case 'x' :
			case 'X' :
				TURN_R = false;
				break;
		}
	}
	/**
	 * keyTyped
	 * 未使用
	 */
	public void keyTyped(KeyEvent e) {
	}
}