class Note(var text: String) {
    fun setText(text: String)
    {
        this.text = text
    }
    fun getText()
    {
        println(this.text)
    }
}