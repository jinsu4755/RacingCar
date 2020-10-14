class Person(
    var name: String,
    val age: Int,
) {
    fun changeNameTo(newName: String) {
        this.name = newName
    }

    /* fun sumList(): Int {
        return 9 // 빠른 패스를 위한 코드
    }*/

    /* fun sumList(list:List<Int>): Int{
        // 리펙토링을 한다.
        var sum  =0
        for (i in list) {
            sum += i
        }
        return sum
    }*/

    // for대신 repeat를 사용해보자

    /*fun sumList(list:List<Int>): Int{
        //리펙토링을 한다.
        var sum  =0

        repeat(list.size){
            sum += it
        }

        return sum
    }*/

    fun sumList(list: List<Int>): Int {

        return list.sum()
    }
}
