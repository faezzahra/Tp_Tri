package com.fatimaezzahragharib;

public class Person implements Comparable<Person> {
    private String surname;
    private String givenName;

    // Constructeur
    public Person(String surname, String givenName) {
        this.surname = surname;
        this.givenName = givenName;
    }

    // Getters
    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    // Nouvelle méthode de comparaison pour trier par nom, puis par prénom
    @Override
    public int compareTo(Person otherPerson) {
        int surnameComparison = this.surname.compareTo(otherPerson.surname);
        if (surnameComparison != 0) {
            return surnameComparison; // Tri par nom
        } else {
            return this.givenName.compareTo(otherPerson.givenName); // Tri par prénom si les noms sont identiques
        }
    }

    // Méthode pour afficher les informations de la personne
    @Override
    public String toString() {
        return surname + ", " + givenName;
    }
}