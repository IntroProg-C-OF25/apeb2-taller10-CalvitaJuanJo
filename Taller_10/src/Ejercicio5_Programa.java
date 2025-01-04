/**
 * Crea un programa que gestione el inventario de una tienda, así como la
 * emisión de facturas. Utiliza una matriz bidimensional para almacenar los
 * productos disponibles en la tienda, con información como nombre, precio y
 * cantidad. El programa debe permitir facturar un producto dado su código, y
 * unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y
 * si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso,
 * muestre la alerta respectiva.
 *
 * @author Juan Jose Calva
 */

import java.util.Scanner;

public class Ejercicio5_Programa {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);

        int tproductos = 3; 
        String[][] inventario = new String[tproductos][3];

        System.out.println("Ingreso de los productos");
        for (int i = 0; i < tproductos; i++) {
            System.out.println("Producto #" + (i + 1));
            System.out.print("Nombre del producto: ");
            inventario[i][0] = tcl.nextLine();
            System.out.print("Precio del producto: ");
            inventario[i][1] = tcl.nextLine(); 
            System.out.print("Stock del producto: ");
            inventario[i][2] = tcl.nextLine(); 
        }

        char continuar = 0;
        System.out.println("\nSistema de facturacion de productos");
        
        do {
            System.out.print("Ingrese el numero del producto(1-" + tproductos + "): ");
            int posiciondeproducto = tcl.nextInt() - 1; 
            if (posiciondeproducto < 0 || posiciondeproducto >= tproductos) {
                System.out.println("Producto no valido");
                continue;
            }

            System.out.print("Cantidad de productos a comprar: ");
            int cantidad = tcl.nextInt();

            int stockactpro = Integer.parseInt(inventario[posiciondeproducto][2]); 
            if (cantidad > stockactpro) {
                System.out.println("Stock insuficiente. Solo dispones " + stockactpro + " unidades");
            } else {

                double precio = Double.parseDouble(inventario[posiciondeproducto][1]);
                double subtotal = precio * cantidad;
                double iva = subtotal * 0.15;
                double total = subtotal + iva;

                if (total > 100) {
                    total *= 0.90; 
                    System.out.println("Se ha aplicado un 10% de descuento por la compra mayor a $100,00.");
                }

                inventario[posiciondeproducto][2] = String.valueOf(stockactpro - cantidad);

                System.out.println("\nFactura a imprimir");
                System.out.println("Producto: " + inventario[posiciondeproducto][0]);
                System.out.println("Cantidad: " + cantidad);
                System.out.printf("Subtotal: $%.2f\n", subtotal);
                System.out.printf("IVA (15%%): $%.2f\n", iva);
                System.out.printf("Total: $%.2f\n", total);
            }

            System.out.print("\nDesea facturar algun otro producto?");
            continuar = tcl.next().toLowerCase().charAt(0);
           tcl.nextLine(); 
        } while (continuar == 's');

        System.out.println("\nInventario actualizado");
        for (int i = 0; i < tproductos; i++) {
            System.out.println("Producto: " + inventario[i][0] + ", Precio: $" + inventario[i][1] + ", Stock: " + inventario[i][2]);
        }
    }
}

/**
 * BLOQUE DE COMENTARIOS
 * 
 * run:
 * Ingreso de los productos
 * Producto #1
 * Nombre del producto: Lava
 * Precio del producto: 2,00
 * Stock del producto: 5
 * Producto #2
 * Nombre del producto: Pasta Dental
 * Precio del producto: 0.90
 * Stock del producto: 5
 * Producto #3
 * Nombre del producto: Suavizante
 * Precio del producto: 1,97
 * Stock del producto: 5
 * 
 * Sistema de facturacion de productos
 * Ingrese el numero del producto(1-3): 2
 * Cantidad de productos a comprar: 2
 * 
 * Factura a imprimir
 * Producto: Pasta Dental
 * Cantidad: 2
 * Subtotal: $1,80
 * IVA (15%): $0,27
 * Total: $2,07
 * 
 * Desea facturar algun otro producto?
 * no
 * 
 * Inventario actualizado
 * Producto: Lava, Precio: $2,00, Stock: 5
 * Producto: Pasta Dental, Precio: $0.90, Stock: 3
 * Producto: Suavizante, Precio: $1,97, Stock: 5
 * BUILD SUCCESSFUL (total time: 1 minute 39 seconds)
 */