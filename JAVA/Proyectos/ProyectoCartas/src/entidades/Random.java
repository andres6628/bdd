package entidades;

public class Random {
	public static int obtenerPosicion() {
        int aleatorio = (int) (Math.random() * 52);
		return aleatorio;
	}
}
