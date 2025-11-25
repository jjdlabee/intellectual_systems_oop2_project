/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.controller.state;

import com.intellectual_systems.controller.GameEngine;
import com.intellectual_systems.controller.GameState;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class StartState implements GameState {
    private GameEngine gameEngine;

    public void setGameEngine(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
    }

    @Override
    public void render() {
        // Implementation for rendering the start state
        System.out.println("Welcome to the Game! Press Start to begin.");

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            if ("Start".equalsIgnoreCase(input)) {
                gameEngine.setState(new PlayerSetupState(gameEngine));
                gameEngine.render();
            }
        }
    }

}