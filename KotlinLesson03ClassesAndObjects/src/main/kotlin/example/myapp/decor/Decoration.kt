package example.myapp.decor

data class Decoration(val rocks :String){}


fun makeDecorations(){
    val decoration1 = Decoration(rocks = "granite")
    println(decoration1)

    val decoration2 = Decoration(rocks = "slate")
    println(decoration2)

    val decoration3 = Decoration(rocks = "slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration2.equals(decoration3))


    println(decoration1 == decoration2)
    println(decoration2 == decoration3)

    println(decoration1=== decoration2)
    println(decoration2=== decoration3)
}

fun main (args : Array<String>){
    makeDecorations()
}


data class Decoration2(val rocks: String, val wood: String, val diver: String)


fun makeDecorations2() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}
