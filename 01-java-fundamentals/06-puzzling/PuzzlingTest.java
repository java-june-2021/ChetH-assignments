import java.util.ArrayList;

public class PuzzlingTest{
    public static void main(String[] args) {
        int[] myArr = {3,5,1,2,7,9,8,13,25,32};

        Puzzling puzzTest = new Puzzling();

        ArrayList<Integer> greaterArr = puzzTest.greaterTen(myArr);
        System.out.println(greaterArr);

        String[] myNameArr = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        ArrayList<String> shuffleName = puzzTest.shuffleArr(myNameArr);

        puzzTest.shuffleAlphabet();

        ArrayList<Integer> sortedRandom = puzzTest.randomTen();

        String str = puzzTest.randomString();

        puzzTest.randomStringArr();
    }
}