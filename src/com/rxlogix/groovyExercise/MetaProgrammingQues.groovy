package com.rxlogix.groovyExercise

class MetaProgrammingQues {

    static toCamelCase( String str ){

       def res= str.split("_").collect { word ->

            word.toLowerCase().capitalize()
        }.join("")

        res[0].toLowerCase() + res[1..-1]
    }

    static void main(String[] args) {

        def string="print_number"
        String.metaClass.convertToCamelCase = { ->
            toCamelCase(delegate)
        }

        println string.convertToCamelCase()
    }
}
