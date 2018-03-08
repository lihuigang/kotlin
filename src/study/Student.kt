package study

open class Person_1(var name : String, var age : Int){
}

class Student_1(name : String, age : Int, var no : String, var score : Int): Person_1(name,age){
}

// 测试
fun main(args: Array<String>) {
    val s = Student_1("Runoob", 18, "S12346", 89)
    println("学生名： ${s.name}")
    println("年龄： ${s.age}")
    println("学生号： ${s.no}")
    println("成绩： ${s.score}")
}