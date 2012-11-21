/* Ruggedness Tetris */
public class Tetris {
	/*
	 * 宣言
	 */
	private TetrisGUI  gui;
	private TetrisKey  key;
	private TetrisProc prc;
	/**
	 * コンストラクタ
	 */
	public Tetris() {
		key = new TetrisKey();			// キー入力
		gui = new TetrisGUI(key);		// GUI
		prc = new TetrisProc(key, gui);	// プロシージャ
		gui.windowShow();				// ウィンドウの表示

		try {
			Thread.sleep(500);			// sleep0.5秒
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		while(true) {					// ループ(AWT, Swing仕様)
			prc.gameRun();
		}
	}
	/**
	 * メイン処理
	 * @param args
	 */
	public static void main(String[] args) {
		new Tetris();
	}
}