/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.controller;

/**
 *
 * @author Jonathan
 */
public class GameEngine {
    GameState state;

    public GameEngine(GameState startState) {
        this.state = startState;
    }

    public void render() {
        state.render();
    }

    public void setState(GameState state) {
        this.state = state;
    }
}
