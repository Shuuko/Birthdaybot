package me.stylite.kuu

import kaoru.Uta

import java.io.FileInputStream
import java.util.Properties
import java.util.concurrent._

object Kuu extends App {
  val prop: Properties = new Properties()
  prop.load(new FileInputStream("config.properties"))

  val uta = new Uta(prop.getProperty("webhook"))

  val ex = new ScheduledThreadPoolExecutor(1)
  val task = new Runnable {
    def run() = uta.send("Happy birthday <@551644347527987222>")
  }
  val f = ex.scheduleAtFixedRate(task, 1, 30, TimeUnit.SECONDS)

}
