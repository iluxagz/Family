class Daughter(name: String, age: Int, sex: Sex, hobby: String, whiteHair: Boolean) : Mother(name, age, sex, hobby, whiteHair) {
    override fun say() {
        super.say()
    }
}