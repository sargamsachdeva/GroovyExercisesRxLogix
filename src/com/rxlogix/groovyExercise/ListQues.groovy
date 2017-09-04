package com.rxlogix.groovyExercise

class ListQues {

    static void main(String[] args) {

        List list = ["aaaa","bb","sargam","ddd",true,2,7]
       println list.findAll(){
            it instanceof java.lang.String
        }

        println list.findAll(){
            it instanceof java.lang.String && it.length() > 3
        }
    }
}
