package com.fatimaezzahragharib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTest {

    @Test
    public void testPersonSorting() {
        // Création d'une liste de personnes
        List<Person> individuals = new ArrayList<>();
        individuals.add(new Person("Hassan", "Zahra"));
        individuals.add(new Person("Lemoine", "Jacques"));
        individuals.add(new Person("Hassan", "Amina"));
        individuals.add(new Person("Bennet", "Rose"));

        // Tri de la liste
        Collections.sort(individuals);

        // Vérification de l'ordre attendu
        assertEquals("Bennet, Rose", individuals.get(0).toString());
        assertEquals("Hassan, Amina", individuals.get(1).toString());
        assertEquals("Hassan, Zahra", individuals.get(2).toString());
        assertEquals("Lemoine, Jacques", individuals.get(3).toString());
    }
}
