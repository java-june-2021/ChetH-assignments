import java.util.ArrayList;

public class Basics{
    public static void printNum(){
        System.out.println("Printing 1 ~ 255:");
        for(int i=1; i<256; i++){
            System.out.println(i);
        }
    }

    public static void printOdd(){
        System.out.println("Printing odds 1 ~ 255:");
        for(int i = 1; i < 256; i += 2){
            System.out.println(i);
        }
    }

    public static void printSum(){
        System.out.println("Printing new number and sum:");
        int sum = 0;
        for(int i = 0; i < 256; i++){
            sum += i;
            System.out.println("New number: " + i + ", Sum: " + sum);
        }
    }

    public static void iterateArr(int[] arr){
        System.out.println("Printing each element of array");
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void printMax(int[] arr){
        System.out.println("Printing max in array:");
        int max = arr[0];
        for(int element : arr){
            if(element > max){
                max = element;
            }
        }
        System.out.println(max);
    }

    public static void printAvg(int[] arr){
        System.out.println("Printing average of array:");
        float sum = 0;
        for (int element : arr){
            sum += element;
        }
        float avg = sum/arr.length;
        System.out.println(avg);
    }

    public static void arrListOdd(){
        System.out.println("Creating array list of odds:");
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i=1; i<256; i+=2){
            y.add(i);
        }
        System.out.println(y);
    }

    public static int greaterThanY(int[] arr, int y){
        System.out.println("Returning count of values greater than Y:");
        int count = 0;
        for(int element : arr){
            if(element > y){
                count ++;
            }
        }
        return count;
    }

    public static void squareValues(int[] arr){
        System.out.println("Squaring values in array:");
        for(int element : arr){
            System.out.println(element);
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static void removeNegative(int[] arr){
        System.out.println("Removing negative values from array:");
        for(int element : arr){
            System.out.println(element);
        }
       for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                arr[i]=0;
            }
        }
        for(int element : arr){
            System.out.println(element);
        }
    }

    public static float[] maxMinAvg(float[] arr){
        System.out.println("Returning max min avg from array");
        float max = arr[0];
        float min = arr[0];
        float sum = 0;
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        float avg = sum/arr.length;
        float[] results = {max, min, avg};
        return results;
    }

    public static void shiftArrayLeft(int[] arr){
        System.out.println("Shifting array left");
        for(int element : arr){
            System.out.println(element);
        }
        for(int i=0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        for(int element : arr){
            System.out.println(element);
        }
    }
}