package com.behsa.groovy.multithreading

import java.util.concurrent.BlockingQueue
import java.util.concurrent.LinkedBlockingQueue

Thread.start { -> println 'dummy'}
Thread.start("T3") { -> println "${Thread.currentThread().name}"}

//BlockingQueue sharedQueue = [] as LinkedBlockingQueue
def sharedQueue = []
Thread.start('push') {

    10.times {
        try{
            println "${Thread.currentThread().name}: ${it} "
          sharedQueue << it
            sleep 100
        }catch(InterruptedException e){

        }
    }
}

Thread.start('pop') {
    for (i in 0..9){
        sleep 200
        println "${Thread.currentThread().name} : ${sharedQueue[i]} "
    }
}

