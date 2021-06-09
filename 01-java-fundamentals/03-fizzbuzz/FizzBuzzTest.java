public class FizzBuzzTest{
    public static void main(String args[]){
        FizzBuzz test = new FizzBuzz();
        for(int i=0; i<=100; i++){
            System.out.println("Current number: " + i + ", result: " + test.fizzBuzz(i));
        }
    }
}