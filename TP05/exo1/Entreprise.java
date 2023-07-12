import java.util.Arrays;

public class Entreprise {
    String nom;
    int nombreEmploye;
    String [] tableauEmploye;
    public Entreprise(String nom, int nombreEmploye, String [] tableauEmploye) {
        this.nom = nom;
        this.nombreEmploye = nombreEmploye;
        this.tableauEmploye = tableauEmploye;
    }
    public void afficher() {
        System.out.println("Employés: ");
        for (int i = 0; i < this.tableauEmploye.length; i++) {
            System.out.println(this.tableauEmploye[i]);
        }
    }
    public void supprimer (String id) {
        for (int i = 0; i < this.tableauEmploye.length; i++) {
            if (this.tableauEmploye[i] == id) {
                this.tableauEmploye[i] = null;
            }
        }
    }
    public void ajouter (String id) {
        this.tableauEmploye[this.tableauEmploye.length] = id;
    }
    public void rechercher(String id) {
        for (int i = 0; i < this.tableauEmploye.length; i++) {
            if (this.tableauEmploye[i] == id) {
                System.out.println("Employé trouvé");
            }
        }
    }
    public void afficherUsingIterable() {
        Iterable<String> iterable = Arrays.asList(this.tableauEmploye);
        for (String employe : iterable) {
            System.out.println(employe);
        }
    } 
}


