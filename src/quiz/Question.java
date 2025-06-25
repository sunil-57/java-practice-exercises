package quiz;

public class Question {
    private String title;
    private int  option_1;
    private int  option_2;
    private int  option_3;
    private int  option_4;
    private int  correct_answer;

    public Question(String title, int option_1, int option_2, int option_3, int option_4, int correct_answer) {
        this.title = title;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.option_4 = option_4;
        this.correct_answer = correct_answer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getOption_1() {
        return option_1;
    }

    public void setOption_1(int option_1) {
        this.option_1 = option_1;
    }

    public int getOption_2() {
        return option_2;
    }

    public void setOption_2(int option_2) {
        this.option_2 = option_2;
    }

    public int getOption_3() {
        return option_3;
    }

    public void setOption_3(int option_3) {
        this.option_3 = option_3;
    }

    public int getOption_4() {
        return option_4;
    }

    public void setOption_4(int option_4) {
        this.option_4 = option_4;
    }

    public int getCorrect_answer() {
        return correct_answer;
    }

    public void setCorrect_answer(int correct_answer) {
        this.correct_answer = correct_answer;
    }

    public boolean checkAnswer(int answer){
        if(answer == this.correct_answer){
            return true;
        }
        return false;
    }
}
