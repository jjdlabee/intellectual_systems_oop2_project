/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.reporting;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Jonathan
 */
public class DocxReportGenerator implements ReportGenerator {
    private static final Logger logger = LoggerFactory.getLogger(DocxReportGenerator.class);

    @Override
    public void generateReport(String filePath, String content) {
        try (XWPFDocument document = new XWPFDocument()) {
            if (content == null) {
                content = "";
            }
            String[] lines = content.split("\\r?\\n", -1);
            for (String line : lines) {
                XWPFParagraph paragraph = document.createParagraph();
                XWPFRun run = paragraph.createRun();
                run.setText(line == null ? "" : line);
            }

            try (var out = new java.io.FileOutputStream(filePath)) {
                document.write(out);
            }

            logger.info("DOCX report generated successfully at: {}", filePath);

        } catch (Exception e) {
            logger.error("Error generating DOCX report: {}", e.getMessage());
            System.err.println("Error generating DOCX report: " + e.getMessage());
        }
    }
}
