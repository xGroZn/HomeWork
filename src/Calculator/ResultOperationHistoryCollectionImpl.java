package Calculator;

import java.util.LinkedList;

public class ResultOperationHistoryCollectionImpl implements ResultOperationHistory{

    private LinkedList<Double> history = new LinkedList<>();

    public ResultOperationHistoryCollectionImpl() {
        this.history = history;
    }

    @Override
    public void addResultToHistory(double result) {
        history.add(result);
    }

    @Override
    public void printOperationsHistory() {
        System.out.println(history);
    }

    public LinkedList<Double> getHistory() {
        return history;
    }

    public void setHistory(LinkedList<Double> history) {
        this.history = history;
    }
}