package ru.job4j.tracker;

public class  StubInput implements Input  {

    private final String[] answers;
    private int position = 0;

    public StubInput(String[] answer) {
        answers = answer;
    }

    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }

}
