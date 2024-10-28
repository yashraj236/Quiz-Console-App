public class QuestionService {
  Question[] questions = new Question[5];
  
  public QuestionService()
  {
    questions[0] = new Question();
  }

  public void displayQuestions()
  {
    System.out.println(questions[0].getQuestion());
  }
}
