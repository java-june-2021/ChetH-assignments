import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class Puzzling{
    public static ArrayList<Integer> greaterTen(int[] arr){
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int element : arr){
            sum += element;
            if(element > 10){
                newArr.add(element);
            }
        }
        System.out.println(sum);
        return newArr;
    }

    public static ArrayList<String> shuffleArr(String[] arr){
        List<String> strList = Arrays.asList(arr);
        Collections.shuffle(strList);
        System.out.println(strList);
        ArrayList<String> newArr = new ArrayList<String>();
        for(String element : arr){
            if(element.length() > 5){
                newArr.add(element);
            }
        }
        System.out.println("Longer than 5 char "+newArr);
        return newArr;
    }

    public static void shuffleAlphabet(){
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        List<String> strList = Arrays.asList(alphabet);
        Collections.shuffle(strList);
        System.out.println("Shuffled alphabet: " + strList);
        System.out.println("Last element: " + strList.get(25));
        System.out.println("First element: " + strList.get(0));
        if(strList.get(0) == "a" || strList.get(0) == "e" ||strList.get(0) == "i" ||strList.get(0) == "o" ||strList.get(0) == "u"){
            System.out.println("First element is a vowel!");
        }
    }

    public static ArrayList<Integer> randomTen(){
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        Random random = new Random();
        for(int i=0; i<10; i++){
            intArr.add(random.nextInt(100-55)+55);
        }
        System.out.println("Ten random numbers between 55 and 100: " + intArr);
        Collections.sort(intArr);
        System.out.println("Sorted: " + intArr);
        System.out.println("Max: " + Collections.max(intArr));
        System.out.println("Min: " + Collections.min(intArr));
        return intArr;
    }

    public static String randomString(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for(int i=0; i<5; i++){
            str.append(alphabet.charAt(random.nextInt(25)));
        }
        String randomStr = str.toString();
        System.out.println("Random string 5 char long: " + randomStr);
        return randomStr;
    }

    public static void randomStringArr(){
        ArrayList<String> randomArr = new ArrayList<String>();
        for(int i = 0; i < 10; i++){
            randomArr.add(randomString());
        }
        System.out.println(randomArr);
    }
}