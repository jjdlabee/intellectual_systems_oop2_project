/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.logging;

/**
 *
 * @author Jonathan
 */
public class EventLogger implements GameEventListener {
    @Override
    public void updateOnGameEvent(GameEvent event) {
        // Log the event details to console or a file
        System.out.println("Game Event Occurred: " + event.toString());
    }

}
