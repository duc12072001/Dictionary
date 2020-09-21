import java.util.Scanner;

public class DictionaryManagement {
    static Dictionary dictionary = new Dictionary();

    public static void insertFromCommandline() {
        Scanner myScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            Word new_word = new Word();
            new_word.word_target = myScanner.nextLine();
            new_word.word_explain = myScanner.nextLine();
            dictionary.words.add(new_word);
        }
    }
}
