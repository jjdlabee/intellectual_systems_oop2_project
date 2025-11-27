/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.intellectual_systems.logging;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonathan
 */
public class EventLogger implements GameEventListener {
    private final List<GameEvent> eventLog = new ArrayList<>();

    @Override
    public void updateOnGameEvent(GameEvent event) {
        // Log the event details to console or a file
        eventLog.add(event);
        for (GameEvent e : eventLog) {
            System.out.println(e.toString());
        }
    }

    public void LogEventsToCSV() {
        System.out.println("Test>>>>>>>>>>" + eventLog.size() + eventLog.get(2).toString());
        CSVLogger csvLogger = new CSVLogger("game_events_log.csv");
        csvLogger.logGameEvents(this.eventLog);
    }



}
