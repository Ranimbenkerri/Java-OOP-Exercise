package exo2;

import java.util.Arrays;

public class matrice {
   int[][] mat;

   public int[] extraireColonne(int colonne) {
      int[] resultat = new int[mat.length];
      for (int i = 0; i < mat.length; i++) {
         resultat[i] = mat[i][colonne];
      }
      return resultat;
   }

   public int[] extraireLigne(int colonne) {
      return Arrays.copyOf(mat[colonne], mat[colonne].length);
   }

   public int[] extraireSousColonne(int colonne, int debut, int fin) {
      int[] resultat = new int[fin - debut + 1];
      for (int i = debut; i <= fin; i++) {
         resultat[i - debut] = mat[i][colonne];
      }
      return resultat;
   }

   public int[] extraireSousLigne(int ligne, int debut, int fin) {
      return Arrays.copyOfRange(mat[ligne], debut, fin + 1);
   }

   public int[][] extraireSousMatrice(int debutLigne, int finLigne, int debutColonne, int finColonne) {
      int[][] resultat = new int[finLigne - debutLigne + 1][finColonne - debutColonne + 1];
      for (int i = debutLigne; i <= finLigne; i++) {
         resultat[i - debutLigne] = Arrays.copyOfRange(mat[i], debutColonne, finColonne + 1);
      }
      return resultat;
   }
}
