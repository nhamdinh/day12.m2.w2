import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap chuoi: ");

        String string = scanner.nextLine();
        System.out.println("---------------------------------");
        System.out.println(string);
        System.out.println("---------------------------------");
        // liệt kê sô lần xuất hiện của các từ trong chuỗi trên
        System.out.println("liet ke so lan xuat hien cac tu: ");
        Map<String, Integer> wordsMap = countWords(string);
        for (String keys : wordsMap.keySet()) {
            System.out.print(keys + " " + wordsMap.get(keys) + "\n");
        }
    }

    public static Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordsMap = new TreeMap<>();
        if (input == null) {
            return wordsMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                // build một từ
                sb.append(input.charAt(i));
            } else {
                // thêm từ vào wordsMap
                addWord(wordsMap, sb);
                sb = new StringBuilder();
            }
        }
        addWord(wordsMap, sb);
        return wordsMap;
    }

    public static void addWord(Map<String, Integer> wordsMap, StringBuilder sb) {
        String words = sb.toString();
        if (words.length() == 0) {
            return;
        }
        if (wordsMap.containsKey(words)) {
            int count = wordsMap.get(words) + 1;
            wordsMap.put(words, count);
        } else {
            wordsMap.put(words, 1);
        }
    }
}