package com.ws12.SSFws12.model;

import java.util.ArrayList;
import java.util.List;

import com.ws12.SSFws12.service.GeneratorService;

public class numbersList {
    //defines the properties of the class here. contains constructors, getter setters
    public static List<Integer> generatedList = new ArrayList<>();
    //call the service to generate the list for us
    public static List<Integer> getGeneratedList(int howMany, int range) {
            GeneratorService gs = new GeneratorService();
            generatedList = gs.createList(howMany, range);
            return generatedList;
    }

    
}
