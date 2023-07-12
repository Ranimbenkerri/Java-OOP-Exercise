package exo01;

import java.util.List;

public class Malady {
	String[] symptoms;
		public Malady(String[] symptoms) {

		this.symptoms = symptoms;
	}
		public static class BasicTreatment  {
			String[] medicament = {"med1","med2","med3"};
			public BasicTreatment() {
				super();
			}
		}
		public class PersonelizedTreatment{
			public List<String> specialmedicament;
			public PersonelizedTreatment(List<String> specialmedicament){
				super();
				this.specialmedicament = specialmedicament;
			}
		}		
}
