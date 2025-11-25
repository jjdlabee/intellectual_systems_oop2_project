/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.intellectual_systems.app;

import com.intellectual_systems.controller.GameEngine;
import com.intellectual_systems.controller.GameState;
import com.intellectual_systems.controller.state.LoadState;

/**
 *
 * @author Jonathan
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        GameState initialState = new LoadState();

        GameEngine gameEngine = new GameEngine(initialState);
        ((LoadState) initialState).setGameEngine(gameEngine);
        gameEngine.renderCurrentState();
    }
}
