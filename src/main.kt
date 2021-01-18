fun main()
{
    var vector31 =  Vector3()
    vector31.x = readLine()!!.toInt()
    vector31.y = readLine()!!.toInt()
    vector31.z = readLine()!!.toInt()
    var vector32 =  Vector3()
    vector32.x = readLine()!!.toInt()
    vector32.y = readLine()!!.toInt()
    vector32.z = readLine()!!.toInt()
    var res = vector31.skalpr(vector32)
    println(res.x)
    println(res.y)
    println(res.z)
}

class Vector3()
{
    var x = 0
    var y = 0
    var z = 0
    fun add(vector3: Vector3) : Vector3
    {
        var result = Vector3()
        result.x = vector3.x + this.x
        result.y = vector3.y + this.y
        result.z = vector3.z + this.z
        return result
    }
    fun skalpr(vector3: Vector3) : Vector3
    {
        var result = Vector3()
        result.x = vector3.x * this.x
        result.y = vector3.y * this.y
        result.z = vector3.z * this.z
        var rrr = result.x + result.y + result.z
        return result
    }
}