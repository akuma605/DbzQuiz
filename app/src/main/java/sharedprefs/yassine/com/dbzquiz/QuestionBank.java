package sharedprefs.yassine.com.dbzquiz;

/**
 * Created by yassine on 14-01-17.
 */

public class QuestionBank {

    private String[] mQuestions = {
            "Quel est le véritable nom de Son Goku?",
            "Quel personnage vient de namek?",
            "Qui à tué Freezer?",
            "Comment s'apelle la femme de Krilin?",
            "Qui est Cell?"
    };

    private String[][] mChoices = {
            {"Karotto", "Kakarotto", "Kabotto", "Raditz"},
            {"Freezer", "Cell", "Picolo", "Ginyu"},
            {"Son Gohan", "Krilin", "Vegeta", "Son Goku"},
            {"C16", "C17", "C18", "C19"},
            {"Un alien", "Un cyborg", "Un namek", "Un saiyan"}
    };

    private String[] mCorrectAnswer = {
            "Kakarotto",
            "Picolo",
            "Son Goku",
            "C18",
            "Un cyborg"
    };

    public String getChoices1(int i) {
        String choice0 = mChoices[i][0];
        return choice0;
    }

    public String getChoices2(int i){
        String choice1 = mChoices[i][1];
        return choice1;
    }

    public String getChoices3(int i){
        String choice2 = mChoices[i][2];
        return choice2;
    }

    public String getChoices4(int i){
        String choice3 = mChoices[i][3];
        return choice3;
    }

    public String getCorrectAnswer(int i) {
        String answer = mCorrectAnswer[i];
        return answer;
    }

    public String getQuestions(int i) {

        String question = mQuestions[i];
        return question;
    }
}
