/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite;

import javax.swing.JOptionPane;

/**
 *
 * @author Arasa
 */
public class Sqlite {

    /**
     * Menu of the Data Base
     */
    public static void main(String[] args) {
    Metodos objeto = new Metodos("MiBase.db");

        if (objeto.conectar()) {
            System.out.println("Conexión realizada Correctamente");

        } else {

            System.out.println("Error al conectar con la base de datos");
        }

        int menu;
        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Selección \n 1. Insertar Trabajador \n 2.Mostrar Trabajadores  \n 3.Borrar Trabajador \n 4.Modificar Trabajador \n 5 .Salir"));
            switch (menu) {

                case 1:
                    objeto.insertaDatos(Integer.parseInt(JOptionPane.showInputDialog("ID")), JOptionPane.showInputDialog("Nombre"), Integer.parseInt(JOptionPane.showInputDialog("Edad")), JOptionPane.showInputDialog("Direccion"),Float.parseFloat(JOptionPane.showInputDialog("Salario")));
                    break;
                case 2:
                    objeto.muestraDatosTabla();
                    break;
                case 3:
                    objeto.borrar(Integer.parseInt(JOptionPane.showInputDialog("Inserta el ID a borrar")));
                    break;
                case 4:
                    objeto.modificar(Integer.parseInt(JOptionPane.showInputDialog("ID")), JOptionPane.showInputDialog("Nombre"), Integer.parseInt(JOptionPane.showInputDialog("Edad")), JOptionPane.showInputDialog("Direccion"),Float.parseFloat(JOptionPane.showInputDialog("Salario")));
                    break;

            }

        } while (menu !=5);
    }
}
    