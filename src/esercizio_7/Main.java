package esercizio_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un numero intero: ");
        
        try {
            // Se l'utente digita un decimale o una stringa, nextInt() fallisce qui
            int numero = scanner.nextInt();
            System.out.println("Numero inserito correttamente: " + numero);
            
        } catch (InputMismatchException e) {
        	
            System.out.println("Errore: il valore inserito non è un numero intero!");
            e.printStackTrace();
            
        } finally {
        	
            scanner.close();
        }
        
        System.out.println("Programma terminato.");
    }

}