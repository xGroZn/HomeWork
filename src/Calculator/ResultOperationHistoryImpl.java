package Calculator;

import java.util.Arrays;

public class ResultOperationHistoryImpl implements ResultOperationHistory{

    private double[] history = new double[5];
    private int index = 0;

    @Override
    public void addResultToHistory(double result) {
        if (index == history.length) {
            index = 0;
        }
        history[index] = result;
        index++;
    }

    @Override
    public void printOperationsHistory() {
        System.out.println(Arrays.toString(history));
    }
}
