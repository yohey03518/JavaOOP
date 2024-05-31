package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> list;
    private List<ActionType> action;

    public Calculator() {
        list = new ArrayList<Double>();
        action = new ArrayList<ActionType>();
    }

    public void Add(int num) {
        double numDouble = (double) num;
        this.Add(numDouble);
    }

    public void Add(float num) {
        double numDouble = (double) num;
        this.Add(numDouble);
    }

    public void Add(double num) {
        list.add(num);
        action.add(ActionType.ADD);
    }

    public void Multiply(int num) {
        double numDouble = (double) num;
        this.Multiply(numDouble);
    }

    public void Multiply(float num) {
        double numDouble = (double) num;
        this.Multiply(numDouble);
    }

    public void Multiply(double num) {
        list.add(num);
        action.add(ActionType.MULTIPLY);
    }

    public void Clean() {
        list.clear();
        action.clear();
    }

    public double GetResult() {
        double result = 0;
        if (!list.isEmpty()) {
            for (int i = 0; i <= list.size() - 1; i++) {
                if (action.get(i) == ActionType.ADD) {
                    result += list.get(i);
                } else if (action.get(i) == ActionType.MULTIPLY) {
                    result *= list.get(i);
                }
            }
        }
        return result;
    }
}
