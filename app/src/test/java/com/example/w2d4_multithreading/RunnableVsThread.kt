package com.example.w2d4_multithreading

// Extending the Thread class to implement threads.
class SimpleThread: Thread() {
    override fun run() {
        println("${Thread.currentThread()} has run.")
    }
}
// Implementing the Runnable interface to implement threads.
class SimpleRunnable: Runnable {
    override fun run() {
        println("${Thread.currentThread()} has run.")
    }
}
fun main() {
    val thread = SimpleThread()
    thread.start() // Will output: Thread[Thread-0,5,main] has run.
    val runnable = SimpleRunnable()
    val thread1 = Thread(runnable)
    thread1.start() // Will output: Thread[Thread-1,5,main] has run
}