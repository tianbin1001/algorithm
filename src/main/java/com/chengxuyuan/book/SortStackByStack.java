package com.chengxuyuan.book;


import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 */
public class SortStackByStack {


    public static void sortStackByStack(Stack<Integer> values){

        Stack<Integer> help = new Stack<>();
        while (!values.isEmpty()){

            int cur = values.pop();
            while (!help.isEmpty() && help.peek() < cur){
                values.push(help.pop());
            }

            help.push(cur);
        }

        while (!help.isEmpty()){
            values.push(help.pop());
        }
    }






}
