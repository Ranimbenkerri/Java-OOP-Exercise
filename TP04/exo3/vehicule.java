

package exo3;
public class vehicule {
    private int niveauCarburant;
    private boolean panneMecanique;

    public vehicule(int niveauCarburant, boolean panneMecanique) {
        this.niveauCarburant = niveauCarburant;
        this.panneMecanique = panneMecanique;
    }

    public void demarrer() throws ZeroCarburantException, MecanicalException {
        if (niveauCarburant == 0) {
            throw new ZeroCarburantException("Impossible de démarrer : niveau de carburant à zéro");
        } else if (panneMecanique) {
            throw new MecanicalException("Impossible de démarrer : panne mécanique détectée");
        } else {
            System.out.println("Le véhicule démarre !");
        }
    }
}
