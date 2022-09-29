package Ejercicios;

public class Ejercicio_3 {

  private int n;
  private Factorial objFact;

  public Ejercicio_3(int n) {
    setN(n);
    objFact = new Factorial(n);
  }

  public void setN(int n) {
    if (n <= 0) {
      this.n = 1;
    } else {
      this.n = n;
    }
  }

  public int getN() {
    return n;
  }

  // MODO ITERATIVO
  public double calcSuma_I() {
    double z = 0;
    double p = 2;
    int c = 2;

    for (double i = 1; i <= n; i++) {
      z += p / c;
      p *= p;
      c *= 2;
    }
    return z;
  }
}
