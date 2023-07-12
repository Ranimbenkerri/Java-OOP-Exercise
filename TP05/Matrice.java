public class Matrice {
    int m;
    int n;
    int [][] matrice1;
    int [][] matrice2;
    public Matrice(int m, int n, int [][] matrice1, int [][] matrice2) {
        this.m = m;
        this.n = n;
        this.matrice1 = matrice1;
        this.matrice2 = matrice2;
    }

    public void afficher() {
        System.out.println("Matrice 1: ");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.println(this.matrice1[i][j]);
            }
        }
        System.out.println("Matrice 2: ");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.println(this.matrice2[i][j]);
            }
        }
    }

    public void additionner() {
        int [][] matrice3 = new int [this.m][this.n];
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrice3[i][j] = this.matrice1[i][j] + this.matrice2[i][j];
            }
        }
        System.out.println("Matrice 3: ");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.println(matrice3[i][j]);
            }
        }
    }

    public void multiplier() {
        int [][] matrice3 = new int [this.m][this.n];
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrice3[i][j] = this.matrice1[i][j] * this.matrice2[i][j];
            }
        }
        System.out.println("Matrice 3: ");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.println(matrice3[i][j]);
            }
        }
    }

    public void multiplicationParUnScalaire(int scalaire) {
        int [][] matrice3 = new int [this.m][this.n];
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrice3[i][j] = this.matrice1[i][j] * scalaire;
            }
        }
        System.out.println("Matrice 3: ");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.println(matrice3[i][j]);
            }
        }
    }

    public void soustraire() {
        int [][] matrice3 = new int [this.m][this.n];
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                matrice3[i][j] = this.matrice1[i][j] - this.matrice2[i][j];
            }
        }
        System.out.println("Matrice 3: ");
        for (int i = 0; i < this.m; i++) {
            for (int j = 0; j < this.n; j++) {
                System.out.println(matrice3[i][j]);
            }
        }
    }
}
