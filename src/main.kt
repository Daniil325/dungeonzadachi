fun main()
{
    var vector31 =  Vector3()
    vector31.x = 3
    vector31.y = 2
    vector31.z = 4
    var vector32 =  Vector3()
    vector32.x = 5
    vector32.y = 1
    vector32.z = 7
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