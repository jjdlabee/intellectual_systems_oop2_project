/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.intellectual_systems.app;
import com.intellectual_systems.parser.*;

/**
 *
 * @author Jonathan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String jsonFilePath = "C:/Users/Jonathan/Documents/University of the West Indies/Year 3/Semester 1/Comp 3607 OOP2/Project/sample_game_JSON.json";
        String xmlFilePath = "C:/Users/Jonathan/Documents/University of the West Indies/Year 3/Semester 1/Comp 3607 OOP2/Project/sample_game_XML.xml";
        String csvFilePath = "C:/Users/Jonathan/Documents/University of the West Indies/Year 3/Semester 1/Comp 3607 OOP2/Project/sample_game_CSV.csv";

        JsonParser jsonParser = new JsonParser();
        jsonParser.parse(jsonFilePath);

        XmlParser xmlParser = new XmlParser();
        xmlParser.parse(xmlFilePath);

        CsvParser csvParser = new CsvParser();
        csvParser.parse(csvFilePath);
    }
}
