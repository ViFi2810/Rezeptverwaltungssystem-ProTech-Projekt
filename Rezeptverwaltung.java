package org.example;

import java.util.ArrayList; // Importiert die ArrayList-Klasse
import java.util.List; // Importiert die List-Klasse

class Rezeptverwaltung {
    private final List<Rezept> rezepte = new ArrayList<>(); // Erstellt eine Liste von Rezepten


    //Methoden:

    // Methode zum Hinzufügen eines Rezepts
    public void addRecipe(Rezept rezept) { // Methode zum Hinzufügen eines Rezepts
        rezepte.add(rezept);
    }

    // Methode zum Aktualisieren eines Rezepts
    public void updateRecipe(int index, Rezept rezept) {
        if (index >= 0 && index < rezepte.size()) { // Überprüft, ob der Index gültig ist
            rezepte.set(index, rezept); // Setzt das Rezept an der angegebenen Position
        }
    }

    // Methode zum Löschen eines Rezepts
    public void deleteRecipe(int index) {
        if (index >= 0 && index < rezepte.size()) { // Überprüft, ob der Index gültig ist
            rezepte.remove(index); // Entfernt das Rezept aus der Liste
        }
    }

    // Methode zum Abrufen aller Rezepte
    public List<Rezept> getRecipes() { // Methode zum Abrufen aller Rezepte
        return new ArrayList<>(rezepte);// Gibt eine neue Liste mit allen Rezepten zurück
    }
}