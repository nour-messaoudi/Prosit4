package tn.esprit.gestionzoo.entities;

public class Zoo {
    private final int NBR_CAGES = 25;
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount = 0;

    public Zoo(String name, String city) {
        this.setName(name);
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Erreur : Le nom du zoo ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Zoo [Nom: " + this.name + ", Ville: " + this.city + ", Nombre d'animaux: " + animalCount + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Impossible d'ajouter l'animal. Le zoo est plein.");
            return false;
        }

        if (searchAnimal(animal) != -1) {
            System.out.println("Impossible d'ajouter l'animal. Cet animal existe déjà dans le zoo.");
            return false;
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println("Animal ajouté avec succès : " + animal.getName());
        return true;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            System.out.println("Animal non trouvé. Suppression impossible.");
            return false;
        }

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[animalCount - 1] = null;
        animalCount--;
        System.out.println("Animal supprimé avec succès.");
        return true;
    }

    public void displayAnimals() {
    }
}
