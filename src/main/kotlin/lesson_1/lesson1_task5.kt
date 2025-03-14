package lesson_1

fun main(){
    val length: Long = 40_868_600_000
    val age: Int = 27
    val partOfDay: Double = 0.075
    val seconds: Int = 6480
    val partOfYear: Double = 2.0547945205479453E-4
    val apogee: Int = 327000
    val minutes = seconds / 60
    val remainingSeconds = seconds % 60
    val hours = minutes / 60
    val remainingMinutes = minutes % 60

    println("""Гагарин провел в космасе - $hours:$remainingMinutes:$remainingSeconds""")
    println("""
        $length
        $age
        $partOfDay
        $seconds
        $partOfYear
        $apogee""" )


}