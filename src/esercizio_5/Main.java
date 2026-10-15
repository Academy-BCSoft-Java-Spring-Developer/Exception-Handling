package esercizio_5;

public class Main {

    public static void main(String[] args) {
        
        int n = 10;
        int arrS[] = {4, 5, 9};
        
        try {
            for (int i = 0; i < arrS.length; i++) {
                n -= arrS[i];
                
                // Se il risultato diventa negativo, scateniamo l'eccezione
                if (n < 0) {
                    throw new PersonalException("Sottrazione impossibile: il risultato è negativo (" + n + ")");
                }
            }
            
            System.out.println("Tutte le sottrazioni completate. Risultato: " + n);
            
        } catch (PersonalException e) {
            // Gestione con il normale System.out
            e.printStackTrace();
        }

        System.out.println("Fine programma.");
    }

}