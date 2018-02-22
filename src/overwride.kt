/**用户基类**/
open class P{
    open fun study(){       // 允许子类重写
        println("我毕业了")
    }
}

/**子类继承 Person 类**/
class Stu : P() {

    override fun study(){    // 重写方法
        println("我在读大学")
    }
}

fun main(args: Array<String>) {
    val s =  Stu()
    s.study();

}