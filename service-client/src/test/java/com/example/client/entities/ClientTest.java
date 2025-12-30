package com.example.client.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'entité Client
 *
 * Ces tests vérifient le bon fonctionnement des getters, setters
 * et constructeurs de l'entité Client.
 *
 * @author Hamza Aglagal
 * @version 1.0
 * @since 2025
 */
class ClientTest {

    /**
     * Test du constructeur par défaut
     */
    @Test
    void testDefaultConstructor() {
        Client client = new Client();

        assertNotNull(client);
        assertNull(client.getId());
        assertNull(client.getNom());
        assertNull(client.getAge());
    }

    /**
     * Test du constructeur paramétré
     */
    @Test
    void testParameterizedConstructor() {
        Long id = 1L;
        String nom = "Jean Dupont";
        Float age = 35.0f;

        Client client = new Client(id, nom, age);

        assertEquals(id, client.getId());
        assertEquals(nom, client.getNom());
        assertEquals(age, client.getAge());
    }

    /**
     * Test des setters et getters pour l'identifiant
     */
    @Test
    void testIdSetterGetter() {
        Client client = new Client();
        Long id = 123L;

        client.setId(id);
        assertEquals(id, client.getId());
    }

    /**
     * Test des setters et getters pour le nom
     */
    @Test
    void testNomSetterGetter() {
        Client client = new Client();
        String nom = "Marie Martin";

        client.setNom(nom);
        assertEquals(nom, client.getNom());
    }

    /**
     * Test des setters et getters pour l'âge
     */
    @Test
    void testAgeSetterGetter() {
        Client client = new Client();
        Float age = 28.5f;

        client.setAge(age);
        assertEquals(age, client.getAge());
    }

    /**
     * Test des valeurs limites pour l'âge
     */
    @Test
    void testAgeBoundaryValues() {
        Client client = new Client();

        // Test avec zéro
        client.setAge(0.0f);
        assertEquals(0.0f, client.getAge());

        // Test avec une valeur négative (bien que non réaliste)
        client.setAge(-1.0f);
        assertEquals(-1.0f, client.getAge());

        // Test avec une valeur élevée
        client.setAge(120.0f);
        assertEquals(120.0f, client.getAge());
    }

    /**
     * Test avec des noms spéciaux
     */
    @Test
    void testSpecialNames() {
        Client client = new Client();

        // Test avec des caractères spéciaux
        String specialName = "José María O'Connor";
        client.setNom(specialName);
        assertEquals(specialName, client.getNom());

        // Test avec un nom vide
        client.setNom("");
        assertEquals("", client.getNom());

        // Test avec des espaces
        client.setNom("  Jean  ");
        assertEquals("  Jean  ", client.getNom());
    }
}