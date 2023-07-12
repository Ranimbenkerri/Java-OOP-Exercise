public class etud {
    private String nom;
    private String prenom;
    private double[] notes;
     
    public etud(String Fname, String Lname, double[] notes) {
        this.nom = Fname;
        this.prenom = Lname;
        this.notes = notes;
    }

    public String GetName() {
        return this.nom;
    }

    public String GetLastName() {
        return this.prenom;
    }

    public double[] GetNotes() {
        return this.notes;
    }

    public void SetName(String Fname) {
        this.nom = Fname;
    }
    public  void SetLastName(String Lname){
        this.prenom = Lname;
    }
    public void SetNotes(double[] notes){
        this.notes = notes;
    }
    public void LireEtud(){
        System.out.println(" The name of Student is : " + nom + " " + prenom );
        System.out.println(" The notes of Student are : " );
        for(int i=0; i<notes.length; i++){
            System.out.println(" Note Number " + i +" :"+ " " + notes[i] );
        }
    }
    public void CalcMoy(){
        double somme=0;
        for(int i=0; i<notes.length; i++){
            somme=somme+notes[i];
        }
        System.out.println(" The average of Student is : " + somme/notes.length );
    }

}