package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RezeptTest {

    private Rezept rezept;
    private String name;
    private String schwierigkeitsgrad;
    private int zubereitungszeit;
    private String kategorie;
    private List<String> zutaten;
    private List<String> anweisungen;
    private boolean vegetarisch;
    private boolean vegan;
    private int portionen;

    @BeforeEach
    void setUp() {
        name = "Spaghetti Carbonara";
        kategorie = "Hauptgericht";
        schwierigkeitsgrad = "mittel";
        zubereitungszeit = 45;
        zutaten = Arrays.asList("200g Spaghetti", "100g Pancetta", "2 große Eier", "50g Pecorino-Käse", "50g Parmesan", "2 Knoblauchzehen", "Salz", "Pfeffer");
        anweisungen = Arrays.asList("1. Spaghetti in Salzwasser kochen.", "2. Pancetta in einer Pfanne anbraten.", "3. Eier und Käse in einer Schüssel verquirlen.",
                "4. Knoblauch zur Pancetta geben, dann entfernen.", "5. Spaghetti abgießen und mit Pancetta mischen.", "6. Eier-Käse-Mischung unterrühren und mit Salz und Pfeffer abschmecken.");
        vegetarisch = false;
        vegan = false;
        portionen = 2;

        rezept = new Rezept(name, schwierigkeitsgrad, zubereitungszeit, kategorie, zutaten, anweisungen, vegetarisch, vegan, portionen);
    }

    @Test
    void testGetName() {
        assertEquals(name, rezept.getName(), "getName() soll korrekten Namen ausgeben");
    }

    @Test
    void testGetSchwierigkeitsgrad() {
        assertEquals(schwierigkeitsgrad, rezept.getSchwierigkeitsgrad(), "getSchwierigkeitsgrad() soll korrekten Schwierigkeitsgrad ausgeben");
    }

    @Test
    void testGetZubereitungszeit() {
        assertEquals(zubereitungszeit, rezept.getZubereitungszeit(), "getZubereitungszeit() soll korrekte Zubereitungszeit ausgeben");
    }

    @Test
    void testGetKategorie() {
        assertEquals(kategorie, rezept.getKategorie(), "getKategorie() soll korrekte Kategorie ausgeben");
    }

    @Test
    void testGetZutaten() {
        assertEquals(zutaten, rezept.getZutaten(), "getZutaten() soll die korrekte Liste von Zutaten ausgeben");
    }

    @Test
    void testGetAnweisungen() {
        assertEquals(anweisungen, rezept.getAnweisungen(), "getAnweisungen() soll die korrekte Liste von Anweisungen ausgeben");
    }

    @Test
    void testIsVegetarisch() {
        assertEquals(vegetarisch, rezept.isVegetarisch(), "isVegetarisch() soll den korrekten Wahrheitswert (true/false) ausgeben");
    }

    @Test
    void testIsVegan() {
        assertEquals(vegan, rezept.isVegan(), "isVegan() soll den korrekten Wahrheitswert (true/false) ausgeben");
    }

    @Test
    void testGetPortionen() {
        assertEquals(portionen, rezept.getPortionen(), "getPortionen() soll korrekte Portionenanzahl ausgeben");
    }

    @Test
    void testToString() {
        assertEquals(name, rezept.toString(), "toString() soll den Rezeptnamen ausgeben");
    }
}