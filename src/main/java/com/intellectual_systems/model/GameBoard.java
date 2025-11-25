/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.model;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class GameBoard {
    private final String[][] board;
    private final HashMap<String, Integer> indexes;
    private final int rows;
    private final int cols;

    public GameBoard(List<Category> categories) {
        this.rows = categories.get(0).getQuestions().size() + 1; // +1 for category names
        this.cols = categories.size();
        board = new String[rows][cols];
        indexes = new HashMap<>();
        for (int i = 0; i < categories.size(); i++) {
            indexes.put(categories.get(i).getName(), i);
        }
        for (int i = 0; i < categories.get(0).getQuestions().size(); i++) {
            indexes.put(categories.get(0).getQuestions().get(i).getValue() + "", i);
        }
    }

    public void initializeBoard(List<Category> categories) {
        for (int i = 0; i < rows; i++) {
            if(i != 0){
                for (int j = 0; j < cols; j++) {
                    board[i][j] = "";
                }
            }
            else{
                for (int j = 0; j < cols; j++) {
                    board[i][j] = categories.get(j).getName();
                }
            }
        }
    }

    public void setCell(String category, int value, Question question) {
        Integer col = indexes.get(category);
        Integer row = indexes.get(value + "");
        if (col != null && row != null && row >= 0 && row < rows) {
            board[row + 1][col] = question.getValue() + "";
        } else {
            throw new IndexOutOfBoundsException("Invalid category or value");
        }
    }

    public String getCell(String category, int value) {
        Integer col = indexes.get(category);
        Integer row = indexes.get(value + "");
        if (col != null && row != null && row >= 0 && row < rows) {
            return board[row][col];
        } else {
            throw new IndexOutOfBoundsException("Invalid category or value");
        }
    }

    public void loadQuestions(List<Category> categories) {
        for (int j = 0; j < categories.size(); j++) {
            Category category = categories.get(j);
            for (int i = 0; i < category.getQuestions().size(); i++) {
                Question question = category.getQuestions().get(i);
                setCell(category.getName(), question.getValue(), question);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        // Calculate column widths based on content
        int[] colWidths = new int[cols];
        for (int j = 0; j < cols; j++) {
            colWidths[j] = 15; // minimum width
            for (int i = 0; i < rows; i++) {
                String cell = board[i][j] != null ? board[i][j] : " ";
                colWidths[j] = Math.max(colWidths[j], cell.length() + 2);
            }
        }
        
        // Build horizontal separator
        StringBuilder separator = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            separator.append("-".repeat(colWidths[j]));
            if (j < cols - 1) {
                separator.append("+");
            }
        }
        String horSeparator = separator.toString();
        
        // Add top separator
        sb.append(horSeparator).append("\n");
        
        // Add rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                String cell = board[i][j] != null ? board[i][j] : " ";
                sb.append(String.format("%-" + colWidths[j] + "s", cell));
                if (j < cols - 1) {
                    sb.append("|");
                }
            }
            sb.append("\n");
            
            // Add separator after each row (including after last row for clean border)
            sb.append(horSeparator).append("\n");
        }
        
        return sb.toString();
    }
}