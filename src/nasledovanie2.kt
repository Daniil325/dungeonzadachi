fun main(){
    var v = RightAngled()
    v.a = readLine()!!.toDouble()
    v.b = readLine()!!.toDouble()
    v.c = readLine()!!.toDouble()

    println(v.Ploshad(v.a, v.b))
    println(v.Inf(v.a, v.b, v.c))
    println(v.Perimetr(v.a, v.b, v.c))
}

open class Triangle(){
    open var a = 0.0
    open var b = 0.0
    open var c = 0.0

    open fun Inf(a: Double, b: Double, c: Double): String{
        return "a = " + "$a" + " b = " + "$b" +" c = " + "$c"
    }

    fun Perimetr(a: Double, b: Double, c: Double): Double{
        return a+b+c
    }
}

class RightAngled: Triangle(){
    fun Ploshad(a: Double, b: Double): Double {
        return (a * b) / 2
    }
}
