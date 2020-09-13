package com.example.techacademy_homework2

abstract class Animal {
    var name:String
    var age:Int


    //コンストラクタ
    constructor(name:String,age:Int){
        this.name=name
        this.age=age
    }

    abstract fun say()

}