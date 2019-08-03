import java.util.Scanner
fun main() {

    val reader = Scanner(System.`in`)



    val result = Array(3) { arrayOfNulls<String>(3) } // The type is `Array<Array<String?>>
    result[0][0] = "-"
    result[0][1] = "-"
    result[0][2] = "-"

    result[1][0] = "-"
    result[1][1] = "-"
    result[1][2] = "-"

    result[2][0] = "-"
    result[2][1] = "-"
    result[2][2] = "-"

    var type = 1
    var P1=1
    var P2=1

    for (i in 0..9) {

        if(type%2 == 0){
            print("ใส่ตำแหน่ง X : ")
            var num1:Int = reader.nextInt()
            var num2:Int = reader.nextInt()
            P1 = num1
            P2 = num2
        }else{
            print("ใส่ตำแหน่ง O : ")
            var num1:Int = reader.nextInt()
            var num2:Int = reader.nextInt()
            P1 = num1
            P2 = num2
        }

        if(P1 > 2 || P2 > 2 ){
            println("ใส้เลขเกินไอ้สัส")
        }else if (type%2 == 0){
            result [P1][P2] = "X"
            println(result[0][0] +" "+ result[0][1] +" "+ result[0][2])
            println(result[1][0] +" "+ result[1][1] +" "+ result[1][2])
            println(result[2][0] +" "+ result[2][1] +" "+ result[2][2])
        }else if (type%2 != 0){
            result [P1][P2] = "O"
            println(result[0][0] +" "+ result[0][1] +" "+ result[0][2])
            println(result[1][0] +" "+ result[1][1] +" "+ result[1][2])
            println(result[2][0] +" "+ result[2][1] +" "+ result[2][2])
        }

        if(result[0][0] == "X" && result[0][1] == "X" && result[0][2] == "X"){
            println("X ชนะ")
            break
        }
        if(result[1][0] == "X" && result[1][1] == "X" && result[1][2] == "X"){
            println("X ชนะ")
            break
        }
        if(result[2][0] == "X" && result[2][1] == "X" && result[2][2] == "X"){
            println("X ชนะ")
            break
        }
        if(result[0][0] == "X" && result[1][1] == "X" && result[2][2] == "X"){
            println("X ชนะ")
            break
        }
        if(result[2][0] == "X" && result[1][1] == "X" && result[0][2] == "X"){
            println("X ชนะ")
            break
        }
        if(result[0][0] == "O" && result[0][1] == "O" && result[0][2] == "O"){
            println("O ชนะ")
            break
        }
        if(result[1][0] == "O" && result[1][1] == "O" && result[1][2] == "O"){
            println("O ชนะ")
            break
        }
        if(result[2][0] == "O" && result[2][1] == "O" && result[2][2] == "O"){
            println("O ชนะ")
            break
        }
        if(result[0][0] == "O" && result[1][1] == "O" && result[2][2] == "O"){
            println("O ชนะ")
            break
        }
        if(result[2][0] == "O" && result[1][1] == "O" && result[0][2] == "O"){
            println("O ชนะ")
            break
        }

        type = i

        if(type == 8){
            print("เสมอ")
            break
        }
    }



}

