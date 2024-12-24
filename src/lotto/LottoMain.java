package lotto;

public class LottoMain {

    public static void main(String[] args) {
        Lotto lotto = new Lotto();

        int[] ints = lotto.creeateNum();

        System.out.print("로또 번호 : ");
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }

    }
}
