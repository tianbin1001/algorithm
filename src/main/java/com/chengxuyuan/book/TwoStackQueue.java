package com.chengxuyuan.book;

import java.util.Stack;

/**
 * 由两个栈组成的队列
 */
public class TwoStackQueue {


    private Stack<Integer> stackPush;

    private Stack<Integer> stackPop;


    public TwoStackQueue(){
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }


    //push栈向pop栈倒入数据
    public void pushToPop(){

        if(stackPop.isEmpty()){
            while (!stackPush.isEmpty()){
                stackPop.push(stackPush.pop());
            }
        }
    }

    public void add(Integer newValue){

        stackPush.push(newValue);
        pushToPop();
    }


    public int poll(){

        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.pop();

    }



    public int peek(){

        if(stackPush.isEmpty() && stackPop.isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        pushToPop();
        return stackPop.peek();

    }


}
