import animales2.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = new LinkedList();

        animalList.add(new Aguila());
        animalList.add(new Animal());
        animalList.add(new Tortuga());
        animalList.add(new Pato());
        animalList.add(new Condor());
        animalList.add(new Halcón());
        animalList.add(new Gorrión());
        animalList.add(new Gato());
        animalList.add(new Perro());
        animalList.add(new Ratón());
        animalList.add(new Tilapia());
        animalList.add(new Sardina());
        animalList.add(new Salmon());
        animalList.add(new Trucha());

        for(Animal animal: animalList){
            System.out.println(animal.toString());
        }
    }
}