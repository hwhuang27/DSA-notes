package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol1773 {
    public static void main(String[] args) {
        String ruleKey = "color";
        String ruleValue = "silver";
        List<List<String>> items = new ArrayList<>();
        String[] device = {"phone","blue","pixel"};
        items.add(Arrays.asList(device));
        String[] device2 = {"computer","silver","lenovo"};
        items.add(Arrays.asList(device2));
        String[] device3 = {"phone","gold","iphone"};
        items.add(Arrays.asList(device3));

        int ans = countMatches(items, ruleKey, ruleValue);
        System.out.println(ans);
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int matches = 0;
        int index = -1;
        switch (ruleKey){
            case "type" -> index = 0;
            case "color" -> index = 1;
            case "name" -> index = 2;
        }
        for (List<String> item:
             items) {
            if (item.get(index).equals(ruleValue)){
                matches++;
            }
        }

        return matches;
    }
}
