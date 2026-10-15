package esercizio_6;

public class Main {

    public static void main(String[] args) {
        
        int numero = 100;
        // Inseriamo uno zero per testare il caso impossibile
        int[] divisori = {5, 2, 0, 4}; 

        try {
            for (int i = 0; i < divisori.length; i++) {
                
                // Controllo preventivo: la divisione per zero è impossibile
                if (divisori[i] == 0) {
                    throw new DivisioneException("Impossibile dividere per zero! Elemento all'indice " + i + " non valido.");
                }

                numero /= divisori[i];
                System.out.println("Passo " + i + ": risultato parziale = " + numero);
            }

            System.out.println("Tutte le divisioni sono state eseguite con successo. Risultato finale: " + numero);

        } catch (DivisioneException e) {
            // Gestione dell'eccezione personalizzata
            e.printStackTrace();
        }

        System.out.println("Programma terminato regolarmente.");
    }

}