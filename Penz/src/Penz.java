//	Hozzon létre Penz osztályt, ami két egész típusú adattag segítségével
//	tárolja egy összeg euró és cent részét! Hozzon létre olyan konstruktort, ami
//	paraméterként fogadja az euró és cent értékeket, majd tárolja ezeket az
//	adattagokban! (1p.)
//	Hozzon létre olyan felültöltött konstruktort, ami csak az euró értékét
//	fogadja paraméterként, a cent értékét pedig nullának feltételezi. Vezesse
//	vissza a konstruktor mûködését az elõzõ változatra! (1p.)
//	Készítsen toString metódust, amely az alábbi mintának megfelelõ formájú
//	értéket szolgáltat: 12,50€ (1p.)
//	Készítse el a kiadott Teszt osztály main metódusát, ami
//		• egy 2x3-as mátrixban egymástól különbözõ Penz objektumokat
//		tárol (1p.),
//		• majd jelenítse meg szabvány kimeneten (ciklus segítségével) a
//		tárolt objektumok toString metódusa által visszaadott értékeket a
//		szabvány kimeneten! (1p.)


public class Penz extends TestPenz{

	// Változók
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
			return getEuro() + "," + getCent() + "€"; 
		
		
		}
	
}
