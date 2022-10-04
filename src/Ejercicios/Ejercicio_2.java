package Ejercicios;

import java.lang.module.ModuleReader;

public class Ejercicio_2 {

  private int x;
  private int y;

  public Ejercicio_2(int x, int y) {
    setX(x);
    setY(y);
  }

  public void setX(int x) {
    if (x <= 0) {
      this.x = 1;
    } else {
      this.x = x;
    }
  }

  public void setY(int y) {
    if (y <= 0) {
      this.y = 1;
    } else {
      this.y = y;
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

//   // METODO ITERATIVO
//   public double multiplicar_I() {
//     double result = 0;
//     while (x >= 1) {
//       if (x % 2 != 0) {
//         result += y;
//       }
//       x /= 2;
//       y *= 2;
//     }
//     return result;
//   }

  // MODO RECURSIVO
  public double multiplicar_R() {
    return suma(x, y);
  }

  private double suma(int x, int y) {
    if (x==1) {
        return y;
    } else {
        
    }

    if(x%2 !=0){
        return y;
    }else{
        return suma(x/2, y*2);
    }
  }
}
