import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String select[] = new String[5];
    public QuestionService() {
        questions [0] = new Questions(1, "first", "ans1", "ans2","ans3", "ans4", "ans2");
        questions [1] = new Questions(2, "second", "ans1", "ans2","ans3", "ans4", "ans2");
        questions [2] = new Questions(3, "third", "ans1", "ans2","ans3", "ans4", "ans2");
        questions [3] = new Questions(4, "fourth", "ans1", "ans2","ans3", "ans4", "ans2");
        questions [4] = new Questions(5, "fifth", "ans1", "ans2","ans3", "ans4", "ans2");
    }
    public void displayQuestions() {
        int i=0;
        for(Questions q : questions) {
            System.out.println("Qs No : " + q.getId());
            System.out.println("Qs: " + q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            select[i] = sc.nextLine();
            i++;

        }
        for(String s: select) {
            System.out.println(s);
        }
    }
    public void printScore() {
        int score = 0;
        for(int i =0; i<questions.length;i++){
            Questions qu = questions[i];
            String ans = qu.getAnswer();
            String userAnswer = select[i];
            if(ans.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your Score is : " + score);
    }
}
 