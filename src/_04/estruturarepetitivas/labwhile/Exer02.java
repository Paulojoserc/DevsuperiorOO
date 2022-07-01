package _04.estruturarepetitivas.labwhile;

public class Exer02 {
	public static void main(String[] args) {
		int x = 2;
		int y = 0;

		while (x < 60) {
			System.out.println(x);
			x = x * 2;
			y = y + 10;
		}
	}
}