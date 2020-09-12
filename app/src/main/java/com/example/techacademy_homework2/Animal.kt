package com.example.techacademy_homework2

abstract class Animal {
    var name:String
    var age:Int
    var hobby:String

    //コンストラクタ
    constructor(name:String,age:Int,hobby:String){
        this.name=name
        this.age=age
        this.hobby=hobby
    }

    abstract fun say()

}