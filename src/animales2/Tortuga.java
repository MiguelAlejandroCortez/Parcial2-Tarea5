package animales2;

public class Tortuga extends Animal implements AnimalQueCamina, AnimalQueNada{
    @Override
    public String toString() {
        return "Tortuga";
    }

    @Override
    public void caminar() {

    }

    @Override
    public void nadar() {

    }
}
