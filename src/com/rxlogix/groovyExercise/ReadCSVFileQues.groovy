package com.rxlogix.groovyExercise

class ReadCSVFileQues {

    static void main(String[] args) {

        new File("/home/sargam/Example.csv").splitEachLine(",") {fields ->

            def person = new Person(name: fields[0],profile: fields[1],gender: fields[2])

            println("Fields: "+fields)
            println("Name: "+person.name)
            println("Profile: "+person.profile)
            println("Gender: "+person.gender)
        }

    }
}
