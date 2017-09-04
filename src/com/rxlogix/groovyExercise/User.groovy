package com.rxlogix.groovyExercise

class User {

    String userName

    String greet(String userName){
        "Hello, ${userName}"
    }

    String greetWithDefaultValue(msg="Hiiii"){
        "$msg, ${userName}"
    }

    static void main(String[] args) {

        User user = new User()
        user.userName = "sargam"

        println("UserName: "+user.userName)
        println("Greeting msg: "+user.greet(user.userName))
        println("Greeting msg with default values: "+user.greetWithDefaultValue())
    }
}
