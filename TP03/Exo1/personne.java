public abstract class personne{
    private String nom;
    private String prenom;
    private int age;

    public void afficher(){
        System.out.println("Nom: "+nom);
        System.out.println("Prenom: "+prenom);
        System.out.println("Age: "+age);
    }
    // methone abstrat
    public abstract void afficherType();
}