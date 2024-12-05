package arrays;

import java.util.Scanner;

public class ExamenEntornos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (option) {
                case 1:
                    System.out.print("Ingrese la primera palabra: ");
                    String word1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String word2 = scanner.nextLine();
                    System.out.println("Resultado: " + word1 + word2);
		break;

                case 2:
                   
                    break;

                case 3:
                    
                    break;

                case 4:
                    
                    }
                    break;

                default:
                   
            }
        }

        scanner.close();
    }
}
