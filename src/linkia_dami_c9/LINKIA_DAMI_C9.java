/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c9;

import java.util.Arrays;
import java.util.Scanner;

import linkia_dami_c9.preguntas.Pregunta;
/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        //Alumnos : Oriol Alba Mireia Marc Marta Jordi ->6 alumnos
        //Notas : [1 2 7 9 6] -> 5 notas
        int numero;

        numero = 3;

        int nota1 = 1, nota2 = 2, nota3 = 7, nota4;

        int numero2;

        //Opcion 1
        int notas[];

        notas = new int[5];

        //Opcion 2
        int[] notas2;

        notas = new int[5];

        //Opcion 3 -> Declaramos un array pero estara vacío
        int[] notas3 = new int[5];

        /*
        CUANDO CREAMOS UN ARRAY VACIO DE INT
        SE RELLENA CON 0
        CUANDO CREAMOS UN ARRAY VACIO DE STRING
        SE RELLENA CON NULL
         */
        System.out.println("Que hay en la pos[0] del array notas3? " + notas3[0]);

        //notas 0 0 0 0 0
        //Opción 4 -> Definir un array y llenarlo de valores
        int[] notas4 = {1, 2, 3, 4, 5};  //En tiempo de ejecución el calcula el tamaño en base a los valores que hay dentro
        //              0 1 2 3 4

        //Para saber el tamaño de nuestro array usamos .length
        System.out.println("Tamaño:" + notas4.length);

        System.out.println("Que nota hay en la posicion 1:" + notas4[0]);
        System.out.println("Que nota hay en la posicion 5:" + notas4[notas4.length - 1]);

        //Crearíamos un array de dias del tipo String con tamaño 4
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves"};

        String[] meses = new String[12];

        double[] num = new double[5];

        //Por defecto un array sin rellenar de String se rellena con null
        System.out.println("Que mes es el mes[8]? " + meses[8]);

        //Guardar en una variable el valor de un array
        int sumaTotal = notas4[0] + notas4[1];
        System.out.println("Suma de notas:" + sumaTotal);

        //int[] notas4 = {1,2,3,4,5};  //En tiempo de ejecución el calcula el tamaño en base a los valores que hay dentro
        //                0 1 2 3 4
        /*Modificar una posición del array en base a un nuevo valor*/
        System.out.println("Que nota hay en la pos[0]:" + notas4[0]);

        System.out.println("Introduce la nueva nota para el primer examen");
        int nuevaNota = sc.nextInt();

        notas4[0] = nuevaNota;

        System.out.println("Que nota hay en la pos[0]:" + notas4[0]);

        /*Crear un array con un valor del usuario y modificar los valores del array*/
        //Alumnos : Oriol Alba Mireia Marc Marta Jordi -> 6 alumnos
        System.out.println("Oye, dime cuantos contactos quieres tener?");
        int numeroCont = sc.nextInt();
        
       
        
        //Primera forma de crear los contactos
        /*Creamos el array vacío y luego le ponemos los valores*/
        String[] contactos = new String[numeroCont];

        contactos[0] = "Oriol";
        contactos[1] = "Alba";
        contactos[2] = "Mireia";
        contactos[3] = "Marc";
        contactos[4] = "Marta";
        contactos[5] = "Jordi";

        //Segunda forma de crear los contactos
        /*Creamos el array y al mismo tiempo le ponemos los valores*/
        String[] contactos2 = {"Oriol", "Alba", "Mireia", "Marc", "Marta", "Jordi"};

        /*RECORRER UN ARRAY*/
        int[] puntos = {22, 33, 15, 61, 66, 22};

        int total = 0;
        for (int i = 0; i < puntos.length; i++) {

            System.out.println("Puntos conseguidos en la tirada " + (i + 1) + " ->" + puntos[i]);
            if (puntos[i] == 15) {
                System.out.println("El 15 esta dentro");
            }
            
            total += puntos[i];
            System.out.println("El total de puntos es:" + total);

        }

        for (int i = 0; i < contactos.length; i++) {
            //Controlo que no salgan los null
            if (contactos[i] != null) {
                System.out.println("Tu contacto es:" + contactos[i]);
                //Una vez se que no es null puedo comprobar si hay un contacto que se llame Alba
                if (contactos[i].equalsIgnoreCase("Alba")) {
                    System.out.println("Que nombre tan chuli!");
                }
            }
        }
        
        /*Recorrer un array y pedir valores*/

        int[] valores = new int[3];
        /*
        for(int i = 0;i<valores.length;i++){
            System.out.println("Introduce el valor para la pos" + i);
            valores[i] = sc.nextInt();
        }*/
        
        
        //int[] puntos = {22, 33, 15, 61, 66, 22};
        
        //ORDENAR UN ARRAY UTILIZANDO Arrays.sort
        
        System.out.println("PUNTOS SIN ORDENAR");
        for(int i=0;i<puntos.length;i++){
            System.out.println("Punto en la pos " + i + " " + puntos[i]);
        }
        
        //Simplemente lo llamo, y él por detrás ya me lo ordena
        Arrays.sort(puntos);
        

        System.out.println("PUNTOS ORDENADOS");
        for(int i=0;i<puntos.length;i++){
            System.out.println("Punto en la pos " + i + " " + puntos[i]);
        }
        
        //Permite rellenar todo el array con valores por defecto
        Arrays.fill(puntos, 10);
        
        System.out.println("PUNTOS SETEADOS A 10");
        for(int i=0;i<puntos.length;i++){
            System.out.println("Punto en la pos " + i + " " + puntos[i]);
        }
        
        /*Incluir una clase a nuestro proyectos*/
        int preg = Pregunta.pideEntero("Introduce un valor");
        
    }

}
