package chapter7;

class Calc {
    private int oddSum;
    private int evenSum;
    private int totalSum;

    public Calc() {
        oddSum = 0;
        evenSum = 0;
        totalSum = 0;
    }

    public int getOddSum() {
        return oddSum;
    }

    public int getEvenSum() {
        return evenSum;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void calcSum() {
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
            totalSum = totalSum + i;
        }
    }
}

public class Sum_2 {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        calculator.calcSum();

        System.out.println("홀수 합 : " + calculator.getOddSum());
        System.out.println("짝수 합 : " + calculator.getEvenSum());
        System.out.println("전체 합 : " + calculator.getTotalSum());
    }
}
