/* Graphical User Interface */
import javax.swing.JFrame;

public class TetrisGUI {
	/*
	 * 宣言
	 */
	private JFrame frame;
	/**
	 * GUIを設定
	 * @param key
	 */
	TetrisGUI(TetrisKey key) {
		/*
		 * ウィンドウ
		 */
		frame = new JFrame("Ruggedness Tetris");				// タイトル
		frame.setSize(600, 800);								// サイズの設定
		frame.setLocationRelativeTo(null);						// 中央に設定
		frame.setResizable(false);								// サイズは変更不可能
		frame.addKeyListener(key);								// キーイベントの登録
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// クローズ処理の設定
	}
	/**
	 * GUIを表示
	 */
	public void windowShow() {
		frame.setVisible(true);
	}
}