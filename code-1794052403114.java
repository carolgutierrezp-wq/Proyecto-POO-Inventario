import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        int opcion = 0;

        String[] categorias = {"Aseo", "Alimentos", "Tecnología"};

        do {
            System.out.println("\n=================================");
            System.out.println("    SISTEMA DE INVENTARIO");
            System.out.println("=================================");
            System.out.print("Categorías en tienda: ");
            for (int i = 0; i < categorias.length; i++) {
                System.out.print(categorias[i] + (i < categorias.length - 1 ? ", " : "\n"));
            }
            System.out.println("---------------------------------");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Buscar producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el código del producto: ");
                        int codigo = Integer.parseInt(scanner.nextLine());
                        System.out.print("Ingrese el nombre del producto: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Ingrese el precio: ");
                        double precio = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese la cantidad: ");
                        int cantidad = Integer.parseInt(scanner.nextLine());

                        Producto nuevoProducto = new Producto(codigo, nombre, precio, cantidad);
                        inventario.agregar(nuevoProducto);
                        System.out.println("Producto registrado correctamente.");
                        break;

                    case 2:
                        inventario.mostrarTodos();
                        break;

                    case 3:
                        System.out.print("Ingrese el código a buscar: ");
                        int codigoBusqueda = Integer.parseInt(scanner.nextLine());
                        try {
                            Producto p = inventario.buscarPorCodigo(codigoBusqueda);
                            System.out.println("Resultado de la búsqueda:");
                            p.mostrarInformacion();
                        } catch (ProductoNoEncontradoException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 4:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número válido.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}