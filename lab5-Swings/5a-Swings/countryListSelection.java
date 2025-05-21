// 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display them on console whenever the countries are selected on the list.

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class countryListSelection {
    public static void main(String[] args) {
        // Create an array of country names
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        // Create a JList with the country names
        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add a ListSelectionListener to handle item selection
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Check if the selection is not adjusting (i.e., the user has finished selecting)
                if (!e.getValueIsAdjusting()) {
                    // Get the selected value from the JList
                    String selectedCountry = countryList.getSelectedValue();
                    // Display the selected country in the console
                    System.out.println("Selected Country: " + selectedCountry);
                }
            }
        });

        // Create a JScrollPane to make the JList scrollable
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Create a JFrame to hold the JScrollPane
        JFrame frame = new JFrame("Country List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.setSize(200, 250);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
