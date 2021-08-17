package com.chethan.datastructures.stacks.problems;

import java.util.Arrays;
import java.util.Stack;

/**
 * Maximum rectangular Area : Histogram
 * Stack will always store input arr indices
 */
public class HistogramArea {
    public static void main(String[] args) {
        int[] arr = {2,1,1,1};
        System.out.printf("Max area in array %s %d", Arrays.toString(arr), getMaxArea(arr));
        }

    public static int getMaxArea(int[] input){
        Stack<Integer> stack = new Stack<>();
        int area;
        int maxarea = 0;
        int i=0;
        for(; i< input.length;){
            if(stack.empty() || input[stack.peek()] <= input[i]){
                stack.push(i++);
            }else {
                int top = stack.pop();
                if(stack.empty()){
                    area = input[top] * i;
                }else {
                    area = input[top] * (i - stack.peek() - 1);
                }

                if (maxarea < area) {
                    maxarea = area;
                }
            }
        }

        while(!stack.empty()){
            int top = stack.pop();
            if(stack.empty()){
                area = input[top] * i;
            }else {
                area = input[top] * (i - stack.peek() - 1);
            }

            if (maxarea < area) {
                maxarea = area;
            }
        }

        return maxarea;
    }
}
