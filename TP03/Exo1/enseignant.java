public class enseignant extends personne{
    private int nbHouresCours;
    private String module;
    enseignant(String nom, String prenom, int age, int nbHouresCours, String module){
        
        this.nbHouresCours = nbHouresCours;
        this.module = module;
        
    }
    public void afficher(){
        super.afficher();
        System.out.println("Nombre d'heures de cours: "+nbHouresCours);
        System.out.println("Module: "+module);
    }


    @Override
    public void afficherType() {
        System.out.println("Je suis un enseignant");
    }
}
