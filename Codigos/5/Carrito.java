package 5;

import java.util.*;

public class Carrito {
    private ArrayList<String> productos;

    public Carrito(List<String> productos) {
        this.productos = new ArrayList<>(productos);
    }

    @Override
    public String toString() {
        return "Productos: " + productos;
    }
}