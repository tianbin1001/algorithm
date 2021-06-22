package com.chengxuyuan.book;

import java.util.Stack;

/**
 * 设计一个有getMin功能的栈
 */
public class Stack01 {

    private Stack<Integer> stackData;

    private Stack<Integer> stackMin;

    public Stack01(){
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }


    public void push(Integer newNum){

        if(stackMin.empty()){
            stackMin.push(newNum);
        }else if(newNum  <= getMin()){
            stackMin.push(newNum);
        }
        stackData.push(newNum);
    }

   public Integer pop(){

       if(stackData.isEmpty()){
           throw  new RuntimeException("stackMin is empty");
       }

       int value = stackData.pop();
       if(value == getMin()){
          stackMin.pop();
       }
       return value;
   }






    public Integer getMin(){

        if(stackMin.isEmpty()){
            throw  new RuntimeException("stackMin is empty");
        }
        return stackMin.peek();
    }




}
