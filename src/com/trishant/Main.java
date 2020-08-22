package com.trishant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations =  new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempMapOfExits = new HashMap<>();

        locations.put(0, new Location(0,Constants.locationZeroDescription,tempMapOfExits));

        tempMapOfExits = new HashMap<>();
        tempMapOfExits.put(Constants.westDirection, Constants.locationTwo);
        tempMapOfExits.put(Constants.eastDirection, Constants.locationThree);
        tempMapOfExits.put(Constants.southDirection, Constants.locationFour);
        tempMapOfExits.put(Constants.northDirection, Constants.locationFive);
        locations.put(1, new Location(1,Constants.locationOneDescription,tempMapOfExits));

        tempMapOfExits = new HashMap<>();
        tempMapOfExits.put(Constants.northDirection, Constants.locationFive);
        locations.put(2, new Location(2,Constants.locationTwoDescription,tempMapOfExits));

        tempMapOfExits = new HashMap<>();
        tempMapOfExits.put(Constants.westDirection,Constants.locationOne);
        locations.put(3, new Location(3,Constants.locationThreeDescription, tempMapOfExits));

        tempMapOfExits = new HashMap<>();
        tempMapOfExits.put(Constants.westDirection,Constants.locationTwo);
        tempMapOfExits.put(Constants.northDirection,Constants.locationOne);
        locations.put(4, new Location(4,Constants.locationFourDescription,tempMapOfExits));

        tempMapOfExits = new HashMap<>();
        tempMapOfExits.put(Constants.southDirection,Constants.locationOne);
        tempMapOfExits.put(Constants.westDirection,Constants.locationTwo);
        locations.put(5, new Location(5,Constants.locationFiveDescription, tempMapOfExits));

//        locations.get(1).addExit(Constants.westDirection, Constants.locationTwo);
//        locations.get(1).addExit(Constants.eastDirection,Constants.locationThree);
//        locations.get(1).addExit(Constants.southDirection,Constants.locationFour);
//        locations.get(1).addExit(Constants.northDirection,Constants.locationFive);
//        locations.get(1).addExit(Constants.quitKeyword,Constants.quitLocation);

//        locations.get(2).addExit(Constants.northDirection,Constants.locationFive);
//
//        locations.get(3).addExit(Constants.westDirection,Constants.locationOne);
//
//        locations.get(4).addExit(Constants.westDirection,Constants.locationTwo);
//        locations.get(4).addExit(Constants.northDirection,Constants.locationOne);
//
//        locations.get(5).addExit(Constants.southDirection,Constants.locationOne);

        Map<String, String> vocab = new HashMap<>();
        vocab.put("QUIT",Constants.quitKeyword);
        vocab.put("NORTH",Constants.northDirection);
        vocab.put("SOUTH",Constants.southDirection);
        vocab.put("EAST",Constants.eastDirection);
        vocab.put("WEST",Constants.westDirection);

        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String keyWithDirection : exits.keySet()) {
                System.out.print(keyWithDirection + ", ");
            }
            System.out.println();

            String userWrittenDirectionAction = scanner.nextLine().toUpperCase();
            if (userWrittenDirectionAction.length() > 1) {
                String[] userWrittenActionArrayForm = userWrittenDirectionAction.split(" ");
                for (String searchingDirection : userWrittenActionArrayForm) {
                    if (vocab.containsKey(searchingDirection)) {
                        userWrittenDirectionAction = vocab.get(searchingDirection);
                        break;
                    }
//                    for (String directionFromAllDirectionsList : Constants.differentDirectionPhrasesPossible) {
//                        if (searchingDirection.equals(directionFromAllDirectionsList)) {
//                            switch (searchingDirection) {
//                                case "NORTH":
//                                    direction = Constants.northDirection;
//                                    break;
//                                case "SOUTH":
//                                    direction = Constants.southDirection;
//                                    break;
//                                case "EAST":
//                                    direction = Constants.eastDirection;
//                                    break;
//                                case "WEST":
//                                    direction = Constants.westDirection;
//                                    break;
//                                case "QUIT":
//                                    direction = Constants.quitKeyword;
//                                    break;
//                                default:
//                                    direction = searchingDirection;
//                                    break;
//                            }
//                            directionFound = true;
//                            break;
//                        }
//                    }
                }
            }
            if (exits.containsKey(userWrittenDirectionAction)) {
                loc = exits.get(userWrittenDirectionAction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
