/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas.yare;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class PILASYARE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pila[] = new int[10];
        Pila objPilaEnteros = new Pila(pila);
            objPilaEnteros.insertar(90);
    objPilaEnteros.insertar(56);
    objPilaEnteros.insertar(23);
    objPilaEnteros.insertar(12);

        int opcion = 0;
        String menu = "";
        do {
            menu = "";
            menu += " Menú\n";
            menu += "1.-Mostrar  \n";
            menu += "2.-Cima \n";
            menu += "3.-Fondo \n";
            menu += "4.-Insertar \n";
            menu += "5.- Salir \n";
            
//            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:

                    objPilaEnteros.mostrarPila();
                    break;
                case 2:

                    objPilaEnteros.cima();

                    break;
                case 3:

                    objPilaEnteros.fondo();

                    break;
                case 4:
                  
                    objPilaEnteros.insertar(opcion);
                   break;
                case 5:
                    System.out.println("Adios");

                    break;

               

            }
        }
        while (opcion!= 4);
    }
}



//    
//    
//    objPilaEnteros.mostrarPila();
//    objPilaEnteros.cima();
//    objPilaEnteros.fondo();
//    
//    objPilaEnteros.retirar();
//    objPilaEnteros.mostrarPila();

