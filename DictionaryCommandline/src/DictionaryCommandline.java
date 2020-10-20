import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;

public class DictionaryCommandline extends DictionaryManagement {
    public static void showAllWords() {
        Words.sort(Comparator.comparing(t -> t.word_target));
        System.out.println("No  | English           | Vietnamese ");
        for (int i = 0; i < Words.size(); i++) {
            System.out.printf("%d\t| %-12s\t\t| %s\n", i + 1,
                    Words.get(i).word_target, Words.get(i).word_explain);
        }
    }

    public static void dictionaryBasic() {
        insertFromCommandline();
        showAllWords();
    }

    public static void dictionaryAdvanced() throws IOException {
        insertFromFile();
        showAllWords();
        dictionaryLookup();
    }

    public static void dictionarySearcher(){
        Scanner s = new Scanner(System.in);
        System.out.print("Search : ");
        String str = s.nextLine();
        for (int i = 0; i < Words.size(); i++) {
            if (Words.get(i).word_target.toLowerCase().contains(str.toLowerCase())) {
                System.out.printf("%d\t| %-12s\t\t| %s\n", i + 1,
                        Words.get(i).word_target, Words.get(i).word_explain);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        do {
            System.out.println("1 - Dictionary Advanced");
            System.out.println("2 - Add New word");
            System.out.println("3 - Show Dictionary");
            System.out.println("4 - Show Dictionary From File");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.println("DictionaryAdvanced");
                    dictionaryAdvanced();
                    dictionarySearcher();
                    break;
                case 2:
                    System.out.print("AddNewWord :");
                    addNewWord();
                    break;
                case 3:
                    showAllWords();
                    break;
                case 4:
                    dictionaryExportToFile();
                    break;
            }
        } while (cont);
    }

}