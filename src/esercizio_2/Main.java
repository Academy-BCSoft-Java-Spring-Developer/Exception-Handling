package esercizio_2;

public class Main {

	public static void main(String[] args) {
		
		int[] t = null;
		
		try {
			
			t[0] = 7;
			
		} catch (NullPointerException e) {
			
			System.out.println("Errore! Impossibile assegnare un valore all'indice [0] perché t è null.");
			e.printStackTrace();
			
		}
			
		System.out.println("Termine del programma.");
		
		
	}

}
