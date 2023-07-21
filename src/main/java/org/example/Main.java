package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller c = new Controller();

        c.addWorker(new Manager("John", 31, 3000, "+12321514332"));
        c.addWorker(new Employee("Paula", 28, 3100, "+18656455223"));
        c.addWorker(new Employee("Erick", 25, 2300, "+145348534853"));
        c.addWorker(new Employee("Louis", 24, 1500, "+231212323241"));

        Manager m = new Manager("John", 31, 3000, "+12321514332");


        c.showWorkers();
        m.salaryRise(c.workers, 200);
        c.showWorkers();



    }
}