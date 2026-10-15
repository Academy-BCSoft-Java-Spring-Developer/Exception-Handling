package esercizio_4;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		
		try {
			
			for(int i = 0; i < 5; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Errore! L'indice successivo non esiste!");
			e.printStackTrace();
		}

	}

}
