/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.intellectual_systems.logging;

import java.util.ArrayList;
import java.util.List;

import com.intellectual_systems.model.Turn;

/**
 *
 * @author Jonathan
 */
public class GameEvent implements GameEventListener{
    private final String caseID;
    private final String Activity;
    private final Turn turn;
    private final String Timestamp;
    private final List<GameEventListener> listeners;

    public GameEvent(String caseID, String Activity, Turn turn, String Timestamp) {
        this.caseID = caseID;
        this.Activity = Activity;
        this.turn = turn;
        this.Timestamp = Timestamp;
        this.listeners = new ArrayList<>();
    }

    public String getCaseID() {
        return caseID;
    }
    public String getActivity() {
        return Activity;
    }
    public Turn getTurn() {
        return turn;
    }
    public String getTimestamp() {
        return Timestamp;
    }

    public void addListener(GameEventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(GameEventListener listener) {
        listeners.remove(listener);
    }

    public void notifyEventListeners(GameEvent event) {
        for (GameEventListener listener : listeners) {
            listener.updateOnGameEvent(event);
        }
    }

    // @Override
    // public String toString() {
    //     return "Event Type: " + eventType + ", Description: " + eventDescription;
    // }

    @Override
    public void updateOnGameEvent(GameEvent event) {
        notifyEventListeners(event);
    }
}
