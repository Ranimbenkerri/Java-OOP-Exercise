package exo2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double nombre = lireNombre(scanner);
            System.out.println("Le nombre entré est : " + nombre);
        } catch (TypeMismatchError e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }

    public static double lireNombre(Scanner scanner) throws TypeMismatchError {
        System.out.print("Entrez un nombre : ");
        String entree = scanner.nextLine();

        try {
            double nombre = Double.parseDouble(entree);
            return nombre;
        } catch (NumberFormatException e) {
            throw new TypeMismatchError("Entrée invalide : veuillez entrer un nombre valide.");
        }
    }
}
