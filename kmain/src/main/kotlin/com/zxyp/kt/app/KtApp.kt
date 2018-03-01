package com.zxyp.kt.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KtApp

fun main(args : Array<String>){
    SpringApplication.run(KtApp::class.java,*args)

}