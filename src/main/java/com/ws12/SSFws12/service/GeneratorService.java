package com.ws12.SSFws12.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorService {
    Random random = new Random();
    //performs the business logic here.
    List<Integer> numbers = new ArrayList<>();
    public List<Integer> createList(int howMany, int range){
        for (int i=0; i<howMany; i++){
            int currNo = random.nextInt(0,range);
            if (numbers.contains(currNo)){
                i--;
            }
            else{
                numbers.add(currNo);
            }
       
        }
        return numbers;
    } 
}
