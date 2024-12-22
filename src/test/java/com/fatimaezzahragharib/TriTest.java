package com.fatimaezzahragharib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriTest {
    public static void main(String[] args) {
        // Création d'une nouvelle liste de personnes
        List<Person> individuals = new ArrayList<>();
        individuals.add(new Person("Hassan", "Zahra"));
        individuals.add(new Person("Lemoine", "Jacques"));
        individuals.add(new Person("Hassan", "Amina"));
        individuals.add(new Person("Bennet", "Rose"));

        // Tri de la liste des personnes
        Collections.sort(individuals);

        // Affichage des personnes après le tri
        System.out.println("Liste triée des individus : ");
        for (Person individual : individuals) {
            System.out.println(individual);
        }
    }
}