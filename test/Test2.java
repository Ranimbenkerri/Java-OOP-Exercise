class Test2{
    int i;
    Test2(){
    this.i = 1;
    }
    Test2(int i){
    this();
    this.i = i;
    }
    void m(){
    this.i++;
    System.out.println(this.i);
    }
   
    protected void finalize(){
    System.out.println(this.i);
    }
    public static void main(String[] toto){
    Test2 i = new Test2(2);
    i.m();
    i = new Test2();
    System.gc();
    }
   }
   