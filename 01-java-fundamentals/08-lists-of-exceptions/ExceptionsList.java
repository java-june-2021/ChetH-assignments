import java.util.ArrayList;
// class IntegerCastException extends Exception{}

public class ExceptionsList {
    public static ArrayList<Object> createObjList() {
        ArrayList<Object> newList = new ArrayList<Object>();
        newList.add("42");
        newList.add("Halleluja");
        newList.add(82);
        newList.add('y');
        return newList;
    }

    public static void castObjList(ArrayList<Object> thisList){
        for(int i=0; i<thisList.size(); i++){
            try{
                Integer castedValue = (Integer) thisList.get(i);
                System.out.println("This value was cast successfully: " + thisList.get(i));
            } catch (Exception e){
                System.out.println("Failed to cast non-integer value: " + thisList.get(i) + " to an Integer");
            }
        }
    }
}