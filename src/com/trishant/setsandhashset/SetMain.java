package com.trishant.setsandhashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMain {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury",88);
        addHeavenlyBodyToMapAndSet(temp,false);

        temp = new HeavenlyBody("Venus",225);
        addHeavenlyBodyToMapAndSet(temp,false);

        temp = new HeavenlyBody("Earth",365);
        addHeavenlyBodyToMapAndSet(temp,false);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon",27);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars",687);
        addHeavenlyBodyToMapAndSet(temp,false);

        tempMoon = new HeavenlyBody("Deimos",1.3);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Phobos",0.3);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Jupiter",4332);
        addHeavenlyBodyToMapAndSet(temp,false);

        tempMoon = new HeavenlyBody("Io",1.8);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Europa",3.5);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Ganymede",7.1);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        tempMoon = new HeavenlyBody("Callisto",16.7);
        addHeavenlyBodyToMapAndSet(tempMoon,true);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Saturn",10759);
        addHeavenlyBodyToMapAndSet(temp,false);

        temp = new HeavenlyBody("Uranus",30660);
        addHeavenlyBodyToMapAndSet(temp,false);

        temp = new HeavenlyBody("Neptune",165);
        addHeavenlyBodyToMapAndSet(temp,false);

        temp = new HeavenlyBody("Pluto",248);
        addHeavenlyBodyToMapAndSet(temp,false);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println(planet.getName());
        }

        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons:-");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }
    }
     private static void addHeavenlyBodyToMapAndSet (HeavenlyBody heavenlyBody, boolean isMoon) {
        solarSystem.put(heavenlyBody.getName(), heavenlyBody);
        if (!isMoon) {
            planets.add(heavenlyBody);
        }
    }
}
