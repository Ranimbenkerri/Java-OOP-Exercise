public class test{
    public static void main(String[] args) {

        

      personne e = new personne(){

        @Override
        public void afficher2() {
            
            throw new UnsupportedOperationException("Unimplemented method 'afficher2'");
        }

        @Override
        public void afficher() {
            throw new UnsupportedOperationException("Unimplemented method 'afficher'");
        }
       
      };
        
      
      

}
}