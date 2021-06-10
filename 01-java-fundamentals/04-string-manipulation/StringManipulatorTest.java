public class StringManipulatorTest{
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("     Hello    ", "    World    ");
        System.out.println(str);

        StringManipulator manipulator2 = new StringManipulator();
        char letter = 'o';
        Integer a = manipulator2.getIndexOrNull("Coding", letter);
        Integer b = manipulator2.getIndexOrNull("Hello World", letter);
        Integer c = manipulator2.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}