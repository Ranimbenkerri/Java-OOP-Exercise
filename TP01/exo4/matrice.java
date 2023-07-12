public class matrice{

    private int rows;
    private int columns;
    private int[][] data;

    matrice(){
        columns=0;
        rows=0;
        data= new int[columns][rows];
    }
    matrice(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        data = new int[rows][columns];
    }
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    public int get(int row, int col) {
        return data[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
    public int[][] getData(){
        return this.data;
    }
    public void affiche(){
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print(this.data[i][j] + "\t"); 
            } 
            System.out.println(); 
        }
    }
    public void remplir(){
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
               data[i][j]=(int)(Math.random() *3) ;
            } 
         
        }
    }

    public matrice getSomme(matrice m){
        for(int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.data[i][j] += m.data[i][j];
            }
        }
      this.affiche();
        return this;
    }
    
}