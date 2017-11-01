
public class Hazi001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Feladat : 3 for-ciklus a számok kiírása 0 - 20 ig
		// 1. 3 -mal 3,6,9...
		// 2. 5 -el 5,10,20
		// 3. 10 -el 10,20

		int[] arrayofSzamok = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };

		System.out.print("3-mal osztható számok 20-ig : ");
		for (int i = 0; i < 20; i++) {
			if (arrayofSzamok[i] % 3 == 0)
				System.out.print(+arrayofSzamok[i] + " ");
		}
		System.out.print("\n5- el osztható számok 20-ig : ");
		for (int i = 0; i < 20; i++) {
			if (arrayofSzamok[i] % 5 == 0)
				System.out.print(+arrayofSzamok[i] + " ");
		}
		System.out.print("\n10-el osztható számok 20-ig : ");
		for (int i = 0; i < 20; i++) {
			if (arrayofSzamok[i] % 10 == 0)
				System.out.print(+arrayofSzamok[i] + " ");
		}
	}
	

}
