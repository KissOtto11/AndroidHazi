//	A kiadott Test osztályból származtatással hozza létre a Henger osztályt! (1p.)
//	Tegye alkalmassá a Henger osztályt a térfogat kiszámítására! (A henger
//	térfogata a következõképpen számolható: V =r2*PI*m , ahol m a henger magassága.) (1p.)
//	Készítsen toString metódust a Henger osztályban, ami az alábbi minta
//	szerint állítja elõ a visszatérési értékét: 3.5 sugarú és 4 magasságú henger
//	térfogata: 153,938040046. (1p.)
//	A kiadott Teszt osztályban készítsen main metódust, amiben
//		• ciklussal létrehoz 20 egymástól eltérõ méretû Hengert, és eltárolja
//		ezeket egy tömbben (1p.),
//		• majd megjeleníti a tömbben tárolt objektumok toString metódusa
//		által visszaadott értékeket egy újabb ciklussal a szabvány kimeneten. (1p.)


public class Henger extends Test{

	//	Változók
	private double hengerMagassag;
	private double hengerSugar;
	public static final double PI_ERTEK = 3.14;
	
	// Metodusok
	
	public double getHengerMagassag(){
		return hengerMagassag;
	}
	
	public double getHengerSugar(){
		return hengerSugar;
	}
	
	// Konstruktor
	public Henger(double hengerMagassag, double hengerSugar) {
		this.hengerMagassag = hengerMagassag;
		this.hengerSugar = hengerSugar;
	}
	
	
		public double hengerTerfogat() {
		return hengerSugar * hengerSugar * PI_ERTEK * hengerMagassag;
		}
		
	
	
		@Override
		public String toString() {
		
			return  String.format("%.3f %2s %.3f %2s %.3f", + getHengerSugar(),  " sugarú és ", + getHengerMagassag() , " magasságú henger térfogata: ", + hengerTerfogat() );
	}

}
