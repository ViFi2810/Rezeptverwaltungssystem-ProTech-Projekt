package org.example;

import javax.swing.*;// Importiert die Swing-Klassen für die GUI
import javax.swing.border.EmptyBorder;// Importiert die EmptyBorder-Klasse
import java.awt.*;// Importiert die AWT-Klassen für die GUI
import java.util.List;//Importiert die List-Klasse


// Definiert die Klasse RezeptGUI, die von JFrame erbt
public class RezeptGUI extends JFrame {
    private final Rezeptverwaltung rezeptverwaltung;
    private final JList<Rezept> rezepteList;
    private final DefaultListModel<Rezept> listModel;
    private final JTextField nameField;
    private final JComboBox<String> schwierigkeitsgradComboBox;
    private final JTextField zubereitungszeitField;
    private final JTextField kategorieField;
    private final JTextArea zutatenArea;
    private final JTextArea anweisungenArea;
    private final JCheckBox vegetarischCheckbox;
    private final JCheckBox veganCheckbox;
    private final JSpinner portionenSpinner;
    private final JButton addButton, updateButton, deleteButton, clearButton;
    private final JComboBox<String> categoryComboBox;
    private final JCheckBox vegetarianFilterCheckbox;
    private final JCheckBox veganFilterCheckbox;



    // Konstruktor der RezeptGUI-Klasse
    public RezeptGUI(List<Rezept> existingRezepts) {
        rezeptverwaltung = new Rezeptverwaltung();
        listModel = new DefaultListModel<>();
        rezepteList = new JList<>(listModel);
        nameField = new JTextField(40);
        schwierigkeitsgradComboBox = new JComboBox<>(new String[]{"", "leicht", "mittel", "schwer"});
        zubereitungszeitField = new JTextField(40);
        kategorieField = new JTextField(40);
        zutatenArea = new JTextArea(10, 40);
        anweisungenArea = new JTextArea(10, 40);
        vegetarischCheckbox = new JCheckBox("Vegetarisch");
        veganCheckbox = new JCheckBox("Vegan");
        portionenSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        addButton = new JButton("Hinzufügen");
        updateButton = new JButton("Aktualisieren");
        deleteButton = new JButton("Löschen");
        clearButton = new JButton("Leeren");
        categoryComboBox = new JComboBox<>(new String[]{"Alle", "Hauptgericht", "Vorspeise", "Dessert", "Salat", "Suppe", "Frühstück"});
        vegetarianFilterCheckbox = new JCheckBox("Vegetarisch");
        veganFilterCheckbox = new JCheckBox("Vegan");


        initComponents(existingRezepts);// Initialisiert die GUI-Komponenten
        initListeners();// Initialisiert die Listener
    }


    //Methoden:

    // Methode zur Initialisierung der GUI-Komponenten
    private void initComponents(List<Rezept> existingRezepts) {
        // Basis der Benutzeroberfläche:
        setTitle("Rezeptverwaltung"); // Setzt den Titel des Fensters
        setSize(2000, 1200); // Setzt die Größe des Fensters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setzt die Standard-Schließoperation
        setLayout(new BorderLayout(10, 10)); // Setzt das Layout des Fensters
        getContentPane().setBackground(new Color(255, 255, 255)); // Setzt die Hintergrundfarbe des Fensters



        // Rezeptliste und Filteroptionen (linke Seite)
        JPanel leftPanel = new JPanel(new BorderLayout(5, 5)); // Erstellt ein Panel für die linke Seite
        leftPanel.setBackground(new Color(227, 202, 245)); // Setzt die Hintergrundfarbe des Panels
        leftPanel.setBorder(BorderFactory.createTitledBorder("Rezepte")); // Setzt den Titel des Panels

        JPanel filterPanel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Erstellt ein Panel für die Filteroptionen
        filterPanel.setBackground(new Color(176, 183, 246)); // Setzt die Hintergrundfarbe des Panels
        filterPanel.add(new JLabel("Kategorie:")); // Fügt ein Label für die Kategorie hinzu
        filterPanel.add(categoryComboBox); // Fügt das Dropdown für die Kategorien hinzu
        filterPanel.add(vegetarianFilterCheckbox); // Fügt die Checkbox für vegetarische & vegane Filterung hinzu
        filterPanel.add(veganFilterCheckbox);
        leftPanel.add(filterPanel, BorderLayout.NORTH);  // Fügt das Filterpanel zum linken Panel hinzu

        rezepteList.setFont(new Font("Arial", Font.PLAIN, 14)); // Setzt die Schriftart der Rezeptliste
        rezepteList.setFixedCellHeight(30); // Setzt die feste Zellenhöhe der Rezeptliste
        rezepteList.setSelectionBackground(new Color(165, 225, 239));// Setzt die Hintergrundfarbe der ausgewählten Zelle
        rezepteList.setSelectionForeground(Color.BLACK); // Setzt die Schriftfarbe der ausgewählten Zelle
        JScrollPane listScrollPane = new JScrollPane(rezepteList); // Erstellt ein Scrollpanel für die Rezeptliste
        listScrollPane.setPreferredSize(new Dimension(500, 10)); // Setzt die bevorzugte Größe des Scrollpanels
        leftPanel.add(listScrollPane, BorderLayout.CENTER); // Fügt das Scrollpanel zum linken Panel hinzu
        add(leftPanel, BorderLayout.WEST); // Fügt das linke Panel zum Hauptfenster hinzu

        // Hinzufügen der bestehenden Rezepte zur Rezeptverwaltung und zur Liste
        for (Rezept rezept : existingRezepts) {
            rezeptverwaltung.addRecipe(rezept);
            listModel.addElement(rezept);
        }



        // Rezeptdetails (rechte Seite)
        JPanel detailsPanel = new JPanel(new GridBagLayout()); // Erstellt ein Panel für die Rezeptdetails
        detailsPanel.setBorder(BorderFactory.createTitledBorder("Rezeptdetails")); // Setzt den Titel des Panels
        detailsPanel.setBackground(new Color(227, 202, 245)); // Setzt die Hintergrundfarbe des Panels
        GridBagConstraints gbc = new GridBagConstraints(); // Erstellt GridBagConstraints für das Layout
        gbc.insets = new Insets(5, 5, 5, 5); // Setzt die Innenabstände
        gbc.fill = GridBagConstraints.HORIZONTAL; // Setzt das Füllverhalten

        // Hinzufügen der Rezeptdetail-Felder
        addLabelAndComponent(detailsPanel, "Name:", nameField, gbc, 0);
        addLabelAndComponent(detailsPanel, "Schwierigkeitsgrad: ", schwierigkeitsgradComboBox, gbc, 1);
        addLabelAndComponent(detailsPanel, "Zubereitungszeit (in Minuten): ", zubereitungszeitField, gbc, 2);
        addLabelAndComponent(detailsPanel, "Kategorie:", kategorieField, gbc, 3);
        addLabelAndComponent(detailsPanel, "Zutaten:", new JScrollPane(zutatenArea), gbc, 4);
        addLabelAndComponent(detailsPanel, "Anweisungen:", new JScrollPane(anweisungenArea), gbc, 5);
        addLabelAndComponent(detailsPanel, "Ernährungstyp:", vegetarischCheckbox ,gbc , 6);
        addLabelAndComponent(detailsPanel, "", veganCheckbox ,gbc , 7);
        addLabelAndComponent(detailsPanel, "Portionen:", portionenSpinner, gbc, 8);

        add(detailsPanel, BorderLayout.CENTER); // Fügt das Detailpanel zum Hauptfenster hinzu




        // Buttons (unten Mitte)
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Erstellt ein Panel für die Buttons
        buttonPanel.setBackground(new Color(227, 202, 245)); // Setzt die Hintergrundfarbe des Panels

        // Stil der Buttons
        styleButton(addButton, new Color(3, 5, 3));
        styleButton(updateButton, new Color(3, 5, 3));
        styleButton(deleteButton, new Color(3, 5, 3));
        styleButton(clearButton, new Color(3, 5, 3));

        // Hinzufügen der Buttons
        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);

        ((JComponent) getContentPane()).setBorder(new EmptyBorder(10, 10, 10, 10)); // Setzt einen leeren Rand um den Inhalt des Fensters
    }




    // Fügt ein Label und eine Komponente zum Panel hinzu und setzt Layout-Eigenschaften
    private void addLabelAndComponent(JPanel panel, String labelText, JComponent component, GridBagConstraints gbc, int gridy) {
        gbc.gridx = 0; // Setzt die x-Position des GridBagConstraints
        gbc.gridy = gridy; // Setzt die y-Position des GridBagConstraints
        gbc.anchor = GridBagConstraints.WEST;  // Verankert die Komponente am westlichen Rand
        JLabel label = new JLabel(labelText); // Erstellt ein neues JLabel mit dem angegebenen Text
        label.setFont(new Font("Arial", Font.BOLD, 14)); // Setzt die Schriftart des Labels
        panel.add(label, gbc); // Fügt das Label zum Panel hinzu
        gbc.gridx = 1; // Setzt die x-Position des GridBagConstraints für die nächste Komponente
        gbc.weightx = 1.0; // Setzt das Gewicht in x-Richtung
        panel.add(component, gbc); // Fügt die Komponente zum Panel hinzu
        gbc.weightx = 0.0; // Setzt das Gewicht in x-Richtung zurück
    }



    //Stellt das Aussehen der Buttons ein
    private void styleButton(JButton button, Color color) {
        button.setBackground(color); // Setzt die Hintergrundfarbe des Buttons
        button.setForeground(Color.BLACK); // Setzt die Schriftfarbe des Buttons
        button.setFocusPainted(false);  // Deaktiviert die Fokusanzeige des Buttons
        button.setFont(new Font("Arial", Font.BOLD, 14)); // Setzt die Schriftart des Buttons
        button.setBorder(BorderFactory.createRaisedBevelBorder()); // Setzt den Rand des Buttons
        button.setPreferredSize(new Dimension(120, 40)); // Setzt die bevorzugte Größe des Buttons
    }


    // ActionListener zu den Buttons hinzufügen
    private void initListeners() {
        addButton.addActionListener(_ -> addRecipe());
        updateButton.addActionListener(_ -> updateRecipe());
        deleteButton.addActionListener(_ -> deleteRecipe());
        clearButton.addActionListener(_ -> clearFields());


        categoryComboBox.addActionListener(_ -> filterRecipes());
        vegetarianFilterCheckbox.addActionListener(_ -> filterRecipes());
        veganFilterCheckbox.addActionListener(_ -> filterRecipes());

        // ListSelectionListener zur Rezeptliste hinzufügen
        rezepteList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) { // Überprüft, ob die Auswahl nicht angepasst wird
                Rezept selectedRezept = rezepteList.getSelectedValue(); // Holt das ausgewählte Rezept
                if (selectedRezept != null) { // Überprüft, ob ein Rezept ausgewählt ist
                    displayRecipe(selectedRezept); // Zeigt das ausgewählte Rezept an
                }
            }
        } );
    }



    // Hinzufügen
    private void addRecipe() {
        Rezept rezept = createRezeptFromFields(); // Erstellt ein Rezept aus den Feldern
        rezeptverwaltung.addRecipe(rezept); // Fügt das Rezept zur Rezeptverwaltung hinzu
        listModel.addElement(rezept); // Fügt das Rezept zum Listenmodell hinzu
        clearFields(); // Leert die Felder
    }

    // Aktualisieren
    private void updateRecipe() {
        int selectedIndex = rezepteList.getSelectedIndex(); // Holt den Index des ausgewählten Rezepts
        if (selectedIndex != -1) { // Überprüft, ob ein Rezept ausgewählt ist
            Rezept updatedRezept = createRezeptFromFields(); // Erstellt ein aktualisiertes Rezept aus den Feldern
            rezeptverwaltung.updateRecipe(selectedIndex, updatedRezept); // Aktualisiert das Rezept in der Rezeptverwaltung
            listModel.set(selectedIndex, updatedRezept); // Aktualisiert das Rezept im Listenmodell
        }
    }

    // Löschen
    private void deleteRecipe() {
        int selectedIndex = rezepteList.getSelectedIndex(); // Holt den Index des ausgewählten Rezepts
        if (selectedIndex != -1) { // Überprüft, ob ein Rezept ausgewählt ist
            rezeptverwaltung.deleteRecipe(selectedIndex); // Löscht das Rezept aus der Rezeptverwaltung
            listModel.remove(selectedIndex); // Entfernt das Rezept aus dem Listenmodell
            clearFields(); // Leert die Felder
        }
    }

    // Leeren
    private void clearFields() {
        // Leert die Eingabefelder
        nameField.setText("");
        schwierigkeitsgradComboBox.setSelectedIndex(0);
        zubereitungszeitField.setText("");
        kategorieField.setText("");
        zutatenArea.setText("");
        anweisungenArea.setText("");
        vegetarischCheckbox.setSelected(false); // Setzt die vegetarische Checkbox zurück
        veganCheckbox.setSelected(false);
        portionenSpinner.setValue(1); // Setzt den Portionen-Spinner zurück
        rezepteList.clearSelection(); // Hebt die Auswahl in der Rezeptliste auf
    }

    // Zeigt Details zum ausgewählten Rezept an
    private void displayRecipe(Rezept rezept) {
        nameField.setText(rezept.getName());
        schwierigkeitsgradComboBox.setSelectedItem(rezept.getSchwierigkeitsgrad());
        zubereitungszeitField.setText(String.valueOf(rezept.getZubereitungszeit()));
        kategorieField.setText(rezept.getKategorie());
        zutatenArea.setText(String.join("\n", rezept.getZutaten()));
        anweisungenArea.setText(String.join("\n", rezept.getAnweisungen()));
        vegetarischCheckbox.setSelected(rezept.isVegetarisch());
        veganCheckbox.setSelected(rezept.isVegan());
        portionenSpinner.setValue(rezept.getPortionen());
    }


    // Erstellt neues Rezept aus den Eingabefeldern
    private Rezept createRezeptFromFields() {
        String name = nameField.getText();
        String schwierigkeitsgrad = (String) schwierigkeitsgradComboBox.getSelectedItem();
        int zubereitungszeit = Integer.parseInt(zubereitungszeitField.getText());
        String kategorie = kategorieField.getText();
        List<String> zutaten = List.of(zutatenArea.getText().split("\n"));
        List<String> anweisungen = List.of(anweisungenArea.getText().split("\n"));
        boolean vegetarisch = vegetarischCheckbox.isSelected();
        boolean vegan = veganCheckbox.isSelected();
        int portionen = (int) portionenSpinner.getValue();
        return new Rezept(name, schwierigkeitsgrad, zubereitungszeit, kategorie, zutaten, anweisungen, vegetarisch, vegan, portionen);
    }

    // Filtert alle Rezepte basierend auf den ausgewählter Kategorie und/oder Ernährungstyp
    private void filterRecipes() {
        String selectedCategory = (String) categoryComboBox.getSelectedItem();
        boolean onlyVegetarian = vegetarianFilterCheckbox.isSelected();
        boolean onlyVegan = veganFilterCheckbox.isSelected();

        List<Rezept> filteredRecipes = rezeptverwaltung.getRecipes().stream()
                .filter(rezept ->
                        {
                            assert selectedCategory != null;
                            return (selectedCategory.equals("Alle") || rezept.getKategorie().equalsIgnoreCase(selectedCategory)) &&
                                    (!onlyVegetarian || rezept.isVegetarisch()) &&
                                     (!onlyVegan || rezept.isVegan());
                        }
                )
                .toList();

        listModel.clear(); // Leert das Listenmodell
        for (Rezept rezept : filteredRecipes){ // Fügt die gefilterten Rezepte zum Listenmodell hinzu
            listModel.addElement(rezept);
        }

        if (filteredRecipes.isEmpty()) { // Zeigt eine Nachricht an, wenn keine Rezepte gefunden wurden
            JOptionPane.showMessageDialog(this, "Keine Rezepte gefunden.", "Filterergebnisse", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
