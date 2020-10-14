class Person(
    var name: String,
    val age: Int
) {
    fun changeNameTo(name: String) {
        this.name = name
    }

    fun sumList(list: List<Int>): Int {
        return list.sum()
    }
}
