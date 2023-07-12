public class testentier {
//main
public static void main(String[] args) {

entie n1 = new entie (2) ; 
System.out.print ("n1 = "); n1.imprime();
entie n2 = new entie (5) ; 
System.out.print ("n2 = ") ; n2.imprime();


n1.incr(3) ; 
System.out.print ("n1 = ") ; n1.imprime() ;

System.out.println ("n1 == n2 est " + (n2 == n1)) ;



n1 = n2 ; System.out.print ("n2 = ") ; n2.imprime() ;
System.out.print ("n1 = ") ; n1.imprime() ;
System.out.println ("n1 == n2 est " + (n1 == n2)) ;
}


    
}
