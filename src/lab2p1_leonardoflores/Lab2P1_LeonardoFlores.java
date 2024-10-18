/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_leonardoflores;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author kisam
 */
public class Lab2P1_LeonardoFlores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op, tab1, tab2, mult1=0, mult2=0, resp1, resp2, puntos_j, puntos_c, opj2, ronda=1;
        Scanner yoko = new Scanner(System.in);
        Random hattori = new Random();
        System.out.println("Menu de Opciones");
        System.out.println("1-Numeros comunes en multiplicacion");
        System.out.println("2-Juego de suerte");
        System.out.println("3-Llenar el trapecio");
        System.out.println("4-salida");
        System.out.println("Elija una opcion:");
        op = yoko.nextInt();
        while (op!=4){
            if (op==1) {
                System.out.println("Ingrese numero de la primera tabla");
                tab1 = yoko.nextInt();
                System.out.println("Ingrese numero de la segunda tabla");
                tab2 = yoko.nextInt();
                System.out.print("Numeros de tabla de encontrados en tabla de: ");
                mult1=0;
                while (mult1<=12) {
                    ++mult1;
                    resp1 = mult1*tab1;
                    do {
                        ++mult2;
                        resp2 = mult2*tab2;
                        if (resp1==resp2) {
                            System.out.print(resp1+" ");
                        }
                    } while (mult2<=12 || resp1==resp2);
                    if (resp1!=resp2) {
                    System.out.print("_ ");
                    }
                    mult2 = 0;
                }
                System.out.println(" ");
            }
            else if (op==2) {
                puntos_j = (hattori.nextInt(10)+1);
                puntos_c = (hattori.nextInt(10)+1);
                System.out.println("Ronda: "+ronda);
                System.out.println("puntos de jugador: "+puntos_j);
                System.out.println("puntos de computadora: "+puntos_c);
                System.out.println("-----------------------");
                System.out.println("Que desea hacer?");
                System.out.println("1) Agregar 1");
                System.out.println("2) Agregar 2");
                System.out.println("3) Seguir");
                System.out.println("4) Terminar");
                opj2 = yoko.nextInt();
                while (ronda<=3 || opj2!=4 || puntos_j<21 || puntos_c<21) {
                    if (opj2==1) {
                        puntos_j++;
                    }
                    else if (opj2==2) {
                        puntos_j = puntos_j+2;
                    }
                    else if (opj2==3) {
                        ronda++;
                    }
                    else if (opj2>4) {
                        System.out.println("Ingrese una opcion aceptable");
                    }
                    System.out.println("Ronda: "+ronda);
                    System.out.println("puntos de jugador: "+puntos_j);
                    System.out.println("puntos de computadora: "+puntos_c);
                    System.out.println("-----------------------");
                    System.out.println("Que desea hacer?");
                    System.out.println("1) Agregar 1");
                    System.out.println("2) Agregar 2");
                    System.out.println("3) Seguir");
                    System.out.println("4) Terminar");
                    opj2 = yoko.nextInt();
                }
                if (puntos_j>puntos_c && puntos_j<=21) {
                    System.out.println("Hooray! has ganado chaval");
                }
                else if (puntos_c>puntos_j && puntos_c<=21) {
                    System.out.println("Womp womp has perdido");
                }
                else {
                    System.out.println("Empataste con la maquina");
                }
            }
            else if (op==3) {
                System.out.println("sex");
            }
            else if (op>4) {
                System.out.println("Ingrese una opcion correcta carechimba");
            }
        }
    }
    
}
