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
    private final Player player;
    private int turnNumber = 0;
    private String currentCategory;
    private String currentQuestion;
    private String currentAnswer;
    private boolean isCorrect;
    private int currentQuestionValue;
    private int scoreAfterTurn;

    public Turn(Player player) {
        this.player = player;
    }

    public void setCurrentCategory(String category) {
        this.currentCategory = category;
    }
    public void setCurrentQuestion(String question) {
        this.currentQuestion = question;
    }
    public void setCurrentAnswer(String answer){
        this.currentAnswer = answer;
    }
    public void setCurrentQuestionValue(int value){
        this.currentQuestionValue = value;
    }
    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
        turnNumber++;
    }
    public void setScoreAfterTurn(int score) {
        this.scoreAfterTurn = score;
    }

    public int getTurnNumber() {
        return this.turnNumber;
    }
    public String getIsCorrect() {
        if (isCorrect) {
            return "Correct";
        } else {
            return "Incorrect";
        }
    }
    public Player getPlayer() {
        return player;
    }
    public String getCurrentCategory() {
        return currentCategory;
    }
    public String getCurrentQuestion() {
        return currentQuestion;
    }
    public String getCurrentAnswer() {
        return currentAnswer;
    }
    public int getCurrentQuestionValue() {
        return currentQuestionValue;
    }
    public int getScoreAfterTurn() {
        return scoreAfterTurn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(player.getUsername()).append(" selected ")
        .append(this.currentCategory).append(" for ")
        .append(this.currentQuestionValue).append(" pts \n");
        sb.append("Question: ").append(this.currentQuestion).append("\n");
        sb.append("Answer: ").append(this.currentAnswer).append(" - ").append(this.getIsCorrect()).append(" (+").append(this.currentQuestionValue).append(" pts)\n");
        sb.append("Score after turn: ").append(this.getPlayer().getUsername()).append(" - ").append(this.scoreAfterTurn).append("\n");
        return sb.toString();
    }   
}