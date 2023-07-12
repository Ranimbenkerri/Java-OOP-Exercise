public class journaliste_principal extends journaliste{

    public journaliste_principal(String[] article) {
    super(article); 
  }
    // cree article 
    public void creer(String article){
      System.out.println("le contenu est cree");
    }
    public void modifier(String article){
      System.out.println("le contenu est modifie");
    }
    // valider article
    public void valider(String article){
      System.out.println("le contenu est valide");
    }
    public void publier(String article){
      System.out.println("le contenu est publie");
    }

}