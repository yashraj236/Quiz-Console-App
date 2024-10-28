import java.util.Scanner;

public class QuestionService 
{

    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void displayQuestions()
    {
        int i=0;
        for(Question q : questions)
        {
            System.err.println("Question no. " + q.getId());
            System.err.println("Actual Question " + q.getQuestion());
            System.err.println(q.getOpt1());
            System.err.println(q.getOpt2());
            System.err.println(q.getOpt3());
            System.err.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
            
        for(String s : selection)
        {
            System.err.println(s);
        }
    }
}
