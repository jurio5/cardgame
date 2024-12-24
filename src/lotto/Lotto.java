package lotto;

import java.util.Random;

public class Lotto {
    private int[] lottoList = lottoList = new int[6];
    Random random = new Random();
    int count = 0;

    public int[] creeateNum() {

        while(true) {
            if (count == 6) {
                break;
            }

            int makeRandNum = random.nextInt(45) +1 ;

            if (isUnique(makeRandNum)) {
                lottoList[count++] = makeRandNum;
            }
        }

        return lottoList;
    }

    private boolean isUnique(int num) {
        for (int i : lottoList) {
            if (i == num) {
                return false;
            }
        }
        return true;
    }
}
