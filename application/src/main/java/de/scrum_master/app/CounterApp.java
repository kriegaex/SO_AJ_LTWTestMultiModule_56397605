package de.scrum_master.app;

import spark.Spark;

import static spark.Spark.get;

public class CounterApp {
  public static void main(String[] args) {
    get("/counter", (req, res) -> {
      new MyCounter().aspectCalled();
      return "I ALREADY CALLED COUNTER ASPECT ON METHOD:MyCounter().count()";
    });
    System.out.println("Application starting on port :" + Spark.port());
  }
}
