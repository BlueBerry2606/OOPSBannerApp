import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[] {
            " ******* ",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            "*       *",
            " ******* "
        });

        patternMap.put('P', new String[] {
            "******** ",
            "*       *",
            "*       *",
            "******** ",
            "*        ",
            "*        ",
            "*        "
        });

        patternMap.put('S', new String[] {
            " ******* ",
            "*        ",
            "*        ",
            " ******* ",
            "        *",
            "        *",
            " ******* "
        });

        return patternMap;
    }

    public static void displayBanner(String word, Map<Character, String[]> patternMap) {
        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();
            for (int col = 0; col < word.length(); col++) {
                char ch = word.charAt(col);
                line.append(patternMap.get(ch)[row]);
                if (col < word.length() - 1) {
                    line.append("  ");
                }
            }
            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> patternMap = buildPatternMap();
        displayBanner("OOPS", patternMap);
    }
}