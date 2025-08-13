/**
 * Write a description of class Circunferencia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circunferencia {
	public static void main(String[] args) {
		int radio = Integer.valueOf(args[0]);

		System.out.println("Perímetro: " + (Math.PI * Math.pow(radio, 2)));
	}
}