package of0.lf;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    public static void main(String[] args) {

        Map<String, Integer> filosofer = new HashMap<>(
                Map.of("Platon", -428, "Hume", 1711, "Aristoteles", -384, "Descartes", 1596));

        filosofer.put("Popper", 1902);

        filosofer.remove("Hume");

        System.out.println(filosofer.size());

    }
}
