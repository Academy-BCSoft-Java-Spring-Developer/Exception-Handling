package esercizio_1;

public class Main {

	public static void main(String[] args) {
		
		int num = 42;
		Object obj = (Object)num;
		
		try {
			System.out.println((String)obj);
		} catch (ClassCastException e) {
			System.out.println("Hai generato il seguente errore: ");
			e.printStackTrace();
		}
	}

}
