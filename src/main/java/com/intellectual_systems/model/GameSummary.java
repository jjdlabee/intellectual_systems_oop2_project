/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class GameSummary {
    private final String gameId;
    private final List<String> playerNames;
    private final List<Integer> playerScores = new ArrayList<>();
    private final List<String> turnList = new ArrayList<>();

    public GameSummary(String gameId, List<Player> players) {
        this.gameId = gameId;
        this.playerNames = new ArrayList<>();
        for(Player player : players){
            this.playerNames.add(player.getUsername());
        }
    }

    public void addTurn(String turn){
        this.turnList.add(turn);
    }

    public void addScores(List<Player> players){
        for(Player player : players){
            this.playerScores.add(player.getScore());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JEOPARDY PROGRAMMING GAME REPORT\n");
        sb.append("=================================\n\n");
        sb.append("Case ID: ").append(gameId).append("\n\n");
        sb.append("Players: ");
        if(playerNames != null){
            sb.append(playerNames.get(0));

            for (int i = 1; i < playerNames.size(); i++) {
                sb.append(", ").append(playerNames.get(i));
            }
        }
        sb.append("\n\nGameplay Summary:\n");
        sb.append("-----------------\n\n");

        if(turnList.isEmpty()){
            sb.append("No turns were played.\n");
            return sb.toString();
        }
        for (int i = 0; i < turnList.size(); i++) {
            sb.append("Turn ").append(i + 1).append(": ").append(turnList.get(i)).append("\n");
        }

        if(playerScores.isEmpty()){
            sb.append("No scores to display.\n");
            return sb.toString();
        }
        sb.append("\nFinal Scores:\n");
        for (int i = 0; i < playerNames.size(); i++) {
            sb.append(playerNames.get(i)).append(": ").append(playerScores.get(i)).append("\n");
        }
        
        return sb.toString();
    }

}
