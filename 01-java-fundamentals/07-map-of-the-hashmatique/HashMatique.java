import java.util.HashMap;
import java.util.Set;

public class HashMatique{
    public static HashMap<String, String> createHashMap(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Algorithm", "Burn like a slave. Churn like a cog. We are caged in simulations. Algorithms evolve. Push us aside and render us obsolete");
        trackList.put("The Dark Side", "I have lived in darkness. For all my life I've been pursued. You'd be afraid if you could feel my pain");
        trackList.put("Pressure", "I'm trapped and my back is up against the wall. I see no solution or exit out. I'm grinding it out, no one can see");
        trackList.put("Something Human", "My circuits have blown. I know it's self imposed. And all I have shared, and all I have loved. Is all I'll ever own");
        trackList.put("Thought Contagion", "Strung out falling from the big time. Welcome to the infinite black skies. Brain cleansed fractured identity. Fragments and scattered debris");
        trackList.put("The Void", "They'll say, no one can see us. That we're estranged and all alone. They believe nothing can reach us. And pull us out of the boundless gloom");
        return trackList;
    }

    public static void pullByKey(HashMap<String, String> trackList){
        String lyrics = trackList.get("Something Human");
        System.out.println("Pulling lyrics for track: Something Human:");
        System.out.println(lyrics);
    }

    public static void pullAll(HashMap<String, String> trackList){
        Set<String> titles = trackList.keySet();
        for(String title : titles){
            System.out.println(title + ": " + trackList.get(title));
        }
    }
}