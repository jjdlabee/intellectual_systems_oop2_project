/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.reporting;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jonathan
 */
public class TxtReportGenerator implements ReportGenerator {

    @Override
    public void generateReport(String filePath, String content) {
        // Implementation for generating TXT report
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error generating TXT report: " + e.getMessage());
        }
    }
}
