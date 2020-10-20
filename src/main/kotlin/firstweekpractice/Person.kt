package firstweekpractice

class Person(
    var name: String,
    val age: Int,
) {
    fun changeNameTo(newName: String) {
        this.name = newName
    }

    fun sumList(list: List<Int>): Int {
        return list.sum()
        // var sum = 0
        // repeat(list.size){
        //     sum += list[it]
        // }
        // for(i in list){
        //     sum += i
        // }
        // return sum
    }
}
