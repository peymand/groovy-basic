package com.behsa.groovy.generic

class Stack <T>{

    T[] arr
    int index
    int size

    public Stack(int size){
        this.size = size;
        index = -1;
        arr = (T)(new Object[size])
    }

    void push(T item){
        index++;
        if(index == size)
            throw new Exception("stack is full")
        arr[index] = item
    }
    T pop(){
        if(index == -1)
            throw new Exception("stack is empty")
        else{
            int result = arr[index]
            index--
            return result
        }

    }
}

Stack<Integer> stack = new Stack<>(4)
stack.push(34)
stack.push(93)
stack.push(-4)
println stack.pop()
println stack.pop()
println stack.pop()


Stack<String> stackText = new Stack<>(3)

Li


