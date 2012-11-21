/* Procedure */
import java.util.concurrent.TimeUnit;
public class TetrisProc {
	/*
	 * 宣言
	 */
	private TetrisKey  key;
	private TetrisGUI  gui;
	private FPSManager fpsM;
	/**
	 * プロシージャ
	 * @param key
	 * @param gui
	 */
	public TetrisProc(TetrisKey key, TetrisGUI gui) {
		this.key = key;
		this.gui = gui;
		fpsM = new FPSManager(60);
	}
	private void gameUpdate() {
	}
	private void gameRender() {
	}
	private void paintScreen() {
	}
	public void gameRun() {
		gameUpdate();	// ゲーム状態を更新（ex: ピースの移動）
        gameRender();	// バッファにレンダリング（ダブルバッファリング）
        paintScreen();	// バッファを画面に描画（repaint()を自分でする！）

		if(key.UP) {
			System.out.println("UP");
		}
		if(key.RIGHT) {
			System.out.println("RIGHT");
		}
		if(key.DOWN) {
			System.out.println("DOWN");
		}
		if(key.LEFT) {
			System.out.println("LEFT");
		}
		try {
			TimeUnit.NANOSECONDS.sleep(fpsM.state());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}