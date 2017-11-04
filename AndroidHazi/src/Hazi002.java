package AndroidHazi;


import java.util.Scanner;


public class Hazi002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int lepes = 1;
		int szam = 0; 
		
		System.out.print("Kérem a tömb elemeinek számát n= ");
        n = sc.nextInt();
        System.out.print("A program kírja a megadott -lépés számnak megfelelõ tömb értékeit. \nKérem a lépészámát : ");
        lepes = sc.nextInt();
        
        
        int[] arrayofSzamok =  new int[n];

        // a tömb feltöltése
        for (int i = 0 ; i < arrayofSzamok.length ; i++){
        	arrayofSzamok[i] = szam;
        	szam = szam + 1;
        }
        
        // a eredeti tömb kiírása
        System.out.print("Az eredeti tömb számai : \n");
        
        for (int i = 0 ; i < arrayofSzamok.length ; i++){
        	System.out.print( arrayofSzamok[i] + " " );
        }
        
        System.out.println("A tömb minden " + lepes + ". eleme : \n");
        
        for (int i = 1 ; i < arrayofSzamok.length ; i++){
        	if (i == lepes){
        	System.out.print( arrayofSzamok[i] + " " );
        	lepes = lepes + lepes;
        	}
        	
        }
	}

}
