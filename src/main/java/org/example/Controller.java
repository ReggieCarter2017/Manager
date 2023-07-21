package org.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Worker> workers = new ArrayList<>();

    public void showWorkers()
    {
        for (Worker e : workers)
        {
            System.out.printf("Name: %s\nAge: %s\nPhone: %s\nPosition: %s\nSalary: %s", e.getName(), e.getAge(),
                    e.getPhone(), e.getClass().getSimpleName(), e.getSalary());
            System.out.println("\n——————————————————————————");
        }
    }

    public void addWorker(Worker e)
    {
        workers.add(e);
    }
}
