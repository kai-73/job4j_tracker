package ru.job4j.tracker;
/**
 * Вариант с проверкой ввода символо от 0 до 9.
 * В окончательный вариант другого файл вошло без этой проверки, так исключение NumberFormatException
 * яв-ся наследником RuntimeException. В своем коде мы не должны обрабатывать исключения,
 * которые являются наследниками RuntimeException
 */
public class ValidateInputOld1 implements Input {

    private final Output out;
    private final Input in;

    public ValidateInputOld1(Output out, Input in) {
        this.out = out;
        this.in = in;
    }

    @Override
    public String askStr(String question) {
        return in.askStr(question);
    }

    @Override
    public int askInt(String question) {
        boolean invalid = true;
        int value = -1;
        do {
            String rsl = in.askStr(question);
            if (!isNumber(rsl)) {
                out.println("Please enter validate data again.");
                continue;
            }
            value = Integer.parseInt(rsl);
            invalid = false;
        } while (invalid);
        return value;
    }

    private boolean isNumber(String value) {
        boolean rsl = true;
        char[] check = value.toCharArray();
        for (char c : check) {
            if (c < 48 || c > 58) {
                return false;
            }
        }
        return true;
    }
}
