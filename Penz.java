//	Hozzon l�tre Penz oszt�lyt, ami k�t eg�sz t�pus� adattag seg�ts�g�vel
//	t�rolja egy �sszeg eur� �s cent r�sz�t! Hozzon l�tre olyan konstruktort, ami
//	param�terk�nt fogadja az eur� �s cent �rt�keket, majd t�rolja ezeket az
//	adattagokban! (1p.)
//	Hozzon l�tre olyan fel�lt�lt�tt konstruktort, ami csak az eur� �rt�k�t
//	fogadja param�terk�nt, a cent �rt�k�t pedig null�nak felt�telezi. Vezesse
//	vissza a konstruktor m�k�d�s�t az el�z� v�ltozatra! (1p.)
//	K�sz�tsen toString met�dust, amely az al�bbi mint�nak megfelel� form�j�
//	�rt�ket szolg�ltat: 12,50� (1p.)
//	K�sz�tse el a kiadott Teszt oszt�ly main met�dus�t, ami
//		� egy 2x3-as m�trixban egym�st�l k�l�nb�z� Penz objektumokat
//		t�rol (1p.),
//		� majd jelen�tse meg szabv�ny kimeneten (ciklus seg�ts�g�vel) a
//		t�rolt objektumok toString met�dusa �ltal visszaadott �rt�keket a
//		szabv�ny kimeneten! (1p.)


public class Penz extends TestPenz{

	// V�ltoz�k
	private int euro;
	private int cent;
	
	// Konstruktor
	public Penz( int euro, int cent){
		this.euro = euro;
		this.cent = cent;
	}
	
	// Metodusok
	public int getEuro(){
		return euro;
	}
	
	public int getCent(){
		return cent;
	}
	
		@Override
		public String toString() {
			return getEuro() + "," + getCent() + "�"; 
		
		
		}
	
}
