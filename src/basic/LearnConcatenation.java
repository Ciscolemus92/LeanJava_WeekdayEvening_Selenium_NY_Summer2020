package basic;

public class LearnConcatenation {
	
	// Concatenation: Joining a variable with a string value
	
	
	
	public static void main(String[] args) {
		String firstName= "James";
		String lastName= "William";
		
		System.out.println( "My Name is "+firstName);
		System.out.println( "My First name is "+firstName+" Last name is "+lastName);

		LearnAccessModifier lam=new LearnAccessModifier();

		// short cut sout for system out printline
		System.out.println(lam.contractNumber);
        lam.display();
        lam.num=39; // reAssigned value
        System.out.println(lam.num);


	}

}
