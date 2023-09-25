package chapter5_기본자료구조;

import java.util.Scanner;

public class Recur {

    static class IntStack {

        private int[] stk; // stack 배열
        private int capacity; // stack 용량
        private int ptr; // stack 포인터

        // 생성자
        public IntStack(int maxlen) {
            ptr = 0;
            capacity = maxlen;
            try {
                stk = new int[capacity];
            } catch (OutOfMemoryError e) {
                capacity = 0;
            }
        }

        // stack 예외 - empty(비어있음)
        public class EmptyIntStackException extends RuntimeException {
            public EmptyIntStackException() {
            }
        }

        // stack 예외 - overflow(가득참)
        public class OverflowIntStackException extends RuntimeException {
            public OverflowIntStackException() {
            }
        }

        public int push(int x) {
            if (ptr >= capacity)
                throw new OverflowIntStackException();
            return stk[ptr++] = x;
        }

        // 가장 위의 데이터를 가져옴
        public int pop() {
            if (ptr <= 0)
                throw new EmptyIntStackException();
            return stk[--ptr];
        }

        public boolean isEmpty() {
            return ptr <= 0;
        }
    }

    static void recur(int n) {
        IntStack s = new IntStack(20);

        while (true) {
            if (n > 0) {
                try {
                    s.push(n);
                } catch (IntStack.OverflowIntStackException e) {
                    System.out.println("Stack is Full!!");
                }
                n = n - 1;
                continue;
            }
            if (!s.isEmpty()) {
                try {
                    n = s.pop();
                } catch (IntStack.EmptyIntStackException e) {
                    System.out.println("Stack is Empty!!");
                }
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요 : ");
        int x = sc.nextInt();
        recur(x);
    }
}
