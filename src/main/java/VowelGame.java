public class VowelGame {

    public static void main (String args[]){
       transform("black", "white");
    }

    public static String[] transform(String str1, String str2) {

        if (!str1.matches(".*[aeiou].*") || !str2.matches(".*[aeiou].*")){
            throw new IllegalArgumentException("Error");
        }

        String[] result1 = str1.split("(?<=[aeiou])", 2);
        String[] result2 = str2.split("(?<=[aeiou])", 2);
        String[] result = {result1[0] + result2[1], result2[0] + result1[1]};

        return result;
    }

}
