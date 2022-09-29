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
        JOptionPane.showMessageDialog(
          null,
          "Metodo iterativo: \n" + obj1.calcSuma_I()
        );
        break;
      case 2:
        Ejercicio_2 obj2 = new Ejercicio_2(37, 12);
        JOptionPane.showMessageDialog(null, obj2.multiplicar_I());
        break;
      case 3:
        Ejercicio_3 obj3 = new Ejercicio_3(3);
        JOptionPane.showMessageDialog(null, obj3.calcSuma_I());
        break;
      default:
        break;
    }
  }
}
