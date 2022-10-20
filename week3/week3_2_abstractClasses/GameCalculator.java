package week3_2_abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Game Over");
	}
}
