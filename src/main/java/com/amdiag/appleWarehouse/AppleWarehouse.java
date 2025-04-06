package com.amdiag.appleWarehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    public List<Apple> findApplesByColor( String color ){
        return apples.stream().filter(apple -> color.equals(apple.getColor())).collect(Collectors.toList());
    }

    public String checkWeight( Apple apple ){
        if (apple.getWeight() > 150){
            return "Heavy";
        }else{
            return "Light";
        }
    }

    public List<Apple> findApplesHeavierThen( int weight ){
        return apples.stream().filter(apple -> apple.getWeight() > weight).collect(Collectors.toList());
    }

    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }


}