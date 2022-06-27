package com;

public class ByTwos implements Series {
    
    int val;

    ByTwos() {
        val = 0;
    }

    public int getNext() {
        
        if ( val >= Max) {
            System.out.println(Error);
        } else {
            val += 2;
        }
        return val;
    }

    public int getPrev() {
        val -= 2;
        return val;
    }

}
