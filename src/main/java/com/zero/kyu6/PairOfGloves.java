package com.zero.kyu6;

import java.util.ArrayList;
import java.util.List;

public class PairOfGloves {
    public static int numberOfPairs(String[] gloves) {
        if(gloves.length < 1) return 0;

        List<String> gloveList = new ArrayList<>();
        for(String glove : gloves){
            gloveList.add(glove);
        }

        int result = 0;
        for(int i = 0; i < gloveList.size(); i++){
            for(int j = i+1; j < gloveList.size(); j++){
                if(gloveList.get(i).equals(gloveList.get(j))){
                    result += 1;
                    gloveList.remove(j);
                    break;
                }
            }
        }

        return result;
    }
}
