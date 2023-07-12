public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Employe employe1 = new Employe("12345666");
        Employe employe2 = new Employe("12345667");
        Employe employe3 = new Employe("12375667");
        String [] employes  = {employe1.id, employe2.id, employe3.id};
        Entreprise entreprise = new Entreprise("Entreprise", 2, employes);
        entreprise.afficher();
        System.out.println("------------------------");
        entreprise.afficherUsingIterable();
        System.out.println("------------------------");
        

    }
}
