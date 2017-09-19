import java.util.*

fun main(args: Array<String>) {
    var person = Person("Anton", 15)
    person.shout("Oii")

    var map = HashMap<Int, String>()
    map.put(1, "Glend Maatita")
    map.put(2, "Gufron Efendy")

//    val co = "String"
//    co = "Hello"


    var num = 4
    when(num) {
        0 -> println("Num is zero")
        1 -> println("Num is one")
        2 -> println("Num is two")
        3 -> {
            println("Num is three")
        }
        else -> {
            println("Num is undefined")
        }
    }

//     var str : String = null
    var bigger = printBigger(6, 7)
}

// if as expressions
fun printBigger(a: Int, b: Int) = if (a > b) a else b

fun printMin(a: Int, b: Int) = if (a < b) {
    a
} else {
    b
}
// end if

// constructor
class Aku constructor(firstName: String)
{
    var age = 0
    constructor(firstName: String, age: Int) : this(firstName)
    {
        this.age = age
    }

    init {
        println(firstName)
        println(age)
    }

    fun other()
    {
//        println(firstName)
    }
}
// end of constructor

// visibility modifiers & inheritance
class Subclass : Outer()
{
    override val c = 1;
}

open class Outer
{
    private val a = 1;
    protected open val b = 2
    internal open val c = 3
    val d = 4
}
//end of inheritance

// abstract
class Me constructor(name: String) : Human(name)
{
    val myName = name

    override fun getName() : String {
        return this.myName
    }
}

abstract class Human constructor(name: String)
{
    abstract fun getName() : String
}
// end of abstract

// Interface
class Child : MyInterface {
    override val prop: Int = 20
    override fun bar() {
        println("Override")
    }
}

interface MyInterface {
    val prop: Int

    fun foo() {
        println(prop)
    }

    fun bar()
}
// end of interface

// object as singleton
//Bookshelf.books.add(Book("Java", 4000))
//Bookshelf.books.add(Book("Kotlin", 5000))
//Bookshelf.books.add(Book("C++", 6000))

class Book constructor(title: String, price: Int)
{
    var title = title
    var price = price
    fun show()
    {
        println("The $title costs $price")
    }
}

object Bookshelf
{
    var books = arrayListOf<Book>()

    fun showlist()
    {
        for (book in books)
        {
            book.show()
        }
    }
}
// end of object

// Generic Type
class Box<T> (t: T) {
    var value = t

    fun printT()
    {
        println(value)
    }
}
// end of generic

// class extensions
fun Person.shout(word: String)
{
    println(word)
}
// end of class extensions

// data class
// add copy(), formatted toString() User(name=name, age=age)
data class User(val name: String, val age: Int)
// end of data class

// lambda
//val numbers = listOf(1, 34, 53, 21)
//println(numbers.filter { it % 2 == 0 })
//val doubled = numbers.map { x -> x * 2 }
// end of lambda

