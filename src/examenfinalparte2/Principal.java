package examenfinalparte2;

import javax.swing.JOptionPane;

/**
 * Clase Main del Proyecto contador.
 *
 * @author igonzalezcastro
 */
public class Principal {

    public static boolean p = false;

    public static void main(String arg[]) {
        /**
         * Introducimos el numero de digitos.
         */
        int dig = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de digitos : "));;
        int ndig = 0;

        /**
         * Si es menor que 1,mostrara un error. Si es mayor que uno,entrar en el
         * bucle.
         */
        if (dig <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");

        }
        Contador(dig);
    }

    public static void Contador(int dig) {
        int ndig;
        /**
         * Bucle que va a recorrer la variable int i,cada vuelta se le ira
         * sumando a i++.
         */
        for (int i = 1; i <= 99999; i++) {
            int aux = i;

            int contador = 0;

            while (aux != 0) {
                aux = aux / 10;
                contador++;
            }
            /**
             * Se le asigna a la variable ndig el valor de la variable contador.
             * Aqui comienzan las condiciones si se va a mostrar en pantalla o
             * no.
             */
            ndig = contador;

            if (ndig == dig) {
                if (i < 4) {
                    p = true;
                } else {
                    if (i % 2 == 0) {
                        p = false;
                    } else {
                        int contador1 = 0;
                        int i1 = 1;
                        int k = (i - 1) / 2;
                        if (k % 2 == 0) {
                            k--;
                        }

                        while (i1 <= k) {
                            if (i % i1 == 0) {
                                contador1++;
                            }
                            i1 += 2;
                            if (contador1 == 2) {
                                i1 = k + 1;
                            }
                        }

                        if (contador1 == 1) {
                            p = true;
                        }
                    }
                }
                /**
                 * Si es igual a true, se mostrara en pantalla.
                 */
                if (p == true) {
                    System.out.println(i);
                }
            }
        }
    }
}
