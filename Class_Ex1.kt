class Person__ (name : String ){
    var name = "";
    init {
        this.name = name;
    }
}

fun main_(args: Array<String>) {
    var a = Person__("abc");
}
class Person_ (name : String ){
    var name = name;
}

fun main(args: Array<String>) {
    var a = Person_("abcd");
}