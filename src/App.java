import Ejercicios.Ejercicio_1;
import Ejercicios.Ejercicio_2;
import Ejercicios.Ejercicio_3;
import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) throws Exception {
    int opcion = Integer.parseInt(
      JOptionPane.showInputDialog(
        "1) Ejercicio 1 -> 1/n'" +
        "\n2) Ejercicio 2 -> Multiplicacion" +
        "\n3) Ejercicio 3 -> 1/n"
      )
    );
    //   int elegir = Integer.parseInt(
    //     JOptionPane.showInputDialog("1) Modo Iterativo" + "\n2) Modo Recursivo")
    //   );

    switch (opcion) {
      case 1:
        Ejercicio_1 obj1 = new Ejercicio_1(5);
        // JOptionPane.showMessageDialog(
        //   null,
        //   "Metodo iterativo: " + obj1.calcSuma_I()+"\nMetodo recursivo: "+obj1.calcSuma_R()
        // );
        JOptionPane.showMessageDialog(null, obj1.calcSuma_R());
        break;
      case 2:
        Ejercicio_2 obj2 = new Ejercicio_2(37, 12);
        JOptionPane.showMessageDialog(null, obj2.multiplicar_R());
        break;
      case 3:
        Ejercicio_3 obj3 = new Ejercicio_3(3);
        // JOptionPane.showMessageDialog(null, obj3.calcSuma_I());
        JOptionPane.showMessageDialog(null, obj3.calcSuma_R());
        break;
      default:
        break;
    }
  }
}
