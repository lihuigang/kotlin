package study

open class A {
    open var name = "kobe"
    open fun f () { print(name) }
    fun a() { print("a") }
}

interface B {
    fun f() { print("study.B") } //接口的成员变量默认是 open 的
    fun b() { print("b") }
}

class C() : A() , B {
    override var name = "james"
    override fun f() {
        super<A>.f()//调用 study.A.f()
        super<B>.f()//调用 study.B.f()
    }
}

fun main(args: Array<String>) {
    val c = C()
    c.f();

}