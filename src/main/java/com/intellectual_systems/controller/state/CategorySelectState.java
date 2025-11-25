/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.controller.state;

import com.intellectual_systems.controller.GameState;
import com.intellectual_systems.controller.GameEngine;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class CategorySelectState implements GameState {
    private final GameEngine gameEngine;

    public CategorySelectState(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    @Override
    public void render() {
        // Implementation for rendering the category select state
        System.out.println("Select a category for the game.");
        // Add logic to handle category selection
        try (Scanner scanner = new Scanner(System.in)) {
            String category = scanner.nextLine();
            // Store selected category as needed
            System.out.println("Category " + category + " has been selected.");
            // After selection, transition to the next state
            // gameEngine.setState(new NextState(gameEngine));
        }
    }
}