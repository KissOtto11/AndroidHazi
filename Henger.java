//	A kiadott Test oszt�lyb�l sz�rmaztat�ssal hozza l�tre a Henger oszt�lyt! (1p.)
//	Tegye alkalmass� a Henger oszt�lyt a t�rfogat kisz�m�t�s�ra! (A henger
//	t�rfogata a k�vetkez�k�ppen sz�molhat�: V =r2*PI*m , ahol m a henger magass�ga.) (1p.)
//	K�sz�tsen toString met�dust a Henger oszt�lyban, ami az al�bbi minta
//	szerint �ll�tja el� a visszat�r�si �rt�k�t: 3.5 sugar� �s 4 magass�g� henger
//	t�rfogata: 153,938040046. (1p.)
//	A kiadott Teszt oszt�lyban k�sz�tsen main met�dust, amiben
//		� ciklussal l�trehoz 20 egym�st�l elt�r� m�ret� Hengert, �s elt�rolja
//		ezeket egy t�mbben (1p.),
//		� majd megjelen�ti a t�mbben t�rolt objektumok toString met�dusa
//		�ltal visszaadott �rt�keket egy �jabb ciklussal a szabv�ny kimeneten. (1p.)


public class Henger extends Test{

	//	V�ltoz�k
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
		
			return  String.format("%.3f %2s %.3f %2s %.3f", + getHengerSugar(),  " sugar� �s ", + getHengerMagassag() , " magass�g� henger t�rfogata: ", + hengerTerfogat() );
	}

}
