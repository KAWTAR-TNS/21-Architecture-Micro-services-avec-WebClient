package com.example.client;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Tests pour l'application principale du service client
 *
 * Ces tests vérifient que le contexte Spring se charge correctement
 * et que l'application démarre sans erreurs avec toutes ses dépendances.
 *
 * @author Hamza Aglagal
 * @version 1.0
 * @since 2025
 */
@SpringBootTest
class ServiceClientApplicationTests {

    /**
     * Test que le contexte de l'application se charge correctement
     *
     * Ce test vérifie que toutes les configurations Spring, JPA
     * et Eureka sont correctement configurées.
     */
    @Test
    void contextLoads() {
        // Le test passe si le contexte Spring se charge sans erreurs
    }
}