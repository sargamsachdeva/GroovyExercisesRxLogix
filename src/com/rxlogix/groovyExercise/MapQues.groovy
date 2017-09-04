package com.rxlogix.groovyExercise

class MapQues {

    static void main(String[] args) {

        Map map = [1:'sargam',2:'abc',3:'grails',4:'sachdeva']

       List list = map.collectEntries {
            it
        }

        println(list)
    }
}
