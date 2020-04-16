package com.example.w2d4_multithreading

import kotlin.concurrent.thread

fun main() {
    thread() {
        println("${Thread.currentThread()} has run.")
    }
}