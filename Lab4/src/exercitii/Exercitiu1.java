package exercitii;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;

public class Exercitiu1 {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // Convert both strings to lowercase and then compare
        int result = str1.toLowerCase().compareTo(str2.toLowerCase());

        if (result < 0) {
            System.out.println("str1 < str2");
        } else if (result > 0) {
            System.out.println("str1 > str2");
        } else {
            System.out.println("str 1 == str2");
        }
    }
}

class Exercitiu2 {
    public static void main(String[] args) {
        String input = "This is 1 string";
        int vocale = 0, consoane = 0, cifre = 0, spati = 0;

        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vocale++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                consoane++;
            } else if (ch >= '0' && ch <= '9') {
                cifre++;
            } else if (ch == ' ') {
                spati++;
            }
        }

        System.out.println("Vocale: " + vocale);
        System.out.println("Consoane: " + consoane);
        System.out.println("Cifre: " + cifre);
        System.out.println("Spatii: " + spati);
    }
}


class Exercitiul3 {
    public static void main(String[] args) {
        String input = "abracadabra";

        Map<Character, Integer> frecventa = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                frecventa.put(c, frecventa.getOrDefault(c, 0) + 1);
            }
        }

        Map<Character, Integer> sortedMap = new TreeMap<>(frecventa);

        for (Map.Entry<Character, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



class Exercitiul4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 4, 4, 5, 6, 6};
        System.out.println("Lungime curenta: " + array.length);

        int length = removeDuplicates(array);

        System.out.println("Lungime noua: " + length);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        return uniqueIndex + 1;
    }
}
