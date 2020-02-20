open class Mother(name: String, age: Int, sex: Sex) : Woman(name, age, sex) {
    var whiteHair: Boolean? = null

    constructor(name: String, age: Int, sex: Sex, hobby: String) : this(name, age, sex) {
        this.hobby = hobby
    }

    constructor(name: String, age: Int, sex: Sex, hobby: String, whiteHair: Boolean) : this(name, age, sex, hobby) {
        this.whiteHair = whiteHair
    }

    override fun say() {
        println("Hello, my name is $name,I'm $age years old, $sex. $hobby,$whiteHair")

    }
}