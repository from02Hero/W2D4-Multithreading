package com.example.w2d4_multithreading

internal class RunnableDemo(private val threadName: String) : Runnable {

    private var t: Thread? = null
    init {
        println("Creating $threadName")
    }

    override fun run() {
        println("Running $threadName")
        try {
            for (i in 4 downTo 1) {
                println("Thread: $threadName, $i")
                // Let the thread sleep for a while.
                Thread.sleep(50)
            }
        } catch (e: InterruptedException) {
            println("Thread $threadName interrupted.")
        }
        println("Thread $threadName exiting.")
    }

    fun start() {
        println("Starting $threadName")
        if (t == null) {
            t = Thread(this, threadName)
            t!!.start()
        }
    }
}

object TestThread {
    @JvmStatic
    fun main(args: Array<String>) {
        val r1 = RunnableDemo("Thread-1")
        r1.start()
        val r2 = RunnableDemo("Thread-2")
        r2.start()
    }
}