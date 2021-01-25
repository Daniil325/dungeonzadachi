fun main()
{
    var ss =  Praymoygolnik()
    ss.a = readLine()!!.toInt()
    ss.b = readLine()!!.toInt()

    println(ss.Perimetr(ss.a, ss.b))
    println(ss.Ploshad(ss.a, ss.b))
}

open class Pair(){
    open var a = 0
    open var b = 0

    constructor(x: Int, y: Int):this()
    {
        a = x
        b = y
    }

    open fun Mylt(a: Int, b: Int): Int{
        return a*b
    }
}

class Praymoygolnik: Pair(){
    fun Perimetr(a: Int, b: Int): Int{
        return 2*(a+b)
    }

    fun Ploshad(a: Int, b: Int): Int{
        return a*b
    }

    override fun Mylt(a: Int, b: Int): Int {
        return super.Mylt(a, b)
    }
}