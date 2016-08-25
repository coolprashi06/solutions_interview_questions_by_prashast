package prashastsaxena;

public class ReverseVowels {

    public String reverseVowels(String s){

        String vowels = "aeiouAEIOU";

        int low = 0;
        int high = s.length()-1;
        char[] chars = s.toCharArray();

        while (low < high){
            if(!vowels.contains(String.valueOf(chars[low]))){
                low ++;
                continue;
            }
            if(!vowels.contains(String.valueOf(chars[high]))){
                high--;
                continue;
            }

            //swap
            char t = chars[low];
            chars[low] = chars[high];
            chars[high] = t;
            low++; high--;

        }
        return String.valueOf(chars);
    }
}
