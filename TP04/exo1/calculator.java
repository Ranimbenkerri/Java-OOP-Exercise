package exo1;

public class calculator{

    public double add(int a,int b){
    return a+b;
    }
    public float sous(int a,int b){
        return a-b;
    }
    public double multi(int a,int b){
        return a*b;
    }
    public double div(int a, int b){
        if (b == 0){
            throw new ArithmeticException("Division par 0");
        }
        return a/b;
    }
} 