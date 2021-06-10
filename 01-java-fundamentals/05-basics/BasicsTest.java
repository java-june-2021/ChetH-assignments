public class BasicsTest{
    public static void main(String[] args) {
        Basics test1 = new Basics();
        Basics.printNum();

        Basics.printOdd();

        Basics.printSum();

        int[] myArr = {1,3,-5,6,0,234};
        Basics.iterateArr(myArr);

        Basics.printMax(myArr);

        Basics.printAvg(myArr);

        Basics.arrListOdd();

        int countY = Basics.greaterThanY(myArr, 4);
        System.out.println(countY);

        int[] myArr2 = {1,3,5,7};
        Basics.squareValues(myArr2);

        Basics.removeNegative(myArr);

        float[] myArr3 = {2, 4, 5, 10, -3};
        float[] mma = Basics.maxMinAvg(myArr3);
        for(float val : mma){
            System.out.println(val);
        }

        Basics.shiftArrayLeft(myArr2);
    }
}