package exo01;
import java.util.ArrayList;
import exo01.Malady.PersonelizedTreatment;

public class main {
    public static void main(String[] args){
    

    ArrayList <String> symptoms = new ArrayList<String>();
    symptoms.add("symptom1");
    symptoms.add("symptom2");
    Malady malady = new Malady(args);
    Malady.BasicTreatment treatment = new Malady.BasicTreatment();
	Malady.PersonelizedTreatment v1 = malady.new PersonelizedTreatment(symptoms);



   
}
 }
