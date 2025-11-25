/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.model;

/**
 *
 * @author Jonathan
 */
public class Turn {
    private String currentCategory;
    private String currentQuestion;
    private String currentAnswer;
    private int currentQuestionValue;

     public void setCurrentCategory(String category) {
        this.currentCategory = category;
    }
    public void setCurrentQuestion(String question) {
        this.currentQuestion = question;
    }
    public void setCurrentAnswer(String answer){
        this.currentAnswer = answer;
    }
    public void setQuestionValue(int value){
        this.currentQuestionValue = value;
    }
}
