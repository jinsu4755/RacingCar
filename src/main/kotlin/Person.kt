class Person(
    var name: String,
    val age: Int,
) {
    fun changeNameTo(newName: String) {
        this.name = newName
    }

    fun sumList(list: List<Int>): Int {
        return list.sum()
    }
}