package my_quiz;

// base abstract class question with common fields across classes
public abstract class Question {
    String questions;
    String answers;
    String userInput;


    public Question() {

    }

    public Question(String questions, String answers, String userInput) {
        this.questions = questions;
        this.answers = answers;
        this.userInput = userInput;

    }

        public String getQuestions() {
            return questions;
        }

        public void setQuestions(String questions) {
            this.questions = questions;
        }

        public String getAnswers() {
            return answers;
        }

        public void setAnswers(String answers) {
            this.answers = answers;
        }

        public String getUserInput() {
            return userInput;
        }

        public void setUserInput(String userInput) {
            this.userInput = userInput;
        }

        public abstract Boolean isTheAnswerCorrect();
}


