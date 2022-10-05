package animales2;

public class Pato extends Animal implements AnimalQueNada, AnimalQueCamina, AnimalQueVuela{
    @Override
    public String toString() {
        return "Pato";
    }

    @Override
    public void caminar() {

    }

    @Override
    public void nadar() {

    }

    @Override
    public void volar() {

    }
}
