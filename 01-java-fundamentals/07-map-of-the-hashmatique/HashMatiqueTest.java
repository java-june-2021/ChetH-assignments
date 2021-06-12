import java.util.HashMap;

public class HashMatiqueTest{
    public static void main(String[] args){
        HashMatique TestCase = new HashMatique();
        HashMap<String, String> bandTracks = new HashMap<String, String>();
        bandTracks = TestCase.createHashMap();
    
        TestCase.pullByKey(bandTracks);

        TestCase.pullAll(bandTracks);
    }
}