package org.example;

import javax.swing.SwingUtilities; // Importiert die SwingUtilities-Klasse für die GUI-Verwaltung
import java.util.*; // Importiert alle Klassen aus dem java.util-Paket

public class Main {

    //Hauptmethode:
    public static void main() {
        SwingUtilities.invokeLater(() -> { // Führt den übergebenen Code im Event-Dispatch-Thread aus
            List<Rezept> initialRezepte = createInitialRezepte(); // Erstellt eine Liste von Rezepten
            RezeptGUI gui = new RezeptGUI(initialRezepte); // Erstellt eine neue Instanz der RezeptGUI mit den initialen Rezepten
            gui.setVisible(true); // Setzt die GUI sichtbar

        });
    }

    // Methode zum Erstellen einer Liste von Anfangsrezepten
    private static List<Rezept> createInitialRezepte() {
        List<Rezept> rezepte = new ArrayList<>();


        // Rezepte erstellen
        Rezept r1 = new Rezept (
                "Spaghetti Carbonara",
                "mittel",
                30,
                "Hauptgericht",
                Arrays.asList("200g Spaghetti", "100g Pancetta", "2 große Eier", "50g Pecorino-Käse", "50g Parmesan", "2 Knoblauchzehen", "Salz", "Pfeffer"),
                Arrays.asList("1. Spaghetti in Salzwasser kochen.", "2. Pancetta in einer Pfanne anbraten.", "3. Eier und Käse in einer Schüssel verquirlen.", "4.Knoblauch zur Pancetta geben, dann entfernen.", "5.Spaghetti abgießen und mit Pancetta mischen.", "6.Eier-Käse-Mischung unterrühren und mit Salz und Pfeffer abschmecken."),
                false,
                false,
                2
        );



        Rezept r2 = new Rezept(
                "Tomatensuppe",
                "leicht",
                45,
                "Suppe",
                Arrays.asList("1kg Tomaten", "1 Zwiebel", "2 Knoblauchzehen", "500ml Gemüsebrühe", "2 EL Olivenöl", "Salz", "Pfeffer", "Basilikum"),
                Arrays.asList("1. Tomaten, Zwiebel und Knoblauch hacken.", "2. Zwiebel und Knoblauch in Olivenöl anbraten.", "3. Tomaten hinzufügen und kurz mitbraten.", "4. Gemüsebrühe hinzufügen und 20 Minuten köcheln lassen.", "5. Suppe pürieren und mit Salz, Pfeffer und Basilikum abschmecken."),
                true,
                true,
                4
        );

        Rezept r3 = new Rezept(
                "Schokoladenkuchen",

                "leicht",60,
                "Dessert",
                Arrays.asList("200g Zartbitterschokolade", "200g Butter", "200g Zucker", "4 Eier", "100g Mehl", "1 TL Backpulver"),
                Arrays.asList("1. Schokolade und Butter schmelzen.", "2. Eier und Zucker schaumig schlagen.", "3. Schokoladen-Butter-Mischung unterrühren.", "4. Mehl und Backpulver unterheben.", "5. Teig in eine Form füllen und bei 180°C 25 Minuten backen."),
                true,
                false,
                8
        );

        Rezept r4 = new Rezept(
                "Guacamole",
                "leicht",
                15,
                "Vorspeise",
                Arrays.asList("2 Avocados", "1 Tomate", "1 kleine Zwiebel", "1 Limette", "Salz", "Pfeffer", "Koriander"),
                Arrays.asList("1. Avocados zerdrücken.", "2. Tomate und Zwiebel fein hacken.", "3. Limettensaft, Salz, Pfeffer und Koriander hinzufügen.", "4. Alles gut vermischen."),
                true,
                true,
                2
        );

        Rezept r5 = new Rezept(
                "Hähnchen-Curry",
                "mittel",
                45,
                "Hauptgericht",
                Arrays.asList("500g Hähnchenbrust", "1 Zwiebel", "2 Knoblauchzehen", "1 Stück Ingwer", "400ml Kokosmilch", "2 EL Currypulver", "1 TL Kurkuma", "Salz", "Pfeffer", "Koriander"),
                Arrays.asList("1. Hähnchenbrust in Stücke schneiden.", "2. Zwiebel, Knoblauch und Ingwer hacken.", "3. Zwiebel, Knoblauch und Ingwer anbraten.", "4. Hähnchen hinzufügen und anbraten.", "5. Currypulver und Kurkuma hinzufügen.", "6. Kokosmilch hinzufügen und 20 Minuten köcheln lassen.", "7. Mit Salz, Pfeffer und Koriander abschmecken."),
                false,
                false,
                4
        );

        Rezept r6 = new Rezept(
                "Pesto Pasta",
                "leicht",
                25,
                "Hauptgericht",
                Arrays.asList("200g Pasta", "50g Basilikum", "30g Pinienkerne", "50g Parmesan", "1 Knoblauchzehe", "100ml Olivenöl", "Salz", "Pfeffer"),
                Arrays.asList("1. Pasta in Salzwasser kochen.", "2. Basilikum, Pinienkerne, Parmesan und Knoblauch pürieren.", "3. Olivenöl langsam hinzufügen.", "4. Mit Salz und Pfeffer abschmecken.", "5.Pasta abgießen und mit Pesto mischen."),
                true,
                false,
                2
        );

        Rezept r7 = new Rezept(
                "Gemüse-Lasagne",
               "mittel",
                90,
                "Hauptgericht",
                Arrays.asList("12 Lasagneblätter", "2 Zucchini", "2 Paprika", "1 Aubergine", "1 Zwiebel", "2 Knoblauchzehen", "800g Tomaten", "200g Mozzarella", "50g Parmesan", "Olivenöl", "Salz", "Pfeffer", "Basilikum"),
                Arrays.asList("1. Lasagneblätter nach Packungsanweisung kochen.", "2. Gemüse würfeln und in Olivenöl anbraten.", "3. Zwiebel und Knoblauch hacken und hinzufügen.", "5. Mit Salz, Pfeffer und Basilikum abschmecken.", "6. Lasagneblätter, Gemüse und Käse schichten.", "7. Mit Parmesan bestreuen und bei 180°C 30 Minuten backen."),
                true,
                false,
                6
        );

        Rezept r8 = new Rezept(
                "Hähnchen-Tikka-Masala",
                "schwer",
                45,
                "Hauptgericht",
                Arrays.asList("500g Hähnchenbrust", "200g Joghurt", "2 EL Tikka-Masala-Paste", "1 Zwiebel", "2 Knoblauchzehen", "1 Stück Ingwer", "400g Tomaten", "200ml Sahne", "Koriander", "Salz", "Pfeffer", "Öl"),
                Arrays.asList("1. Hähnchen in Joghurt und Tikka-Masala-Paste marinieren.", "2. Zwiebel, Knoblauch und Ingwer hacken und anbraten.", "3. Hähnchen hinzufügen und anbraten.", "4. Tomaten und Sahne hinzufügen und köcheln lassen.", "5. Mit Salz, Pfeffer und Koriander abschmecken."),
                false,
                false,
                4
        );

        Rezept r9 = new Rezept(
                "Quinoa-Salat",
                "leicht",
                30,
                "Salat",
                Arrays.asList("200g Quinoa", "1 Gurke", "2 Tomaten", "1 Paprika", "1 Avocado", "1 Zitrone", "2 EL Olivenöl", "Salz", "Pfeffer", "Petersilie"),
                Arrays.asList("1. Quinoa nach Packungsanweisung kochen.", "2. Gemüse würfeln.", "3. Zitrone auspressen und mit Olivenöl, Salz und Pfeffer zu einem Dressing verrühren.", "4. Quinoa und Gemüse mischen.", "5. Mit Dressing und Petersilie abschmecken."),
                true,
                true,
                4
        );

        Rezept r10 = new Rezept(
                "Rindergulasch",
                "mittel",
                120,
                "Hauptgericht",
                Arrays.asList("1kg Rindfleisch", "2 Zwiebeln", "2 Knoblauchzehen", "2 Paprika", "500ml Rinderbrühe", "2 EL Tomatenmark", "2 EL Paprikapulver", "Salz", "Pfeffer", "Öl"),
                Arrays.asList("1. Fleisch würfeln und anbraten.", "2. Zwiebeln und Knoblauch hacken und hinzufügen.", "3. Paprika würfeln und hinzufügen.", "4. Tomatenmark und Paprikapulver hinzufügen.", "5. Mit Brühe ablöschen und köcheln lassen.", "6. Mit Salz und Pfeffer abschmecken."),
                false,
                false,
                6
        );

        Rezept r11 = new Rezept(
                "Falafel",
                "mittel",
                30,
                "Hauptgericht",
                Arrays.asList("200g Kichererbsen", "1 Zwiebel", "2 Knoblauchzehen", "1 Bund Petersilie", "1 TL Kreuzkümmel", "1 TL Koriander", "Salz", "Pfeffer", "Öl"),
                Arrays.asList("1. Kichererbsen einweichen und abtropfen lassen.", "2. Zwiebel, Knoblauch und Petersilie hacken.", "3. Alle Zutaten pürieren.", "4. Masse zu Bällchen formen.", "5. In Öl frittieren."),
                true,
                true,
                4
        );

        Rezept r12 = new Rezept(
                "Lachs mit Zitronen-Dill-Sauce",
                "schwer",
                45,
                "Hauptgericht",
                Arrays.asList( "4 Lachsfilets", "1 Zitrone", "1 Bund Dill", "200ml Sahne", "Salz", "Pfeffer", "Öl"),
                Arrays.asList("1. Lachsfilets salzen und pfeffern.", "2. In Öl anbraten.", "3. Zitrone auspressen und mit Sahne und Dill verrühren.", "4. Sauce über den Lachs geben und kurz köcheln lassen."),
                false,
                false,
                4
        );

        Rezept r13 = new Rezept(
                "Gemüse-Curry",
                "mittel",
                45,
                "Hauptgericht",
                Arrays.asList( "1 Zucchini", "1 Aubergine", "2 Karotten", "1 Paprika", "1 Zwiebel", "2 Knoblauchzehen", "1 Stück Ingwer", "400ml Kokosmilch", "2 EL Currypulver", "Salz", "Pfeffer", "Öl"),
                Arrays.asList("1. Gemüse würfeln.", "2. Zwiebel, Knoblauch und Ingwer hacken und anbraten.", "3. Gemüse hinzufügen und anbraten.", "4. Currypulver hinzufügen.", "5. Mit Kokosmilch ablöschen und köcheln lassen.", "6. Mit Salz und Pfeffer abschmecken."),
                true,
                true,
                4
        );

        Rezept r14 = new Rezept(
                "Schweinebraten",
                "schwer",
                60,
                "Hauptgericht",
                Arrays.asList( "1kg Schweinebraten", "2 Zwiebeln", "2 Knoblauchzehen", "500ml Brühe", "2 EL Senf", "Salz", "Pfeffer", "Öl"),
                Arrays.asList("1. Fleisch salzen und pfeffern.", "2. In Öl anbraten.", "3. Zwiebeln und Knoblauch hacken und hinzufügen.", "4. Mit Brühe ablöschen.", "5. Senf hinzufügen und köcheln lassen."),
                false,
                false,
                6
        );

        Rezept r15 = new Rezept(
                "Spinat-Feta-Quiche",
                "mittel",
                45,
                "Hauptgericht",
                Arrays.asList( "1 Quiche-Teig", "200g Spinat", "200g Feta", "3 Eier", "200ml Sahne", "Salz", "Pfeffer", "Muskat"),
                Arrays.asList("1. Teig in eine Form legen.", "2. Spinat blanchieren und abtropfen lassen.", "3. Feta zerbröseln.", "4. Eier und Sahne verquirlen.", "5. Spinat und Feta auf dem Teig verteilen.", "6. Eier-Sahne-Mischung darüber gießen.", "7. Mit Salz, Pfeffer und Muskat würzen.", "8. Bei 180°C 30 Minuten backen."),
                true,
                false,
                4
        );

        Rezept r16 = new Rezept(
                "Ratatouille",
                "schwer",
                60,
                "Hauptgericht",
                Arrays.asList( "1 Zucchini", "1 Aubergine", "2 Paprika", "4 Tomaten", "1 Zwiebel", "2 Knoblauchzehen", "Olivenöl", "Salz", "Pfeffer", "Thymian"),
                Arrays.asList("1. Gemüse würfeln.", "2. Zwiebel und Knoblauch hacken und anbraten.", "3. Gemüse hinzufügen und anbraten.", "4. Mit Salz, Pfeffer und Thymian würzen.", "5. Bei niedriger Hitze köcheln lassen."),
                true,
                true,
                6
        );

        Rezept r17 = new Rezept(
                "Tiramisu",
                "mittel",
                60,
                "Dessert",
                Arrays.asList( "250g Mascarpone", "3 Eier", "100g Zucker", "200ml starker Kaffee", "200g Löffelbiskuits", "Kakaopulver"),
                Arrays.asList("1. Eier trennen und Eigelb mit Zucker schaumig schlagen.", "2. Mascarpone unterrühren.", "3. Eiweiß steif schlagen und unterheben.", "4. Löffelbiskuits in Kaffee tauchen und in eine Form schichten.", "5. Mascarpone-Creme darüber verteilen.", "6. Schichten wiederholen und mit Kakaopulver bestäuben.", "7. Mindestens 4 Stunden kühlen."),
                true,
                false,
                6
        );

        Rezept r18 = new Rezept(
                "Kürbissuppe",
                "leicht",
                45,
                "Suppe",
                Arrays.asList("1 kg Kürbis", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "200 ml Kokosmilch", "2 EL Olivenöl", "Salz", "Pfeffer", "Ingwer"),
                Arrays.asList("1. Kürbis, Zwiebel und Knoblauch klein schneiden.", "2. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "3. Kürbis hinzufügen und kurz mitbraten.", "4. Gemüsebrühe hinzufügen und 20 Minuten köcheln lassen.", "5. Suppe pürieren und mit Kokosmilch, Salz, Pfeffer und Ingwer abschmecken."),
                true,
                true,
                4
        );

        Rezept r19 = new Rezept(
                "Kartoffelsuppe",
                "mittel",
                45,
                "Suppe",
                Arrays.asList("500g Kartoffeln", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "100 ml Sahne", "2 EL Olivenöl", "Salz", "Pfeffer", "Muskatnuss"),
                Arrays.asList("1. Kartoffeln, Zwiebel und Knoblauch klein schneiden.", "2. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "3. Kartoffeln hinzufügen und kurz mitbraten.", "4. Gemüsebrühe hinzufügen und 20 Minuten köcheln lassen.", "5. Suppe pürieren und mit Sahne, Salz, Pfeffer und Muskatnuss abschmecken."),
                true,
                false,
                4
        );

        Rezept r20 = new Rezept(
                "Zwiebelsuppe",
                "leicht",
                30,
                "Suppe",
                Arrays.asList("500g Zwiebeln", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "200 ml Weißwein", "2 EL Butter", "Salz", "Pfeffer", "Thymian"),
                Arrays.asList("1. Zwiebeln und Knoblauch klein schneiden.", "2. Butter in einem Topf erhitzen und Zwiebeln und Knoblauch anbraten.", "3. Weißwein hinzufügen und kurz einkochen lassen.", "4. Gemüsebrühe hinzufügen und 20 Minuten köcheln lassen.", "5. Mit Salz, Pfeffer und Thymian abschmecken."),
                true,
                false,
                4
        );

        Rezept r21 = new Rezept(
                "Linsensuppe",
                "mittel",
                45,
                "Suppe",
                Arrays.asList("200g Linsen", "4 Wienerle", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "2 Karotten", "2 EL Olivenöl", "Salz", "Pfeffer", "Lorbeerblatt"),
                Arrays.asList("1. Linsen waschen und abtropfen lassen.", "2. Zwiebel, Wienerle, Knoblauch und Karotten klein schneiden.", "3. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "4. Karotten und Linsen hinzufügen und kurz mitbraten.", "5. Gemüsebrühe und Lorbeerblatt hinzufügen und 30 Minuten köcheln lassen.", "6. Mit Salz und Pfeffer abschmecken."),
                false,
                false,
                4
        );

        Rezept r22 = new Rezept(
                "Erbsensuppe",
                "leicht",
                30,
                "Suppe",
                Arrays.asList("200g Erbsen", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "2 Karotten", "2 EL Olivenöl", "Salz", "Pfeffer", "Minze"),
                Arrays.asList("1. Erbsen waschen und abtropfen lassen.", "2. Zwiebel, Knoblauch und Karotten klein schneiden.", "3. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "4. Karotten und Erbsen hinzufügen und kurz mitbraten.", "5. Gemüsebrühe hinzufügen und 20 Minuten köcheln lassen.", "6. Suppe pürieren und mit Salz, Pfeffer und Minze abschmecken."),
                true,
                true,
                4
        );

        Rezept r23 = new Rezept(
                "Spinatsuppe",
                "mittel",
                30,
                "Suppe",
                Arrays.asList("500g Spinat", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "100 ml Sahne", "2 EL Olivenöl", "Salz", "Pfeffer", "Muskatnuss"),
                Arrays.asList("1. Spinat waschen und abtropfen lassen.", "2. Zwiebel und Knoblauch klein schneiden.", "3. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "4. Spinat hinzufügen und kurz mitbraten.", "5. Gemüsebrühe hinzufügen und 10 Minuten köcheln lassen.", "6. Suppe pürieren und mit Sahne, Salz, Pfeffer und Muskatnuss abschmecken."),
                true,
                false,
                4
        );

        Rezept r24 = new Rezept(
                "Brokkolisuppe",
                "leicht",
                40,
                "Suppe",
                Arrays.asList("500g Brokkoli", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "100 ml Sahne", "2 EL Olivenöl", "Salz", "Pfeffer", "Muskatnuss"),
                Arrays.asList("1. Brokkoli waschen und in Röschen teilen.", "2. Zwiebel und Knoblauch klein schneiden.", "3. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "4. Brokkoli hinzufügen und kurz mitbraten.", "5. Gemüsebrühe hinzufügen und 15 Minuten köcheln lassen.", "6. Suppe pürieren und mit Sahne, Salz, Pfeffer und Muskatnuss abschmecken."),
                true,
                false,
                4
        );

        Rezept r25 = new Rezept(
                "Pilzsuppe",
                "mittel",
                30,
                "Suppe",
                Arrays.asList("500g Pilze", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Gemüsebrühe", "100 ml Sahne", "2 EL Olivenöl", "Salz", "Pfeffer", "Thymian"),
                Arrays.asList("1. Pilze waschen und klein schneiden.", "2. Zwiebel und Knoblauch klein schneiden.", "3. Olivenöl in einem Topf erhitzen und Zwiebel und Knoblauch anbraten.", "4. Pilze hinzufügen und kurz mitbraten.", "5. Gemüsebrühe hinzufügen und 15 Minuten köcheln lassen.", "6. Suppe pürieren und mit Sahne, Salz, Pfeffer und Thymian abschmecken."),
                true,
                false,
                4
        );

        Rezept r26 = new Rezept(
                "Apfelkuchen",
                "mittel",
                100,
                "Dessert",
                Arrays.asList("200g Mehl", "100g Zucker", "100g Butter", "2 Eier", "1 TL Backpulver", "4 Äpfel", "Zimt"),
                Arrays.asList("1. Mehl, Zucker, Butter, Eier und Backpulver zu einem Teig verrühren.", "2. Äpfel schälen, entkernen und in Scheiben schneiden.", "3. Teig in eine gefettete Form geben und mit Apfelscheiben belegen.", "4. Mit Zimt bestreuen und bei 180°C 40 Minuten backen."),
                true,
                false,
                8
        );


        Rezept r27 = new Rezept(
                "Panna Cotta",
                "schwer",
                45,
                "Dessert",
                Arrays.asList("500ml Sahne", "100g Zucker", "1 Vanilleschote", "4 Blatt Gelatine"),
                Arrays.asList("1. Sahne, Zucker und das Mark der Vanilleschote in einem Topf erhitzen.", "2. Gelatine in kaltem Wasser einweichen.", "3. Gelatine ausdrücken und in der heißen Sahne auflösen.", "4. Sahne in Förmchen füllen und kalt stellen."),
                true,
                false,
                6
        );

        Rezept r30 = new Rezept(
                "Cheesecake",
                "mittel",
                120,
                "Dessert",
                Arrays.asList("200g Kekse", "100g Butter", "500g Frischkäse", "200g Zucker", "3 Eier", "200ml Sahne", "1 TL Vanilleextrakt"),
                Arrays.asList("1. Kekse zerbröseln und mit geschmolzener Butter vermischen.", "2. Keksmasse in eine Springform drücken.", "3. Frischkäse, Zucker, Eier, Sahne und Vanilleextrakt verrühren.", "4. Masse auf den Keksboden geben und bei 160°C 50 Minuten backen."),
                true,
                false,
                8
        );

        Rezept r31 = new Rezept(
                "Crème Brûlée",
                "schwer",
                60,
                "Dessert",
                Arrays.asList("500ml Sahne", "100g Zucker", "1 Vanilleschote", "5 Eigelb", "Brauner Zucker"),
                Arrays.asList("1. Sahne, Zucker und das Mark der Vanilleschote erhitzen.", "2. Eigelb verquirlen und die heiße Sahne langsam unterrühren.", "3. Masse in Förmchen füllen und im Wasserbad bei 150°C 40 Minuten backen.", "4. Mit braunem Zucker bestreuen und mit einem Brenner karamellisieren."),
                true,
                false,
                6
        );

        Rezept r32 = new Rezept(
                "Brownies",
                "leicht",
                45,
                "Dessert",
                Arrays.asList("200g Zartbitterschokolade", "200g Butter", "200g Zucker", "4 Eier", "100g Mehl", "1 TL Backpulver"),
                Arrays.asList("1. Schokolade und Butter schmelzen.", "2. Zucker und Eier schaumig schlagen.", "3. Geschmolzene Schokolade unterrühren.", "4. Mehl und Backpulver unterheben.", "5. Teig in eine Form füllen und bei 180°C 25 Minuten backen."),
                true,
                false,
                12
        );


        Rezept r33 = new Rezept(
                "Obstsalat",
                "leicht",
                25,
                "Dessert",
                Arrays.asList("2 Äpfel", "2 Bananen", "1 Orange", "1 Kiwi", "200g Trauben", "Saft einer Zitrone", "1 EL Honig"),
                Arrays.asList("1. Obst klein schneiden.", "2. Mit Zitronensaft und Honig vermischen."),
                true,
                true,
                4
        );

        Rezept r34 = new Rezept(
                "Eclairs",
                "schwer",
                90,
                "Dessert",
                Arrays.asList("100g Butter", "250ml Wasser", "150g Mehl", "4 Eier", "200ml Sahne", "100g Zartbitterschokolade"),
                Arrays.asList("1. Butter und Wasser aufkochen.", "2. Mehl einrühren und abbrennen.", "3. Eier nach und nach unterrühren.", "4. Teig in Streifen spritzen und bei 200°C 20 Minuten backen.", "5. Sahne steif schlagen und Eclairs füllen.", "6. Schokolade schmelzen und Eclairs damit überziehen."),
                true,
                false,
                8
        );

        Rezept r35 = new Rezept(
                "Mousse au Chocolat",
                "mittel",
                35,
                "Dessert",
                Arrays.asList("200g Zartbitterschokolade", "3 Eier", "50g Zucker", "200ml Sahne"),
                Arrays.asList("1. Schokolade schmelzen und etwas abkühlen lassen.", "2. Eier trennen und Eigelb mit Zucker schaumig schlagen.", "3. Eiweiß steif schlagen.", "4. Sahne steif schlagen.", "5. Geschmolzene Schokolade unter die Eigelbmasse rühren.", "6. Eiweiß und Sahne vorsichtig unterheben.", "7. Mousse in Gläser füllen und kalt stellen."),
                true,
                false,
                4
        );

        Rezept r36 = new Rezept(
                "Caesar Salat",
                "mittel",
                30,
                "Salat",
                Arrays.asList("1 Römersalat", "50g Parmesan", "100g Croutons", "2 Hähnchenbrustfilets", "2 EL Olivenöl", "1 Knoblauchzehe", "2 Sardellenfilets", "1 Eigelb", "1 TL Senf", "1 EL Zitronensaft", "Salz", "Pfeffer"),
                Arrays.asList("1. Hähnchenbrustfilets braten und in Streifen schneiden.", "2. Römersalat waschen und zerkleinern.", "3. Für das Dressing Knoblauch, Sardellen, Eigelb, Senf und Zitronensaft pürieren.", "4. Olivenöl langsam einrühren und mit Salz und Pfeffer abschmecken.", "5. Salat mit Hähnchen, Parmesan und Croutons anrichten und mit Dressing beträufeln."),
                false,
                false,
                4
        );

        Rezept r37 = new Rezept(
                "Griechischer Salat",
                "leicht",
                20,
                "Salat",
                Arrays.asList("1 Gurke", "4 Tomaten", "1 rote Zwiebel", "200g Feta-Käse", "100g Oliven", "4 EL Olivenöl", "2 EL Rotweinessig", "Salz", "Pfeffer", "Oregano"),
                Arrays.asList("1. Gurke, Tomaten und Zwiebel in Scheiben schneiden.", "2. Feta-Käse würfeln.", "3. Alles in eine Schüssel geben und mit Oliven und Oregano mischen.", "4. Olivenöl und Rotweinessig darüber geben und mit Salz und Pfeffer abschmecken."),
                true,
                false,
                4
        );

        Rezept r38 = new Rezept(
                "Nudelsalat",
                "mittel",
                30,
                "Salat",
                Arrays.asList("200g Nudeln","100g Schinken", "1 Paprika", "1 Gurke", "100g Kirschtomaten", "100g Mais", "100g Erbsen", "4 EL Mayonnaise", "2 EL Joghurt", "1 EL Senf", "Salz", "Pfeffer"),
                Arrays.asList("1. Nudeln kochen und abkühlen lassen.", "2. Schinken, Paprika, Gurke und Kirschtomaten klein schneiden.", "3. Nudeln mit Gemüse, Mais und Erbsen mischen.", "4. Mayonnaise, Joghurt und Senf zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "5. Dressing unter den Salat mischen."),
                false,
                false,
                4
        );

        Rezept r39 = new Rezept(
                "Kartoffelsalat",
                "mittel",
                60,
                "Salat",
                Arrays.asList("500g Kartoffeln", "1 Zwiebel", "100g Gewürzgurken", "4 EL Mayonnaise", "2 EL Joghurt", "1 EL Senf", "Salz", "Pfeffer", "Petersilie"),
                Arrays.asList("1. Kartoffeln kochen, abkühlen lassen und in Scheiben schneiden.", "2. Zwiebel und Gewürzgurken klein schneiden.", "3. Kartoffeln mit Zwiebel und Gewürzgurken mischen.", "4. Mayonnaise, Joghurt und Senf zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "5. Dressing unter den Salat mischen und mit Petersilie bestreuen."),
                true,
                false,
                4
        );

        Rezept r40 = new Rezept(
                "Couscous Salat",
                "leicht",
                30,
                "Salat",
                Arrays.asList("200g Couscous", "1 Gurke", "2 Tomaten", "1 Paprika", "1 Bund Petersilie", "4 EL Olivenöl", "2 EL Zitronensaft", "Salz", "Pfeffer"),
                Arrays.asList("1. Couscous nach Packungsanweisung zubereiten.", "2. Gurke, Tomaten und Paprika klein schneiden.", "3. Petersilie hacken.", "4. Couscous mit Gemüse und Petersilie mischen.", "5. Olivenöl und Zitronensaft zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "6. Dressing unter den Salat mischen."),
                true,
                true,
                4
        );

        Rezept r41 = new Rezept(
                "Spinatsalat",
                "leicht",
                20,
                "Salat",
                Arrays.asList("200g Babyspinat", "100g Feta-Käse", "50g Walnüsse", "1 Apfel", "2 EL Olivenöl", "1 EL Balsamico-Essig", "Salz", "Pfeffer"),
                Arrays.asList("1. Babyspinat waschen und abtropfen lassen.", "2. Feta-Käse würfeln.", "3. Walnüsse grob hacken.", "4. Apfel in dünne Scheiben schneiden.", "5. Spinat mit Feta, Walnüssen und Apfel mischen.", "6. Olivenöl und Balsamico-Essig zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "7. Dressing unter den Salat mischen."),
                true,
                false,
                4
        );

        Rezept r42 = new Rezept(
                "Rote Beete Salat",
                "leicht",
                15,
                "Salat",
                Arrays.asList("500g Rote Beete", "1 Apfel", "1 Zwiebel", "2 EL Olivenöl", "1 EL Apfelessig", "Salz", "Pfeffer", "Petersilie"),
                Arrays.asList("1. Rote Beete kochen, schälen und in Würfel schneiden.", "2. Apfel und Zwiebel klein schneiden.", "3. Rote Beete mit Apfel und Zwiebel mischen.", "4. Olivenöl und Apfelessig zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "5. Dressing unter den Salat mischen und mit Petersilie bestreuen."),
                true,
                true,
                4
        );

        Rezept r43 = new Rezept(
                "Bohnensalat",
                "leicht",
                25,
                "Salat",
                Arrays.asList("200g grüne Bohnen", "200g Kidneybohnen", "1 Zwiebel", "1 Paprika", "2 EL Olivenöl", "1 EL Balsamico-Essig", "Salz", "Pfeffer"),
                Arrays.asList("1. Grüne Bohnen kochen und abkühlen lassen.", "2. Zwiebel und Paprika klein schneiden.", "3. Grüne Bohnen, Kidneybohnen, Zwiebel und Paprika mischen.", "4. Olivenöl und Balsamico-Essig zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "5. Dressing unter den Salat mischen."),
                true,
                true,
                4
        );

        Rezept r44 = new Rezept(
                "Karottensalat",
                "mittel",
                30,
                "Salat",
                Arrays.asList("500g Karotten", "1 Apfel", "2 EL Zitronensaft", "2 EL Olivenöl", "Salz", "Pfeffer", "Petersilie"),
                Arrays.asList("1. Karotten und Apfel raspeln.", "2. Zitronensaft und Olivenöl zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "3. Karotten und Apfel mit dem Dressing mischen.", "4. Mit Petersilie bestreuen."),
                true,
                true,
                4
        );

        Rezept r45 = new Rezept(
                "Avocado Salat",
                "leicht",
                15,
                "Salat",
                Arrays.asList("2 Avocados", "1 Gurke", "1 Tomate", "1 rote Zwiebel", "2 EL Olivenöl", "1 EL Zitronensaft", "Salz", "Pfeffer"),
                Arrays.asList("1. Avocados, Gurke, Tomate und Zwiebel klein schneiden.", "2. Olivenöl und Zitronensaft zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "3. Gemüse mit dem Dressing mischen."),
                true,
                true,
                4
        );

        Rezept r46 = new Rezept(
                "Bruschetta",
                "leicht",
                10,
                "Vorspeise",
                Arrays.asList("4 Tomaten", "1 Knoblauchzehe", "1 Bund Basilikum", "4 EL Olivenöl", "Salz", "Pfeffer", "8 Scheiben Baguette"),
                Arrays.asList("1. Tomaten klein würfeln und mit gehacktem Knoblauch und Basilikum mischen.", "2. Olivenöl hinzufügen und mit Salz und Pfeffer abschmecken.", "3. Baguettescheiben rösten und mit der Tomatenmischung belegen."),
                true,
                true,
                4
        );

        Rezept r47 = new Rezept(
                "Caprese",
                "leicht",
                15,
                "Vorspeise",
                Arrays.asList("4 Tomaten", "200g Mozzarella", "1 Bund Basilikum", "4 EL Olivenöl", "Salz", "Pfeffer", "Balsamico-Essig"),
                Arrays.asList("1. Tomaten und Mozzarella in Scheiben schneiden.", "2. Abwechselnd auf einem Teller anrichten.", "3. Mit Basilikumblättern garnieren.", "4. Mit Olivenöl, Salz, Pfeffer und Balsamico-Essig beträufeln."),
                true,
                false,
                4
        );

        Rezept r48 = new Rezept(
                "Antipasti",
                "mittel",
                25,
                "Vorspeise",
                Arrays.asList("1 Aubergine", "1 Zucchini", "1 Paprika", "100g Champignons", "4 EL Olivenöl", "2 EL Balsamico-Essig", "Salz", "Pfeffer", "Rosmarin"),
                Arrays.asList("1. Gemüse in Scheiben schneiden.", "2. Olivenöl in einer Pfanne erhitzen und das Gemüse anbraten.", "3. Mit Balsamico-Essig, Salz, Pfeffer und Rosmarin abschmecken."),
                true,
                true,
                4
        );

        Rezept r49 = new Rezept(
                "Garnelen-Cocktail",
                "schwer",
                35,
                "Vorspeise",
                Arrays.asList("200g Garnelen", "1 Avocado", "1 Mango", "1 Limette", "4 EL Mayonnaise", "2 EL Ketchup", "1 TL Worcestersauce", "Salz", "Pfeffer"),
                Arrays.asList("1. Garnelen kochen und abkühlen lassen.", "2. Avocado und Mango klein schneiden.", "3. Limettensaft, Mayonnaise, Ketchup und Worcestersauce zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "4. Garnelen, Avocado und Mango mit dem Dressing mischen."),
                false,
                false,
                4
        );

        Rezept r50 = new Rezept(
                "Lachs-Tatar",
                "schwer",
                30,
                "Vorspeise",
                Arrays.asList("200g Räucherlachs", "1 Avocado", "1 Schalotte", "1 EL Zitronensaft", "2 EL Olivenöl", "Salz", "Pfeffer", "Dill"),
                Arrays.asList("1. Räucherlachs und Avocado klein schneiden.", "2. Schalotte fein hacken.", "3. Zitronensaft und Olivenöl zu einem Dressing verrühren und mit Salz und Pfeffer abschmecken.", "4. Lachs, Avocado und Schalotte mit dem Dressing mischen und mit Dill garnieren."),
                false,
                false,
                4
        );

        Rezept r51 = new Rezept(
                "Gefüllte Champignons",
                "mittel",
                25,
                "Vorspeise",
                Arrays.asList("200g Champignons", "100g Frischkäse", "50g Parmesan", "1 Knoblauchzehe", "2 EL Olivenöl", "Salz", "Pfeffer", "Petersilie"),
                Arrays.asList("1. Champignons putzen und Stiele entfernen.", "2. Frischkäse, Parmesan, gehackten Knoblauch, Salz und Pfeffer zu einer Füllung verrühren.", "3. Champignons mit der Füllung füllen und mit Olivenöl beträufeln.", "4. Bei 180°C 20 Minuten backen und mit Petersilie bestreuen."),
                true,
                false,
                4

        );

        Rezept r52 = new Rezept(
                "Gazpacho",
                "mittel",
                20,
                "Vorspeise",
                Arrays.asList("1 kg Tomaten", "1 Gurke", "1 Paprika", "1 Zwiebel", "2 Knoblauchzehen", "500 ml Tomatensaft", "4 EL Olivenöl", "2 EL Rotweinessig", "Salz", "Pfeffer", "Basilikum"),
                Arrays.asList("1. Tomaten, Gurke, Paprika, Zwiebel und Knoblauch klein schneiden.", "2. Alles in einen Mixer geben und pürieren.", "3. Tomatensaft, Olivenöl und Rotweinessig hinzufügen und gut vermischen.", "4. Mit Salz, Pfeffer und Basilikum abschmecken und kalt stellen."),
                true,
                true,
                4
        );

        Rezept r53 = new Rezept(
                "Hummus",
                "leicht",
                20,
                "Vorspeise",
                Arrays.asList("200g Kichererbsen", "2 EL Tahini", "1 Knoblauchzehe", "1 Zitrone", "4 EL Olivenöl", "Salz", "Pfeffer", "Paprikapulver"),
                Arrays.asList("1. Kichererbsen abtropfen lassen.", "2. Knoblauch fein hacken.", "3. Kichererbsen, Tahini, Knoblauch, Zitronensaft und Olivenöl in einen Mixer geben und pürieren.", "4. Mit Salz, Pfeffer und Paprikapulver abschmecken."),
                true,
                true,
                4
        );

        Rezept r28 = new Rezept(
                "Caponata",
                "leicht",
                15,
                "Vorspeise",
                Arrays.asList("1 Aubergine", "1 Zucchini", "1 Paprika", "1 Zwiebel", "2 Knoblauchzehen", "4 EL Olivenöl", "2 EL Balsamico-Essig", "1 EL Zucker", "Salz", "Pfeffer", "Basilikum"),
                Arrays.asList("1. Gemüse in Würfel schneiden.", "2. Olivenöl in einer Pfanne erhitzen und Zwiebel und Knoblauch anbraten.", "3. Gemüse hinzufügen und anbraten.", "4. Balsamico-Essig und Zucker hinzufügen und 20 Minuten köcheln lassen.", "5. Mit Salz, Pfeffer und Basilikum abschmecken."),
                true,
                true,
                4
        );

        Rezept r29 = new Rezept(
                "Melone mit Schinken",
                "leicht",
                15,
                "Vorspeise",
                Arrays.asList("1 Honigmelone", "200g Parmaschinken", "Pfeffer", "Basilikum"),
                Arrays.asList("1. Melone halbieren, entkernen und in Spalten schneiden.", "2. Parmaschinken um die Melonenspalten wickeln.", "3. Mit Pfeffer und Basilikum garnieren."),
                false,
                false,
                4
        );
        // Rezepte zur Liste hinzufügen
        rezepte.add(r1);
        rezepte.add(r2);
        rezepte.add(r3);
        rezepte.add(r4);
        rezepte.add(r5);
        rezepte.add(r6);
        rezepte.add(r6);
        rezepte.add(r7);
        rezepte.add(r8);
        rezepte.add(r9);
        rezepte.add(r10);
        rezepte.add(r11);
        rezepte.add(r12);
        rezepte.add(r13);
        rezepte.add(r14);
        rezepte.add(r15);
        rezepte.add(r16);
        rezepte.add(r17);
        rezepte.add(r18);
        rezepte.add(r19);
        rezepte.add(r20);
        rezepte.add(r21);
        rezepte.add(r22);
        rezepte.add(r23);
        rezepte.add(r24);
        rezepte.add(r25);
        rezepte.add(r26);
        rezepte.add(r27);
        rezepte.add(r28);
        rezepte.add(r29);
        rezepte.add(r30);
        rezepte.add(r31);
        rezepte.add(r32);
        rezepte.add(r33);
        rezepte.add(r34);
        rezepte.add(r35);
        rezepte.add(r36);
        rezepte.add(r37);
        rezepte.add(r38);
        rezepte.add(r39);
        rezepte.add(r40);
        rezepte.add(r41);
        rezepte.add(r42);
        rezepte.add(r43);
        rezepte.add(r44);
        rezepte.add(r45);
        rezepte.add(r46);
        rezepte.add(r47);
        rezepte.add(r48);
        rezepte.add(r49);
        rezepte.add(r50);
        rezepte.add(r51);
        rezepte.add(r52);
        rezepte.add(r53);

        return rezepte;

    }
}