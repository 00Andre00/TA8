package Matriz;

import javax.swing.*;

public class MatrizT {

    private int matriz[][];
    private int fila;
    private int columna;
    private int valores;

    public MatrizT() {

        fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas"));
        columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas"));

        this.matriz = new int[fila][columna];
    }

    public void addMatriz(){

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los valores de la matriz"));
                this.matriz[i][j] = this.valores;
            }
        }
    }

    public void mostrarMatriz(){

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.printf("%d ",this.matriz[i][j]);
            }
            System.out.println();
        }
    }

    public void transpuestaM(){

        for (int i = 0; i < columna; i++){
            for (int j = 0; j < fila; j++){
                System.out.printf("%d ",this.matriz[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        MatrizT transpuesta = new MatrizT();
        transpuesta.addMatriz();
        System.out.println("Matriz inicial");
        transpuesta.mostrarMatriz();
        System.out.println("");
        System.out.println("Transpuesta");
        transpuesta.transpuestaM();
    }
}
