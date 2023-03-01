package com.zero.kyu5.greedisgood;

import java.util.HashMap;
import java.util.Map;

public class Greed {
    public static int greedy(int[] dice){

        int countOf1 = 0;
        int countOf2 = 0;
        int countOf3 = 0;
        int countOf4 = 0;
        int countOf5 = 0;
        int countOf6 = 0;
        for(int d : dice){
            switch (d){
                case 1:
                    countOf1++;
                    break;
                case 2:
                    countOf2++;
                    break;
                case 3:
                    countOf3++;
                    break;
                case 4:
                    countOf4++;
                    break;
                case 5:
                    countOf5++;
                    break;
                case 6:
                    countOf6++;
                    break;
            }
        }
        System.out.println(countOf1);
        System.out.println(countOf2);
        System.out.println(countOf3);
        System.out.println(countOf4);
        System.out.println(countOf5);
        System.out.println(countOf6);

        int point = 0;
        point += countPoint(countOf1, "1");
        point += countPoint(countOf2, "2");
        point += countPoint(countOf3, "3");
        point += countPoint(countOf4, "4");
        point += countPoint(countOf5, "5");
        point += countPoint(countOf6, "6");

        System.out.println("c of 1 : " + countOf1);
        if(countOf1 < 3){
            point += (countOf1 * 100);
        }
        if(countOf5 < 3){
            point += (countOf5 * 50);
        }

        System.out.println("point : " + point);

        return point;
    }

    public static int countPoint(int countOfThree, String number){
        int point = 0;
        if(countOfThree >= 3){
            switch (number){
                case "1":
                    point += 1000;
                    countOfThree -= 3;
                    if(countOfThree > 0){
                        point = point + (countOfThree * 100);
                        countOfThree = 0;
                    }
                    break;
                case "2":
                    point += 200;
                    break;
                case "3":
                    point += 300;
                    break;
                case "4":
                    point += 400;
                    break;
                case "5":
                    point += 500;
                    countOfThree -= 3;
                    if(countOfThree > 0){
                        point = point + (countOfThree * 50);
                        countOfThree = 0;
                    }
                    break;
                case "6":
                    point += 600;
                    break;
            }
        }
        return point;
    }
}
