/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.intellectual_systems.parser;
import java.util.ArrayList;

import com.intellectual_systems.model.Category;

/**
 *
 * @author Jonathan
 */
public interface GameDataParser {
    ArrayList<Category> parse(String filePath);
}
