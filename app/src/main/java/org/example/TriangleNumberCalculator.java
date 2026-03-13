package org.example;
import java.util.ArrayList;

public class TriangleNumberCalculator {

    public int value(int n){
        if(n <= 0){
            System.out.println("Invalid Input, Can't have inputs lower than 1!");
            return -1;
        }
        if(n == 1){
            return 1;
        }
        return value(n - 1) + n;
    }

    int add(int n, int m){
        return value(n) + value(m);
    }

    int subtract(int n, int m){
        return value(n) - value(m);
    }

    int multiply(int n, int m){
        return value(n) * value(m);
    }

    double divide(int n, int m){
        return (double) value(n) / value(m);
    }

    ArrayList<Integer> sequence(int n){
        ArrayList<Integer> triangularNumList = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            triangularNumList.add(value(i));
        }
        return triangularNumList;
    }
}
