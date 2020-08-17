package assignment;

public class Worker {
	
	String name;
	int year;
	String address;
	
	

	public static void main(String[] args) {
		
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		Worker w3 = new Worker();
		
		w1.name ="Robert WallStreet";
		w1.year = 1994;
		w1.address = "64C-";
		
		w2.name ="Sam WallStreet";
		w2.year = 2000;
		w2.address = "68D-";
				
	    w3.name ="John WallStreet";
		w3.year = 1999;
		w3.address = "26B-";
		
		System.out.println("Name           " + "       Year of joining    "  + "       Address");
		System.out.println(w1.name+ "          " + w1.year + "                     w1.address");
		System.out.println(w2.name+ "             " + w2.year + "                     w2.address");
		System.out.println(w3.name+ "            " + w3.year + "                     w3.address");

	}

}
