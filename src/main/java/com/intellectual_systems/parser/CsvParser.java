/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.parser;
import com.intellectual_systems.model.*;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public class CsvParser implements GameDataParser {

    @Override
    public void parse(String filePath) {
        // Implementation for parsing CSV files
        ArrayList<Category> categories = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();
 
        System.out.println("Parsing CSV file: " + filePath);
        // Add actual parsing logic here

         try {
            Reader in = new FileReader(filePath);
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                ArrayList< String> choices = new ArrayList<>();
                for (int i = 3; i < 7; i++) {
                    choices.add(record.get(i));
                }
                Question question = new Question(
                    record.get(2), // questionText
                    choices, // choices
                    record.get(7), // answer
                    record.get(0), // category
                    Integer.parseInt(record.get(1)) // value
                );
                
                if(categories.stream().noneMatch(c -> c.getName().equals(record.get(0)))) {
                    categories.add(new Category(record.get(0)));
                }

                questions.add(question);
            }

            for (Category category : categories) {
                for (Question question : questions) {
                    if (question.getCategory().equals(category.getName())) {
                        category.addQuestion(question);
                    }
                }
            }
        } catch (IOException e) {
        }

        for (Category category : categories) {
            System.out.println(category);
        }
    }

}
