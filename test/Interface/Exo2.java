class Exo2 {
    Exo2 e;

    Exo2(Exo2 e) {
        this.e = e;
    }

    Exo2() {
        this.e = this;

    }

    public String toString() {
        if (this.e == null)
            return "NULL";
        else
            return "LLUN";
    }

    Exo2 m1() {
        System.out.println("Bonjour le monde");
        return this;
    }

    void m2(Exo2 e) {
        this.e = null;
        this.m1();
        e.e = this;
        System.out.println(this);
    }

    public static void main(String[] truc) {
        new Exo2();
        Exo2 e = new Exo2();
        e.m2(e);
        Exo2 f = new Exo2(e);
        e.m2(f);
    }
}
