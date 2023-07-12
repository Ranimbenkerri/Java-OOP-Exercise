public class lecteur {
    static String[] article;

    public lecteur(String[] article) {
        lecteur.article = article;
    }
    public void consulter(){
        System.out.println(article);
    }
     
}
