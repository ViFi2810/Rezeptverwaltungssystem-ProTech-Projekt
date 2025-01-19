package org.example;

import java.util.List; // Importiert die List-Klasse

public class Rezept {
    private final String name;
    private final String schwierigkeitsgrad;
    private final int zubereitungszeit;
    private final String kategorie;
    private final List<String> zutaten;
    private final List<String> anweisungen;
    private final boolean vegetarisch;
    private final boolean vegan;
    private final int portionen;

    // Konstruktor der Rezept-Klasse
    public Rezept(String name, String schwierigkeitsgrad, int zubereitungszeit, String kategorie,
                  List<String> zutaten, List<String> anweisungen, boolean vegetarisch, boolean vegan, int portionen) {
        this.name = name;
        this.schwierigkeitsgrad = schwierigkeitsgrad;
        this.zubereitungszeit = zubereitungszeit;
        this.kategorie = kategorie;
        this.zutaten = zutaten;
        this.anweisungen = anweisungen;
        this.vegetarisch = vegetarisch;
        this.vegan = vegan;
        this.portionen = portionen;
    }


    // Getter-Methoden
    public String getName() {
        return name;
    }

    public String getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    public int getZubereitungszeit() {
        return zubereitungszeit;
    }

    public String getKategorie() {
        return kategorie;
    }

    public List<String> getZutaten() {
        return zutaten;
    }

    public List<String> getAnweisungen() {
        return anweisungen;
    }

    public boolean isVegetarisch() {
        return vegetarisch;
    }

    public boolean isVegan() {
        return vegan;
    }

    public int getPortionen() {
        return portionen;
    }

    // Überschreiben der toString-Methode, um den Namen des Rezepts zurückzugeben
    @Override
    public String toString() {
        return name;
    }
}