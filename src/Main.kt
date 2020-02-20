import java.util.ArrayList


fun main() {
    val father = Father("John", 43, Sex.Male, "Team leader in IT company", hasFamily = true)
    val son = Son("Mike", 17, Sex.Male, "Studying at MIT", hasFamily = false)
    val mother = Mother("Cindy", 41, Sex.Female, "My hobby is photography", whiteHair = true)
    val daughter = Daughter("Kate", 23, Sex.Female, "My hobby is Instagram", whiteHair = true)
    father.say()
    mother.say()
    son.say()
    daughter.say()

    val list = arrayListOf<Human>(father, mother, son, daughter)
    list.sortBy {
        it.age
    }
    list.reverse()
    list.forEach {
        println("${it.name} ${it.age} ")
    }


}





