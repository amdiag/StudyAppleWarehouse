package com.amdiag.appleWarehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppleWarehouse {

    private List<Apple> apples = getAllApples();

    public List<Apple> findAllGreenApple(){
        return apples.stream().filter(apple -> "green".equals(apple.getColor())).collect(Collectors.toList());
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