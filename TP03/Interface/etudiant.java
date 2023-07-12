
    public class etudiant implements Comparable<etudiant> {
        private String nom;
        private int age;
        private double moyenne;
    
        public etudiant(String nom, int age, double moyenne) {
            this.nom = nom;
            this.age = age;
            this.moyenne = moyenne;
        }
    
        @Override
        public int compareTo(etudiant other) {
            int cmp = Double.compare(this.moyenne, other.moyenne);
            if (cmp != 0) {
                return cmp;
            }
            return 0;
        }
    }
    

