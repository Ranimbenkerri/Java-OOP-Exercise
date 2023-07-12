

public class main {
   public static void main(String[] args) {
   // 1s matrice
      matrice m = new matrice(3, 3);
      m.remplir();
    //   m.set(0, 0, 1);
    //   m.set(0, 1, 2);
    //   m.set(0, 2, 3);
    //   m.set(1, 0, 4);
    //   m.set(1, 1, 5);
    //   m.set(1, 2, 6);
    //   m.set(2, 0, 7);
    //   m.set(2, 1, 8);
    //   m.set(2, 2, 9);
      System.out.println("Les donnes de la matrice 01: ");
      // affichage de la matrice
    m.affiche();

// 2nd matrice
      matrice a = new matrice(3, 3);
      a.remplir();
    //   a.set(0, 0, 2);
    //   a.set(0, 1, 3);
    //   a.set(0, 2, 4);
    //   a.set(1, 0, 5);
    //   a.set(1, 1, 6);
    //   a.set(1, 2, 7);
    //   a.set(2, 0, 8);
    //   a.set(2, 1, 9);
    //   a.set(2, 2, 10);
  
      System.out.println("Les donnes de la matrice 02: ");
      // affichage de la matrice
    m.affiche();
     System.out.println("la somme de deux matrices :");
      a.getSomme(m);
     // la somme 
//      matrice s = new matrice(3, 3);
      
//      int[][] Somme = new int[s.columns][s.rows];
//      for(int i = 0; i < s.rows; i++) {
//       for (int j = 0; j < s.columns; j++) {
//           Somme[i][j] = a.data[i][j] + m.data[i][j];
//       }
//   }

//   System.out.println("La somme des matrices donnees est: ");
//   for(int i = 0; i < s.rows; i++) {
//       for (int j = 0; j < s.columns; j++) {
//           System.out.print(Somme[i][j] + "   ");
//       }
//       System.out.println();
//   }
//    }

}
}
