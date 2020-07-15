package proyectojava;

import java.util.Scanner;

public class Proyectojava {

    public static void main(String[] args) {
        System.out.println("CRUD EN ARREGLO UNIDIMENSIONAL");
        //String[] a = new String[10];
        String[] arreglo = new String[10];
        //mostrar(temperatura);
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op != 6) {
            System.out.println("1. Registro de usuario");
            System.out.println("2. Modificar registro");
            System.out.println("3. eliminar registro");
            System.out.println("4. mostrar directorio");
            System.out.println("7. busqueda de registro por nombre");
            System.out.println("6. salir");
            System.out.println("ingrese la opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("REGISTRAR");
                    REGISTRAR(arreglo);
                    break;
                case 2:
                    System.out.println("MODIFICAR");
                    MODIFICAR(arreglo);
                    break;
                case 3:
                    System.out.println("ELIMINAR");
                    ELIMINAR(arreglo);
                    break;
                case 4:
                    System.out.println("MOSTRAR DATOS");
                    MOSTRAR(arreglo);
                    break;
                case 7:
                    System.out.println("BUSQUEDA");
                    BUSQUEDA(arreglo);
                    break;
                case 6:
                    System.out.println("TERMINADO");

                    break;
                default:
                    System.out.println("digite una opcion valida");
                    break;
            }
        }

    }

    public static void REGISTRAR(String arreglo[]) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String valor;
        String valor1 = "si";
        String valor2 = "no";
        for (i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                if (i % 2 == 0) {
                    System.out.print("nombre " + i + ": ");
                    arreglo[i] = sc.next();
                } else {
                    if (i % 2 == 1) {
                        System.out.print("telefono " + i + ": ");
                        arreglo[i] = sc.next();
                        if (i % 2 == 1) {
                            System.out.println("ingresar datos si/no");
                            //Scanner sc = new Scanner(System.in);
                            valor = sc.next();
                            if (valor.equalsIgnoreCase(valor1)) {
                            } else {
                                if (valor.equalsIgnoreCase(valor2)) {

                                }
                                break;
                            }
                        }

                    }
                }
            } else {
                System.out.println("ARREGLO O POSICION LLENA");
            }
        }
    }

    public static void MODIFICAR(String arreglo[]) {
        System.out.println("PARA MODIFICAR UN DATO SE DEBE INGRSAR LA POSICION DE UN NUMERO PAR");
        String valor;
        String valor1 = "si";
        String valor2 = "no";
        boolean modif = false;
        do {
            System.out.println("posicion del dato a modificar");
            Scanner sc = new Scanner(System.in);
            int modificarse = sc.nextInt();
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] == null) {
                    System.out.println("El arreglo que busca para modificar esta NULL");
                    System.out.println("desea buscar mas datos para modificar si/no");
                    valor = sc.next();
                    if (valor.equalsIgnoreCase(valor1)) {
                        MODIFICAR(arreglo);
                    } else {
                        if (valor.equalsIgnoreCase(valor2)) {

                        }
                        break;
                    }
                } else {
                    if (i == modificarse) {
                        if (i % 2 == 0) {
                            System.out.println("ingresa el nombre de cambio de: " + arreglo[i]);
                            System.out.print("nombre " + i + ": ");
                            arreglo[i] = sc.next();
                            i = i + 1;
                            System.out.println("ingresa el telefono nuevo: " + arreglo[i]);
                            System.out.print("telefono " + i + ": ");
                            arreglo[i] = sc.next();
                            modif = true;
                            System.out.println("MODIFICACION HECHA");
                            if (i % 2 == 1) {
                                System.out.println("mas datos a modificar si/no");
                                valor = sc.next();
                                if (valor.equalsIgnoreCase(valor1)) {
                                    MODIFICAR(arreglo);
                                } else {
                                    if (valor.equalsIgnoreCase(valor2)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } while (modif == false);
    }

    public static void ELIMINAR(String arreglo[]) {
        System.out.println("PARA ELIMINAR UN DATO SE DEBE INGRSAR LA POSICION DE UN NUMERO PAR");
        String valor;
        String valor1 = "si";
        String valor2 = "no";
        boolean elim = false;
        int eliminarse;
        do {
            System.out.println("posicion del dato a eliminar");
            Scanner sc = new Scanner(System.in);
            eliminarse = sc.nextInt();
            if (eliminarse <= -1 || eliminarse >= 11) {
                System.out.println("el numero no esta en el arreglo");
                ELIMINAR(arreglo);
                break;
            } else {
                for (int i = 0; i < arreglo.length; i++) {
                    if (arreglo[i] == null) {
                        System.out.println("El arreglo que busca para eliminar esta NULL");
                        System.out.println("desea buscar mas datos para eliminar si/no");
                        valor = sc.next();
                        if (valor.equalsIgnoreCase(valor1)) {
                            ELIMINAR(arreglo);
                        } else {
                            if (valor.equalsIgnoreCase(valor2)) {
                                break;
                            }
                        }
                    } else {
                        if (i == eliminarse) {
                            if (i % 2 == 0) {
                                System.out.println("los datos a elimnar son: " + "nombre: " + arreglo[i] + " , telefono: " + arreglo[i + 1]);
                                System.out.println("desea elimnar los datos si/ no");
                                valor = sc.next();
                                if (valor.equalsIgnoreCase(valor1)) {
                                    arreglo[i] = null;
                                    i = i + 1;
                                    arreglo[i] = null;
                                    elim = true;
                                    System.out.println("DATOS ELIMINADOS");
                                    if (i % 2 == 1) {
                                        System.out.println("desea elimar mas datos si/no");
                                        //Scanner sc = new Scanner(System.in);
                                        valor = sc.next();
                                        if (valor.equalsIgnoreCase(valor1)) {
                                            ELIMINAR(arreglo);
                                        } else {
                                            if (valor.equalsIgnoreCase(valor2)) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    if (valor.equalsIgnoreCase(valor2)) {
                                        System.out.println("desea elimar mas datos si/no");
                                        valor = sc.next();
                                        if (valor.equalsIgnoreCase(valor1)) {
                                            ELIMINAR(arreglo);
                                        } else {
                                            if (valor.equalsIgnoreCase(valor2)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (i % 2 == 1) {
                                    System.out.println("la busqueda debe ser con numeros pares");
                                    ELIMINAR(arreglo);
                                }
                            }
                        }
                    }
                }

            }
            break;
        } while (elim == false);
    }

    public static void MOSTRAR(String arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "  ");
        }
        System.out.println();

    }

    public static void BUSQUEDA(String arreglo[]) {
        System.out.println("PARA BUSCAR UN DATO SE DEBE INGRSAR ES EL NOMBRE");
        String valor;
        String valor1 = "si";
        String valor2 = "no";

        System.out.println("ingresa el nombre que desea buscar");
        Scanner sc = new Scanner(System.in);
        String buscar = sc.next();
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i].equalsIgnoreCase(buscar)) {
                if (i % 2 == 0) {

                    System.out.println("datos buscados son los siguientes");
                    System.out.println("nombre: " + arreglo[i] + "  ");
                    System.out.println("telefono: " + arreglo[i + 1] + "  ");
                    System.out.println();
                    System.out.println("desea buscar mas datos si/no");
                    valor = sc.next();
                    if (valor.equalsIgnoreCase(valor1)) {
                        BUSQUEDA(arreglo);
                        break;
                    } else {
                        if (valor.equalsIgnoreCase(valor2)) {
                            break;
                        }
                    }
                    break;
                } else {
                    if (i % 2 == 1) {
                        System.out.println("se debe buscar por el nombre los cuales esyan en la poscion de los numeros pares");
                        BUSQUEDA(arreglo);
                    }
                    break;
                }
            }
        }
    }
}
/*
 public static void busqueda(String arreglo[]) {
        System.out.println("PARA MODIFICAR UN DATO SE DEBE INGRSAR ES EL NOMBRE");
        String valor;
        String valor1 = "si";
        String valor2 = "no";
        System.out.println("ingresa el nombre que desea buscar");
        Scanner sc = new Scanner(System.in);
        String buscar = sc.next();
        for (int i = 0; i < arreglo.length; i++) {
            /*if (arreglo[i] == null) {
                System.out.println("dato de busqueda no se encuentra");
                System.out.println("desea buscar mas datos si/no");
                valor = sc.next();
                if (valor.equalsIgnoreCase(valor1)) {
                    busqueda(arreglo);
                    break;
                } else {
                    if (valor.equalsIgnoreCase(valor2)) {
                        break;
                    }
                }
            } else {*/
          /*  if (arreglo[i].equalsIgnoreCase(buscar)) {
                if (i % 2 == 0) {

                    System.out.println("datos buscados son los siguientes");
                    System.out.println("nombre: " + arreglo[i] + "  ");
                    System.out.println("telefono: " + arreglo[i + 1] + "  ");
                    System.out.println();
                    System.out.println("desea buscar mas datos si/no");
                    valor = sc.next();
                    if (valor.equalsIgnoreCase(valor1)) {
                        busqueda(arreglo);
                        break;
                    } else {
                        if (valor.equalsIgnoreCase(valor2)) {
                            break;
                        }
                    }
                    break;
                } else {
                    if (i % 2 == 1) {
                        System.out.println("se debe buscar por el nombre los cuales esyan en la poscion de los numeros pares");
                        busqueda(arreglo);
                    }
                    break;
                }
            } else {
                if (arreglo[i] != buscar) {
                    System.out.println("NOMBRE BUSCADO NO SE ENCUENTRA");
                    System.out.println("desea buscar mas datos si/no");
                    valor = sc.next();
                    if (valor.equalsIgnoreCase(valor1)) {
                        busqueda(arreglo);
                        break;
                    } else {
                        if (valor.equalsIgnoreCase(valor2)) {
                            break;
                        }
                    }
                }

            }
            //}
        }
    }*/