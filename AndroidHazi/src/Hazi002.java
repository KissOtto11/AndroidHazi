package AndroidHazi;


import java.util.Scanner;


public class Hazi002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int lepes = 1;
		int szam = 0; 
		
		System.out.print("K�rem a t�mb elemeinek sz�m�t n= ");
        n = sc.nextInt();
        System.out.print("A program k�rja a megadott -l�p�s sz�mnak megfelel� t�mb �rt�keit. \nK�rem a l�p�sz�m�t : ");
        lepes = sc.nextInt();
        
        
        int[] arrayofSzamok =  new int[n];

        // a t�mb felt�lt�se
        for (int i = 0 ; i < arrayofSzamok.length ; i++){
        	arrayofSzamok[i] = szam;
        	szam = szam + 1;
        }
        
        // a eredeti t�mb ki�r�sa
        System.out.print("Az eredeti t�mb sz�mai : \n");
        
        for (int i = 0 ; i < arrayofSzamok.length ; i++){
        	System.out.print( arrayofSzamok[i] + " " );
        }
        
        System.out.println("A t�mb minden " + lepes + ". eleme : \n");
        
        for (int i = 1 ; i < arrayofSzamok.length ; i++){
        	if (i == lepes){
        	System.out.print( arrayofSzamok[i] + " " );
        	lepes = lepes + lepes;
        	}
        	
        }
	}

}
