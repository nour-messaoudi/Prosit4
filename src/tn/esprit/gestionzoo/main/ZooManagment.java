package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

class ZooManagement {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Lion", 5, true);
        Animal tiger = new Animal("Felidae", "Tiger", 4, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);

        Zoo myZoo = new Zoo("My Zoo", "Paris");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(lion); // Tentative d'ajout d'un animal existant

        // Ajout d'animaux jusqu'à atteindre la capacité maximale
        for (int i = 0; i < 22; i++) {
            Animal extraAnimal = new Animal("Unknown", "Animal" + i, 1, false);
            myZoo.addAnimal(extraAnimal);
        }

        Animal giraffe = new Animal("Giraffidae", "Giraffe", 7, false);
        myZoo.addAnimal(giraffe); // Tentative d'ajout après que le zoo soit plein

        myZoo.displayAnimals();
    }
}
