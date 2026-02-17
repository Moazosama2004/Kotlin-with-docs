package example.myapp


interface FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Shark(var fishColor: FishColor = GoldColor): FishAction, FishColor by GoldColor  {
    override fun eat() {
        println("color is : ${this.fishColor.color}")
        println("hunt and eat fish")
    }

}


class Plecostomus (fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor

{

}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}



object GoldColor : FishColor {
    override val color = "gold"
}




