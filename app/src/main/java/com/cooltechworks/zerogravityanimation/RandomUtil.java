package com.cooltechworks.zerogravityanimation;

import java.util.Random;

/**
 * Created by Harish Sridharan on July 20 2015
 */
public class RandomUtil {

    /**
     * Generates the random between two given integers.
     * @param start
     * @param end
     * @return
     */
    public static int generateRandomBetween(int start, int end) {

        Random random = new Random();
        int rand = random.nextInt(Integer.MAX_VALUE - 1) % end;

        if (rand < start) {
            rand = start;
        }
        return rand;
    }
}
