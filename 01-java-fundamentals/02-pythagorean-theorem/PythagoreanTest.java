public class PythagoreanTest {
    public static void main(String[] arg){
        Pythagorean legC = new Pythagorean();
        double hyp = legC.calculateHypotenuse(4, 5);
        System.out.println("LegA = 4, LegB = 5, hypotenuse = " + hyp);
    }
}