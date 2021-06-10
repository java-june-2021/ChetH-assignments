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

    public static Integer getIndexOrNull(String str1, String str2){
        int idx = str1.indexOf(str2);
        if (idx > -1){
            return idx;
        }
        return null;
    }

    public static String concatSubstring(String str1, int i1, int i2, String str2){
        return str1.substring(i1, i2) + str2;
    }

}