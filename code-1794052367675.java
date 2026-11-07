import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregar(Producto p) {
        productos.add(p);
    }

    public void mostrarTodos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados en el inventario.");
            return;
        }
        
        System.out.println("\n----- PRODUCTOS -----");
        double valorTotal = 0;
        for (Producto p : productos) {
            p.mostrarInformacion();
            valorTotal += p.getPrecio() * p.getCantidad();
        }
        System.out.println("Valor total del inventario: " + valorTotal);
    }

    public Producto buscarPorCodigo(int codigo) throws ProductoNoEncontradoException {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("El producto no fue encontrado.");
    }
}