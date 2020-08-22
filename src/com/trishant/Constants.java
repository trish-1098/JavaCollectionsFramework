package com.trishant;

public class Constants {
    public static final String westDirection = "W";
    public static final String eastDirection = "E";
    public static final String northDirection = "N";
    public static final String southDirection = "S";
    public static final String locationZeroDescription = "You are sitting in front of a computer learning Java";
    public static final String locationOneDescription = "You are at the end of the road in front of a building";
    public static final String locationTwoDescription = "You are at the top of the hill";
    public static final String locationThreeDescription = "You are inside a building, a well-house for a small spring";
    public static final String locationFourDescription = "You are in a valley beside a stream";
    public static final String locationFiveDescription = "You are in the forest";
    public static final int locationZero = 0;
    public static final int locationOne = 1;
    public static final int locationTwo = 2;
    public static final int locationThree = 3;
    public static final int locationFour = 4;
    public static final int locationFive = 5;

    public static final String quitKeyword = "Q";
    public static final int quitLocation = 0;

    public static final String[] differentDirectionPhrasesPossible = {
                    northDirection,
                    "NORTH",
                    southDirection,
                    "SOUTH",
                    eastDirection,
                    "EAST",
                    westDirection,
                    "WEST",
                    quitKeyword,
                    "QUIT"
    };
}
