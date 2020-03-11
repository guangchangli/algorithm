package com.aladdin.recursion;

/**
 * 走台阶 一次可以走1级 也可以走两级
 * @author lgc
 **/
public class Steps {
    static int solution(int n){
        if (n<=0){
            return 0;
        }
        if (n==1){return 1;}
        if (n==2){return 2;}
        return solution(n-1)+solution(n-2);
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
