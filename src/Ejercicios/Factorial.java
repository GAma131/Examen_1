package Ejercicios;

public class Factorial {
    private double x;

    public Factorial(double x) {
        setX(x);
    }

    public void setX(double i){
        this.x = i<0?0:i;
    }

    public double getX(){
        return x;
    }

    // METODO ITERATIVO
    public double FactIterativo(){
        int fact=1;
        for (int i = 1; i <= x; i++) {
            fact*=i;
        }
        return fact;
    }


    // METODO RECURSIVO
    public double factRecursivo(){
        return fact(x);
    }

    private double fact(double n){
        if (n == 1 || n==0) {
            // Caso Base
            return 1;
        }else{
            // Caso General
            return n*fact(n-1);
        }
    }
}
