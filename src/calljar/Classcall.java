package calljar;

import jarfilecreation.Classforjar;

public class Classcall {
	
	public void method () {
		System.out.println("Aman is creating jar file and attaching");
	}

	public static void main(String[] args) {
		Classcall aman=new Classcall();
		aman.method();
		Classforjar.abc();
	}
}


/* Notes 
we can only call static files */