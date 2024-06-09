package com.example.myapp1.kotlinegs

import com.example.myapp1.kotlinexs.Employee
import com.example.myapp1.kotlinexs.student

fun main() {
    println("hello world")
    var myStudent: student = student("gaudam",20,"vellore")
    println("name is "+ myStudent.name)
    myStudent.name = "vaibav"
    println("name changed to "+ myStudent.name)

    var myEmployee: Employee = Employee("viswa",21,"chennai")
    println("employee name is "+ myEmployee.name)


}