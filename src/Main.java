public class Main {
    public static void main(String[] args)
    {
        Perro perro = new Perro();
        perro.mostrarTipoAnimal();

        String nombre = perro.mostrarNombre();
        perro.mostrarVida();

        System.out.println(nombre);
        System.out.println();
    }
}