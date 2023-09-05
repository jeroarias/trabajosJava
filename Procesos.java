package ejercicios;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Procesos {

    public Procesos() {
       nombre();
       numayor();
       aleatorio();
       mayorArreglo();
       mayorList();
        
    }

    public void nombre() {
        JOptionPane.showMessageDialog(null, "EJERCICIO #1");
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre ");
        System.out.println("Hola " + nombre + ", ¿cómo estás?");
    }

    public void numayor() {
        JOptionPane.showMessageDialog(null, "EJERCICIO #2");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el número que desees"));
        if (n > 10) {
            System.out.println(n + " es mayor a 10");
        } else {
            System.out.println(n + " es menor que 10");
        }
    }

    public int aleatorio() {
        JOptionPane.showMessageDialog(null, "EJERCICIO #3");
        int n = (int) (Math.random() * 100);
        System.out.println("El número asignado aleatoriamente es: " + n);
        return n;
    }

    public int[] mayorArreglo() {
        JOptionPane.showMessageDialog(null, "EJERCICIO #4");
        int[] n = new int[5];
        int mayor = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número a la cadena"));
            if (n[i] > mayor) {
                mayor = n[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        return n;
    }

    public ArrayList<Integer> mayorList() {
        JOptionPane.showMessageDialog(null, "EJERCICIO #5");
        ArrayList<Integer> listas = new ArrayList<Integer>();
        int mayor = 0;
        int n1 = 4; 
        for (int i = 0; i < n1; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número a tu lista"));
            listas.add(numero);
            if (numero > mayor) {
                mayor = numero;
            }
            System.out.println(listas);
        }
        System.out.println("el numero mayor de la lista es "+ mayor);
        return listas;
    }
}
