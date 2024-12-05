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
                   System.out.print("Ingrese una frase: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.trim().split("\\s+");
		    System.out.println("La frase contiene " + words.length + " palabra(s).");
                    break;

                case 3:
                    System.out.print("Ingrese una frase: ");
                    String phrase = scanner.nextLine();
                    System.out.print("Ingrese una letra: ");
                    char letter = scanner.next().charAt(0);
                    int count = 0;
                    for (char c : phrase.toCharArray()) {
                        if (c == letter) {
                            count++;
                        }
                    }
                                       System.out.println("La letra '" + letter + "' aparece " + count + " vez/veces en la frase.");
			 break;

                case 4:
                    System.out.print("¿Está seguro de que desea salir? (s/n): ");
                    char confirm = scanner.next().charAt(0);
                    if (confirm == 's' || confirm == 'S') {
                        exit = true;
                        System.out.println("¡Gracias por usar el programa!");
                    }
                    }
                    break;

                default:
                   System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }

        scanner.close();
    }
}
