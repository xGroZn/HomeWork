package Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ResultOperationHistoryByHashMap {

    private HashMap<String, List<Double>> historyHashMap = new HashMap<>();

    public void addResultToHistory(String operationType, LinkedList historyArrayList) {
        historyHashMap.put(operationType, historyArrayList);
    }

    public void printOperationsHistory() {
        System.out.println(historyHashMap.entrySet());
    }

    public HashMap<String, List<Double>> getHistoryHashMap() {
        return historyHashMap;
    }

    public void setHistoryHashMap(HashMap<String, List<Double>> historyHashMap) {
        this.historyHashMap = historyHashMap;
    }
}