import java.util.ArrayList;
import java.util.Set;

public class ExceptionsListTest {
    public static void main(String[] args){
 
    ExceptionsList eListTest = new ExceptionsList();
    ArrayList<Object> myList = new ArrayList<Object>();
    myList = eListTest.createObjList();
    
    eListTest.castObjList(myList);
    }
}