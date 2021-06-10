public class StringManipulator{
    public static String trimAndConcat(String str1, String str2){
        return str1.trim() + str2.trim();
    }

    public static Integer getIndexOrNull(String str, char ch){
        for (int i=0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                return i;
            }
        }
        return null;
    }
}