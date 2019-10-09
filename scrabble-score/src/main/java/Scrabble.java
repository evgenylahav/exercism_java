import java.util.HashMap;

class Scrabble {
    private int score = 0;
    private HashMap<Character, Integer> mapper = new HashMap<>();

    Scrabble(String word) {
        initMapper();
        for (Character ch: word.toCharArray()) {
            score += mapper.get(Character.toUpperCase(ch));
        }
    }

    private void initMapper() {
        mapper.put('A', 1);
        mapper.put('B', 3);
        mapper.put('C', 3);
        mapper.put('D', 2);
        mapper.put('E', 1);
        mapper.put('F', 4);
        mapper.put('G', 2);
        mapper.put('H', 4);
        mapper.put('I', 1);
        mapper.put('J', 8);
        mapper.put('K', 5);
        mapper.put('L', 1);
        mapper.put('M', 3);
        mapper.put('N', 1);
        mapper.put('O', 1);
        mapper.put('P', 3);
        mapper.put('Q', 10);
        mapper.put('R', 1);
        mapper.put('S', 1);
        mapper.put('T', 1);
        mapper.put('U', 1);
        mapper.put('V', 4);
        mapper.put('W', 4);
        mapper.put('X', 8);
        mapper.put('Y', 4);
        mapper.put('Z', 10);
    }

    int getScore() {
        return score;
    }

}
