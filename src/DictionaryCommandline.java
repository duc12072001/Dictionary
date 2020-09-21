public class DictionaryCommandline{
    DictionaryManagement management = new DictionaryManagement();
    public void showAllWord() {
        System.out.println("No\t| English\t\t\t| Vietnamese");
        for (int i = 0; i < management.dictionary.words.size(); i++) {
            System.out.printf("%d\t| %-18s| %s\n",
                    i + 1,
                    management.dictionary.words.get(i).word_target,
                    management.dictionary.words.get(i).word_explain);
        }
    }

    public void dictionaryBasic() {
        DictionaryManagement.insertFromCommandline();
        showAllWord();
    }

    public static void main(String[] args) {
        DictionaryCommandline a = new DictionaryCommandline();
        a.dictionaryBasic();
    }
}