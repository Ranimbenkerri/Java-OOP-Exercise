class C1{
    C2 c;
    int i;
    C1(int i, C2 c){
    if(c == null) this.c = new C2(i+1,this);
    System.out.println(c);
    this.i = i;
    }
    public static void main(String[] toto){
    C1 c = new C1(1,null);

    C2 d = new C2(c.i,c);
    C1 e = new C1(d.i,d);
    
    }
   }
   class C2{
    C1 c;
    int i;
    C2(int i, C1 c){
    if(c == null) this.c = new C1(i+1,this);
    else this.c = c;
    this.i = i;
    }
   }
   