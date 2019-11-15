/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Persona {

    String[] arrayPersonas = new String[5];
    public int opcion1, opcion2, opcion3, opcion4, opcion5, opcion6;
    Scanner sc = new Scanner(System.in);
    public String nombre, apellido, direccion;
    public int edad, telefono;
    public ArrayList<Telefono> telefonos = new ArrayList();

    public Persona() {
        this.menu();
    }

    private Persona(String nombre, String apellido, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public int compareTo(Persona o) {
        if (edad < o.edad) {
            return -1;
        }
        if (edad > o.edad) {
            return 1;
        }
        return 0;

    }

    public void compareTo2() {
        Arrays.sort(arrayPersonas);
        System.out.println("Arrays ordenadas por edad");
        System.out.println(arrayPersonas);
    }

    public void menu() {
        System.out.println("---------------------------------------------------");
        System.out.println("SELECIONE UNA DE LAS OPCIONES MOSTRADAS EN PANTALLA\n"
                + "1. ESCRIBIR NUEVO ARRAY\n"
                + "2. MODIFICAR UN ARRAY\n"
                + "3. LEER ARRAYS\n"
                + "4. CAMBIAR TODOS LOS ARRAYS\n"
                + "5. MOSTRAR SOLO LOS NOMBRES COMPLETOS DE LAS ARRAYS\n"
                + "6. FINALIZAR");
        System.out.println("---------------------------------------------------");
        opcion1 = sc.nextInt();
        this.eleccion(opcion1);
    }

    public void escribir() {
        System.out.println("-----------------------------------------------------");
        System.out.print("ingresar nombre: ");
        String ini = sc.nextLine();//SOLUCIONADOR
        nombre = sc.nextLine();
        System.out.print("ingrese apellido: ");
        apellido = sc.nextLine();
        System.out.print("digite la edad: ");
        edad = sc.nextInt();
//        System.out.println("digite el telefono: ");
        telefonos.add(new Telefono(JOptionPane.showInputDialog("Escriba el tipo"), JOptionPane.showInputDialog("Digite el numero")));
        System.out.print("ingrese la direccion: ");
        String fin = sc.nextLine();//SOLUCIONADOR
        direccion = sc.nextLine();
        System.out.println("----------------------------------------------------");
        System.out.println("En que array desea guardar la informacion\n"
                + "ARRAY #1\n"
                + "ARRAY #2\n"
                + "ARRAY #3\n"
                + "ARRAY #4\n"
                + "ARRAY #5\n");
        System.out.println("----------------------------------------------------");
        opcion2 = sc.nextInt();
        this.guardar(opcion2);
    }

    public void guardar(int op2) {
        if (op2 >= 1) {
            if (op2 <= 5) {
                switch (op2) {
                    case 1:
                        arrayPersonas[0] = new String("Nombre: " + nombre + "\n"
                                + "Apellido: " + apellido + "\n"
                                + "edad: " + edad + "\n"
                                + "telefono: " + telefonos.get(0).tipo + " " + telefonos.get(0).telefono + "\n"
                                + "direccion: " + direccion + "\n");
                        this.continuacion();
                        break;
                    case 2:
                        arrayPersonas[1] = new String("Nombre: " + nombre + "\n"
                                + "Apellido: " + apellido + "\n"
                                + "edad: " + edad + "\n"
                                + "telefono: " + telefono + "\n"
                                + "direccion: " + direccion + "\n");
                        this.continuacion();
                        break;
                    case 3:
                        arrayPersonas[2] = new String("Nombre: " + nombre + "\n"
                                + "Apellido: " + apellido + "\n"
                                + "edad: " + edad + "\n"
                                + "telefono: " + telefono + "\n"
                                + "direccion: " + direccion + "\n");
                        this.continuacion();
                        break;
                    case 4:
                        arrayPersonas[3] = new String("Nombre: " + nombre + "\n"
                                + "Apellido: " + apellido + "\n"
                                + "edad: " + edad + "\n"
                                + "telefono: " + telefono + "\n"
                                + "direccion: " + direccion + "\n");
                        this.continuacion();
                        break;
                    case 5:
                        arrayPersonas[4] = new String("Nombre: " + nombre + "\n"
                                + "Apellido: " + apellido + "\n"
                                + "edad: " + edad + "\n"
                                + "telefono: " + telefono + "\n"
                                + "direccion: " + direccion + "\n");
                        this.continuacion();
                        break;
                }

            } else {
                System.out.println("NO A SELECCIONADO NINGUNA OPCION VALIDA! sera redireccionado al menu");
                this.menu();
            }
        } else {
            System.out.println("NO A SELECCIONADO NINGUNA OPCION VALIDA! sera redireccionado al menu");
            this.menu();
        }
    }

    public void leer() {
        System.out.println("ARRAY #1");
        System.out.println(arrayPersonas[0]);
        System.out.println("ARRAY #2");
        System.out.println(arrayPersonas[1]);
        System.out.println("ARRAY #3");
        System.out.println(arrayPersonas[2]);
        System.out.println("ARRAY #4");
        System.out.println(arrayPersonas[3]);
        System.out.println("ARRAY #5");
        System.out.println(arrayPersonas[4]);
        this.menu();
    }

    public void continuacion() {
        System.out.println("ARRAY GUARDADO EXITOSAMENTE!");
        System.out.println("----------------------------------------------------");
        System.out.println("1. escribir otra array\n"
                + "2. volver al menu\n"
                + "3. Finalizar");
        System.out.println("----------------------------------------------------");

        opcion3 = sc.nextInt();
        this.eleContinuacion(opcion3);

    }

    public void eleContinuacion(int op3) {
        if (op3 >= 1) {
            if (op3 <= 3) {
                do {
                    switch (op3) {
                        case 1:
                            this.escribir();
                            break;
                        case 2:
                            this.menu();
                            break;
                    }
                } while (op3 != 3);
            } else {
                System.out.println("NO A SELECCIONADO NINGUNA OPCION VALIDA! sera redireccionado al menu");
                this.menu();
            }
        } else {
            System.out.println("NO A SELECCIONADO NINGUNA OPCION VALIDA! sera redireccionado al menu");
            this.menu();
        }
    }

    public void modificar() {
        System.out.println("---------------------------------------------------");
        System.out.println("que array desea modificar?\n"
                + "ARRAY #1\n"
                + "ARRAY #2\n"
                + "ARRAY #3\n"
                + "ARRAY #4\n"
                + "ARRAY #5");
        System.out.println("---------------------------------------------------");
        opcion4 = sc.nextInt();
        this.modificando(opcion4);
    }

    public void modificando(int op4) {
        String init, fin;

        switch (op4) {
            case 1:
                System.out.println("Escriba la nueva informacion: ");
                System.out.println("-------------------------------------------");
                System.out.print("NOMBRE: ");
                init = sc.nextLine();//SOLUCIONADOR
                nombre = sc.nextLine();
                System.out.print("APELLIDO: ");
                apellido = sc.nextLine();
                System.out.print("EDAD: ");
                edad = sc.nextInt();
                System.out.print("TELEFONO: ");
                telefono = sc.nextInt();
                System.out.print("DIRECCION: ");
                fin = sc.nextLine();//SOLUCIONADOR
                direccion = sc.nextLine();
                System.out.println("-------------------------------------------");
                arrayPersonas[0] = new String("Nombre: " + nombre + "\n"
                        + "Apellido: " + apellido + "\n"
                        + "edad: " + edad + "\n"
                        + "telefono: " + telefono + "\n"
                        + "direccion: " + direccion + "\n");
                this.menu();
            case 2:
                System.out.println("Escriba la nueva informacion: ");
                System.out.println("-------------------------------------------");
                System.out.print("NOMBRE: ");
                init = sc.nextLine();//SOLUCIONADOR
                nombre = sc.nextLine();
                System.out.print("APELLIDO: ");
                apellido = sc.nextLine();
                System.out.print("EDAD: ");
                edad = sc.nextInt();
                System.out.print("TELEFONO: ");
                telefono = sc.nextInt();
                System.out.print("DIRECCION: ");
                fin = sc.nextLine();//SOLUCIONADOR
                direccion = sc.nextLine();
                System.out.println("-------------------------------------------");
                arrayPersonas[1] = new String("Nombre: " + nombre + "\n"
                        + "Apellido: " + apellido + "\n"
                        + "edad: " + edad + "\n"
                        + "telefono: " + telefono + "\n"
                        + "direccion: " + direccion + "\n");
                this.menu();
            case 3:
                System.out.println("Escriba la nueva informacion: ");
                System.out.println("-------------------------------------------");
                System.out.print("NOMBRE: ");
                init = sc.nextLine();//SOLUCIONADOR
                nombre = sc.nextLine();
                System.out.print("APELLIDO: ");
                apellido = sc.nextLine();
                System.out.print("EDAD: ");
                edad = sc.nextInt();
                System.out.print("TELEFONO: ");
                telefono = sc.nextInt();
                System.out.print("DIRECCION: ");
                fin = sc.nextLine();//SOLUCIONADOR
                direccion = sc.nextLine();
                System.out.println("-------------------------------------------");
                arrayPersonas[2] = new String("Nombre: " + nombre + "\n"
                        + "Apellido: " + apellido + "\n"
                        + "edad: " + edad + "\n"
                        + "telefono: " + telefono + "\n"
                        + "direccion: " + direccion + "\n");
                this.menu();
            case 4:
                System.out.println("Escriba la nueva informacion: ");
                System.out.println("-------------------------------------------");
                System.out.print("NOMBRE: ");
                init = sc.nextLine();//SOLUCIONADOR
                nombre = sc.nextLine();
                System.out.print("APELLIDO: ");
                apellido = sc.nextLine();
                System.out.print("EDAD: ");
                edad = sc.nextInt();
                System.out.print("TELEFONO: ");
                telefono = sc.nextInt();
                System.out.print("DIRECCION: ");
                fin = sc.nextLine();//SOLUCIONADOR
                direccion = sc.nextLine();
                System.out.println("-------------------------------------------");
                arrayPersonas[3] = new String("Nombre: " + nombre + "\n"
                        + "Apellido: " + apellido + "\n"
                        + "edad: " + edad + "\n"
                        + "telefono: " + telefono + "\n"
                        + "direccion: " + direccion + "\n");
                this.menu();
            case 5:
                System.out.println("Escriba la nueva informacion: ");
                System.out.println("-------------------------------------------");
                System.out.print("NOMBRE: ");
                init = sc.nextLine();//SOLUCIONADOR
                nombre = sc.nextLine();
                System.out.print("APELLIDO: ");
                apellido = sc.nextLine();
                System.out.print("EDAD: ");
                edad = sc.nextInt();
                System.out.print("TELEFONO: ");
                telefono = sc.nextInt();
                System.out.print("DIRECCION: ");
                fin = sc.nextLine();//SOLUCIONADOR
                direccion = sc.nextLine();
                System.out.println("-------------------------------------------");
                arrayPersonas[4] = new String("Nombre: " + nombre + "\n"
                        + "Apellido: " + apellido + "\n"
                        + "edad: " + edad + "\n"
                        + "telefono: " + telefono + "\n"
                        + "direccion: " + direccion + "\n");
                this.menu();
        }
    }

    public void duda() {
        System.out.println("----------------------------------------------------");
        System.out.println("seguro desea reescribir todos los arrays?"
                + "1. SI"
                + "2. NO");
        opcion5 = sc.nextInt();
        this.quitarDuda(opcion5);
    }

    public void quitarDuda(int op5) {
        if (op5 >= 1) {
            if (op5 <= 2) {
                switch (op5) {
                    case 1:
                        this.escribir();
                        break;
                    case 2:
                        this.menu();
                }
            } else {
                System.out.println("Eleccion equivocada!! sera regresado al manu");
                this.menu();
            }
        } else {
            System.out.println("Eleccion equivocada!! sera regresado al menu");
            this.menu();
        }
    }

    public void nombreCompleto() {
        System.out.println("---------------------------------------------------");
        System.out.println("Nombres completos");
        System.out.print("ARRAY #1: ");
        arrayPersonas[0] = new String(nombre + " " + apellido + "\n");
        System.out.print("ARRAY #2: ");
        arrayPersonas[1] = new String(nombre + " " + apellido + "\n");
        System.out.print("ARRAY #3: ");
        arrayPersonas[2] = new String(nombre + " " + apellido + "\n");
        System.out.print("ARRAY #4: ");
        arrayPersonas[3] = new String(nombre + " " + apellido + "\n");
        System.out.print("ARRAY #5: ");
        arrayPersonas[4] = new String(nombre + " " + apellido + "\n");
    }

    public void eleccion(int op1) {
        if (op1 >= 1) {
            if (op1 <= 6) {
                do {
                    switch (op1) {
                        case 1:
                            this.escribir();
                            break;
                        case 2:
                            this.modificar();
                            break;
                        case 3:
                            this.leer();
                            break;
                        case 4:
                            this.duda();
                            break;
                        case 5:
                            this.nombreCompleto();
                            break;
                    }
                } while (op1 != 6);
            } else {
                System.out.println("NO A SELECCIONADO NINGUNA OPCION VALIDA! sera redireccionado al menu");
                this.menu();
            }
        } else {
            System.out.println("NO A SELECCIONADO NINGUNA OPCION VALIDA! sera redireccionado al menu");
            this.menu();
        }
    }
}
