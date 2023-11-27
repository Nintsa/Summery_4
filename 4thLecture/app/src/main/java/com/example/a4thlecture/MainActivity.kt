package com.example.a4thlecture
L
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun main(){
        var string: String = ""
        string += "kninca"
        println ("magaria $string")
    }
    //interface to interfaces uketebs implementacias araa sachiro override magram tu qmni meore interfacese shvilobils, mashiin mand yvela zedas override unda qna

// gmerto, gadmomxede
//
//    fun main(args: Array<String>){
//        val person1: Person = Person()
//        val person2: Person = Person()
//
//        println(person1 === person2) //sxvadasxva misamartebi roa == ar imushavebs da tu ===, mashin trues daabrunebs
//        //== dardeba obieqtebi, === dardeba memoryshi erti da igive adgili aqvs tu ara
//
//    }
//
//    class Person{
//        val firstName: String = "Jemali"
//    }

//fun main(args: Array<String>){
//    sum(variable1 = 20, variable2 = 20)
//
//}
//    fun sum(variable1: Any, variable2: Any): Any{
//        if(variable1 is String || variable2 is String){ //string klasia
//            return variable1.toString().plus(variable2)
//
//            else  if (variable1 is Int && variable2 is Int)
//                return variable1 + variable2
//            else if (variable1 is Double || variable2 is Double)
//                return variable2 + variable1
//        }
//        variable1 + variable2
//    }

//    fun sum(variable1: Any, variable2: Any): Any {
//        is (variable1 is String || variable2 is String){
//            return variable1.toString().plus(variable2)
//        }
//        else (variable1 is Number && variable2 is Number){
//            return variable1.toString().toDouble() + variable2.toString().toDouble()
//        } //ase iwereba mokled da martivad
//
//    }

}




//    fun main(args: ArrayList<String>){
//        val person = Person()
//        person.speak()
//    }
//    interface Parent {
//        val firstName: String
//        fun run()
//        fun speak(){
//            println("Parens Speak Fun") // jer amas idzaxebs da mere overrides
//        }
//    }
//
//
//    class Person():Parent {
//        override val firstName: String = "" //implementacia gavaketet zedadan imitoro zeviT ar iyo implementirebuli
//        override fun run(){
//            println("override run fun") // aqac aucileblad unda iyos implementirebuli
//        }
//
//        override fun speack() { //zevit ki aris gawerili, magram aqac shegvidzlia gawera
//            super.speak() //super nishnavs/miutitebs ro is aris mshobeli
//            println("")
//        }
//    }
//
//    open class Parent{ //klacebs shoris tu aris interihance mashin aucilebelia ro open eweros klass win, interfaceze araa aucilebeli
//        open val firstName: String = "" // esec open unda iyos ro wamoigos shvilshi
//        fun speak(){
//            println("parent speak fun")
//        }
//
//        open fun speak(){
//            println()
//        }
//    }

//tu sami taoba gvaqvs da parents ar gaachnia override, mashin child-is super pirdapir gadawvdeba people-s


