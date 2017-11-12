
public class TestPenz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Penz[][] tombPenz	= new Penz[2][3];
	
		tombPenz[0][0] = new Penz(25, 5);
		tombPenz[0][1] = new Penz(50, 25);
		tombPenz[0][2] = new Penz(100, 75);  
		tombPenz[1][0] = new Penz(125, 50); 
		tombPenz[1][1] = new Penz(225, 50);
		tombPenz[1][2] = new Penz(250, 20); 
	
	for(int i = 0; i < tombPenz.length; i++){
		for(int j = 0; j < tombPenz.length+1; j++){
			System.out.println(tombPenz[i][j].toString());
		}
	}
		
		
	}

}
