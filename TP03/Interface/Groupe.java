
import java.util.Iterator;

public class Groupe implements Iterable<etudiant>{

   public etudiant[] etudiants;


   public Groupe(etudiant[] etudiants) {
      this.etudiants = etudiants;
   
   }

   public Iterator<etudiant> iterator() {
      return new GroupeIterator(etudiants);
   }
   
   private class GroupeIterator implements Iterator<etudiant> {
      etudiant[] tab;
      int i=0;
      public GroupeIterator(etudiant []tab){
         this.tab = tab;
      }
      public boolean hasNext() {
         return i < tab.length - 1;
      }
      
      public etudiant next() {
         return tab[i++];
      }
      
      public void remove() {
         throw new UnsupportedOperationException();
      }
   }
}
