package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // Constructeur
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.setName(name);
        this.setAge(age);
        this.isMammal = isMammal;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Erreur : Le nom de l'animal ne peut pas être vide.");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Erreur : L'âge de l'animal ne peut pas être négatif.");
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal [Nom: " + this.name + ", Famille: " + this.family + ", Âge: " + this.age + ", Mammifère: " + this.isMammal + "]";
    }
}
