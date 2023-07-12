
public class etudiant extends personne {
    private int matricule;
    private int[] notes;
    private float moyenne;
    etudiant(String nom, String prenom, int age, int matricule, int[] notes, float moyenne) {
        
        this.matricule = matricule;
        this.notes = notes;
        this.moyenne = moyenne;
        
    }

    public void calculeMoyenne(int[] notes){
        int somme = 0;
        for (int i = 0; i < notes.length; i++) {
            somme += notes[i];
        }
        this.moyenne = somme/notes.length;
    }
   
    public void afficher(){
        super.afficher();
        System.out.println("Matricule: "+matricule);
        System.out.println("Notes: "+notes);
        System.out.println("Moyenne: "+moyenne);
    }
    @Override
    public void afficherType(){
        System.out.println("Je suis un etudiant");
    }
}
