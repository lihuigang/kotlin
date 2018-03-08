package study

fun buildString(b: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    b(sb)
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}