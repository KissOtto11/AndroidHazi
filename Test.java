
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Henger[] tombHenger = new Henger[20];
	
	for(int i = 0; i < tombHenger.length; i++){
		double r = Math.random() * 10;
		double m = Math.random() * 10;
		tombHenger[i] = new Henger(r,m);
	}
	
	for(int i = 0; i < tombHenger.length; i++){
	
		System.out.println(tombHenger[i].toString());

	}
		
	}

}
