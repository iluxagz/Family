open class Father(name: String, age: Int, sex: Sex) : Man(name, age, sex) {
    var hasFamily: Boolean? = null

    constructor(name: String, age: Int, sex: Sex, occupation: String) : this(name, age, sex){
           this.occupation = occupation
    }
    constructor(name: String, age: Int, sex: Sex, occupation: String, hasFamily: Boolean) : this(name, age, sex, occupation) {
        this.hasFamily = hasFamily
    }


    override fun say() {
        println("Hello, my name is $name,I'm $age years old, $sex. $occupation,$hasFamily")

    }
}
