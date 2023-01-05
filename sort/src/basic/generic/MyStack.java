package basic.generic;

import java.util.Arrays;
import java.util.Objects;

public class MyStack {
    private int size;
    private int top;
    private int[] arr;
    public MyStack(int i) {
        arr = new int[i];
    }
    public MyStack() {
        arr = new int[10];
    }

    public void push(int num) {
        if (size >= arr.length) {
            int[] tmp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                tmp[i] = arr[i];
            }
            arr = tmp;
        }
        arr[size++] = num;
    }

    public int pop() {
        if (size <= 0) {
            return -1;
        }
        size--;
        return arr[size];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStack myStack = (MyStack) o;
        return size == myStack.size && top == myStack.top && Arrays.equals(arr, myStack.arr);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size, top);
        result = 31 * result + Arrays.hashCode(arr);
        return result;
    }
}
