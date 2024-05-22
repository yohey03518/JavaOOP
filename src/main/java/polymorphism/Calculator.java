package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> list;
    private List<Integer> action;

    public Calculator() {
        list = new ArrayList<Double>();
        action = new ArrayList<Integer>();
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
        action.add(1);
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
        action.add(2);
    }

    public void Clean() {
        list.clear();
        action.clear();
    }

    public double GetResult() {
        double result = 0;
        if (list.size() > 0) {
            for (int i = 0; i <= list.size() - 1; i++) {
                if (action.get(i) == 1) {
                    result += list.get(i);
                } else if (action.get(i) == 2) {
                    result *= list.get(i);
                }
            }
        }
        return result;
    }
}
