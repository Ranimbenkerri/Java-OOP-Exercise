
public class Main {
    public static void main(String[] args) {
        Vehicule voiture = new Vehicule(5, true);
    try {
        voiture.demarrer();
    } catch (ZeroCarburantException e) {
        System.out.println(e.getMessage());
    } catch (MecanicalException e) {
        System.out.println(e.getMessage());}
    }
}

