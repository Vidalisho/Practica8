package practica8;

public class Recompensa implements Inventariable {
    private String nombre;
    private int valor;
    private String tipo;

    public Recompensa(String nombre, int valor, String tipo) {
        this.nombre = nombre;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public int getValor() {
        return valor;
    }
    public String getTipo() {
        return tipo;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando la recompensa: " + nombre);
    }

    @Override 
    public void borrar() {
        System.out.println("Borrando la recompensa: " + nombre);
    }
}
