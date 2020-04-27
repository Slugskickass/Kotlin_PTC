// lamdas



fun main(){
    var printer: (Int, String) -> Unit
    printer = {a: Int, b: String -> Unit
        for (time in 0 until a){
        print(b)}
    }

printer(10, "Test")
}
