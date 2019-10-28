package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flag, int jump) {
        Integer numOfJumps = 0;
        if( flag / jump > 0) {
            numOfJumps = flag / jump;
        }
        if (flag % jump > 0){
            numOfJumps += flag % jump;
        }

        return numOfJumps;
    }
}
