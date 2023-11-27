package com.example.secondassignment_lecture4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.style.TtsSpan.DigitsBuilder
import android.view.View
import android.widget.EditText
import androidx.annotation.VisibleForTesting

class MainActivity : AppCompatActivity() {

    lateinit var textInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textInput = findViewById(R.id.textInput)
    }

    fun buttonClick(view: View){
        println(textInput.text)
    }
}


//ვიზუალურ კომპონენტში უნდა შეიყვანოთ რიცხევბი [1,1000].
// ღილაკზე დაჭერის შემდეგ გამოიძახეთ ფუნქცია რომელმაც უნდა დააბრუნოს ინპუთში შეყვანილი რიცხვის შესაბამისი ქართული ტექსტი.
// მაგალითად შემოვიდა 527 უნდა დაბრუნდეს ხუთასოცდაშვიდი. მიღებული შედეგი გამოაჩინეთ TextView-ში
//unda gadamowmdes ramdennishnaa ricxvi
//pirvel ricxvs marttivad mienichneba
// kai, enum-ebshi shemidzlia chavwero samnishna, ornishna, ertnishnebis gansazgvreba
// aseve shemidzli chavwero
//kai shemidzlia forshi chavwero ro 1-dan 100mde single iyos, araaaa
//arrayebshi ro chavwero 1-10mde rigcxvebi da 10-dan 20mde da magit shevcvalo

fun main(){
//    var number = readln().toInt()
//    checkDigit()
    var number: Int
    convertToText()
    val firstTwenty = arrayListOf<String>(
        "ერთი", "ორი", "სამი", "ოთხი", "ხუთი",
        "ქვსი", "შვიდი", "რვა", "ცხრა", "ათი",
        "თერთმეტი", "თორმეტი", "ცამეტი", "თოთხმეტი", "თხუთმეტი",
        "თექვსმეტი", "ჩვიდმეტი", "თვრამეტი", "ცხრამეტი"
    )
    var tens = arrayListOf<String>(
        "", "ოცი", "ოცდაათი", "ორმოცი", "ორმოცდაათი",
        "სამოცი", "სამოცდაათი", "ოთხმოცი", "ოთხმოცდაათი"
    )

    val unitDigits = number %= 10
}

fun convertToText(number: Int): String{
    if (Number < 1 || Number > 1000){
        return "გაცდი საზღვრებს, მეგობარო"
    }
}
//
//
//interface getDigitsNumber{
//    fun getNumber(): Int
//
//}
//
//enum class NumOfDig: getDigitsNumber{
//    SingleDigit {
//        override fun getNumber() = 1
//        },
//    DoubleDigit {
//        override fun getNumber() = 2
//    },
//    TripleDigit {
//        override fun getNumber() = 3
//    }
//}
//
//

//var firstTwenty: Arraylist<String>[
//"one" "two" "three" "four"
//]

//}
//
//fun checkDigit(number: Int){
//    override fun checkDigits() = 1
//}
//
//enum class getDigit(){
//    SingleDigit(
//
//    ),
//    DoubleDigit(),
//    TripleDigit()
//}
//
//interface getSize {
//    var number: String
//    fun getSize() = number.length
//}
//
//
//
//enum class SingleDigit (){
//    Hundred{
//        override fun getSize() = 1
//    },
//    TwoHundred(2),
//    Three(3),
//}