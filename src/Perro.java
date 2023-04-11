public class Perro implements Animal, SerVivo {


    @Override
    public void mostrarTipoAnimal(){
        System.out.println("Soy un mamífero");
    }

    @Override
    public String mostrarNombre(){
        return "Neron";
    }

    @Override
    public void mostrarVida() {
        System.out.println("Soy el método sobreescrito en la clase Perro que viene de la Interface Servivo");
    }
}
