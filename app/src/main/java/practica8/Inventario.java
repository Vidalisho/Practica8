package practica8;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int CapacidadMax;
    private List<Inventariable> items;

    public Inventario(int capacidadMax) {
        this.CapacidadMax = capacidadMax;
        this.items = new ArrayList<>();
    }

    public int getCapacidadMax() {
        return CapacidadMax;
    }
    public List<Inventariable> getItems() {
        return items;
    }

    public boolean agregarItem(Inventariable item) {
        if (items.size() < CapacidadMax) {
            items.add(item);
            return true;
        } else {
            System.out.println("Inventario lleno. No se puede agregar el item: " + item);
            return false;
        }
    }

    public boolean eliminarItem(Inventariable item) {
        if (items.contains(item)) {
            items.remove(item);
            return true;
        } else {
            System.out.println("El item " + item + " no se encuentra en el inventario.");
            return false;
        }
    }

    public void listarItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Items en el inventario:");
            for (Inventariable item : items) {
                System.out.println(item);
            }
        }
    }

}
