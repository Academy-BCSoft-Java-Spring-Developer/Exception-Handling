package esercizio_3;

public class Main {

	public static void main(String[] args) {
		
		String s = null;
		
		try {
			
			int l = s.length();
			
		} catch(NullPointerException e) {
			
			System.out.println("Errore! Non puoi assegnare la length di s a l perchè s è null!");
			e.printStackTrace();
			
		}
		
		System.out.println("Fine programma.");

	}

}
