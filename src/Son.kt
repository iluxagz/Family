class Son(name:String, age:Int, sex : Sex, occupation: String, hasFamily:Boolean): Father(name,age, sex, occupation, hasFamily) {
    override fun say() {
        super.say()
    }
}