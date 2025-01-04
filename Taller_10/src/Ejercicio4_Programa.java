/**
 * Crea un programa que gestione el inventario de una tienda. Utiliza una matriz
 * bidimensional para almacenar los productos disponibles en la tienda, con
 * información como nombre, precio y cantidad. El programa debe permitir agregar
 * nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 * 
 * @author Juan Jose Calva
 */

import java.util.Scanner;

public class Ejercicio4_Programa {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        
        String[][] productos = new String[50][3]; 
        int tproductos = 0; 
        
        int opcion; 
        
        do {
            System.out.println("\nGestion de inventario...");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar existentes");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opccion : ");
            opcion = tcl.nextInt();
            tcl.nextLine(); 
           
            switch (opcion) {
                case 1:
                    if (tproductos < productos.length) {
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = tcl.nextLine();
                        System.out.print("Ingrese el precio del producto: ");
                        String precio = tcl.nextLine();
                        System.out.print("Ingrese la cantidad del producto: ");
                        String cantidad = tcl.nextLine();
                        
                        productos[tproductos][0] = nombre;
                        productos[tproductos][1] = precio;
                        productos[tproductos][2] = cantidad;
                        tproductos++;
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("El inventario esta a full.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto que desea actualizar: ");
                    String proactualizar = tcl.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < tproductos; i++) {
                        if (productos[i][0].equalsIgnoreCase(proactualizar)) {
                            System.out.print("Ingrese la cantidad nueva: ");
                            productos[i][2] = tcl.nextLine();
                            System.out.println("Cantidad actualizada exitosamente.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String probuscar = tcl.nextLine();
                    encontrado = false;
                    for (int i = 0; i < tproductos; i++) {
                        if (productos[i][0].equalsIgnoreCase(probuscar)) {
                            System.out.println("Producto: " + productos[i][0] +
                                               ", Precio: " + productos[i][1] +
                                               ", Cantidad: " + productos[i][2]);
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el producto a eliminar: ");
                    String proeliminar = tcl.nextLine();
                    encontrado = false;
                    for (int i = 0; i < tproductos; i++) {
                        if (productos[i][0].equalsIgnoreCase(proeliminar)) {
                            for (int j = i; j < tproductos - 1; j++) {
                                productos[j] = productos[j + 1];
                            }
                            productos[tproductos - 1] = null;
                            tproductos--;
                            System.out.println("Producto eliminado exitosamente.");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);

        tcl.close();
    }
}

/**
 * BOQUE DE COMENTARIOS
 * 
 * run:
 * 
 * Gestion de inventario...
 * 1. Agregar producto
 * 2. Actualizar existentes
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Salir
 * Seleccione una opccion : 1
 * Ingrese el nombre del producto: salchicha vienessa
 * Ingrese el precio del producto: 5,45
 * Ingrese la cantidad del producto: 15
 * Producto agregado exitosamente.
 * 
 * Gestion de inventariO...
 * 1. Agregar producto
 * 2. Actualizar existentes
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Salir
 * Seleccione una opccion : 2
 * Ingrese el nombre del producto que desea actualizar: salchicha vienessa
 * Ingrese la cantidad nueva: 20
 * Cantidad actualizada exitosamente.
 * 
 * Gestion de inventariO...
 * 1. Agregar producto
 * 2. Actualizar existentes
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Salir
 * Seleccione una opccion : 3
 * Ingrese el nombre del producto a buscar: salchicha vienessa
 * Producto: salchicha vienessa, Precio: 5,45, Cantidad: 20
 * 
 * Gestion de inventariO...
 * 1. Agregar producto
 * 2. Actualizar existentes
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Salir
 * Seleccione una opccion : 4
 * Ingrese el producto a eliminar: salchicha vienessa
 * Producto eliminado exitosamente.
 * 
 * Gestion de inventariO...
 * 1. Agregar producto
 * 2. Actualizar existentes
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Salir
 * Seleccione una opccion : 5
 * Saliendo del sistema...
 * BUILD SUCCESSFUL (total time: 1 minute 46 seconds)
 */