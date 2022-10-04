package Ejercicios;

public class Ejercicio_1 {
    private int n;
    private Factorial objFact;

    public Ejercicio_1(int n) {
        setN(n);
        objFact= new Factorial(n);
    }

    public void setN(int n){
        if (n<=0) {
            this.n=1;
        } else {
            this.n=n;
        }
    }

    public int getN(){
        return n;
    }

    // MODO ITERATIVO
    public double calcSuma_I() {
        double z = 0;
        int c=2;

        for (double i = 1; i <= n; i++) {
            objFact.setX(c);
            z += i / objFact.FactIterativo();
            c+=2;
        }
        return z;
    }

    // MODO RECURSIVO
    public double calcSuma_R(){
        return suma(n);
    }

    private double suma(int n) {
        if (n == 1) {
            objFact.setX(n*2);
            e+=n/objFact.FactIterativo();
        } else {
            objFact.setX(n*2);
             e+= n / (objFact.FactIterativo());
             suma(n-1);
        }
        return e;
    }
}
