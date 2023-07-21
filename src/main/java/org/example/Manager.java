package org.example;

import java.util.List;
import java.util.Objects;

public class Manager extends Worker implements SalaryRise{
    public Manager(String name, int age, int salary, String phone) {
        super(name, age, salary, phone);
    }


    @Override
    public void salaryRise(List<Worker> a, Worker e, int cash) {
        for (Worker s : a)
        {
            if (s instanceof Employee && Objects.equals(s.getName(), e.getName()))
            {
                e.setSalary(e.getSalary() + cash);
            }
            else System.out.println("Данное действие невозможно.");

        }

    }

    @Override
    public void salaryRise(List<Worker> a, int cash) {
        for (Worker s : a)
        {
            if (s instanceof Employee)
            {
                s.setSalary(s.getSalary() + cash);
            }
            else System.out.println("Данное действие невозможно.");

        }

    }

}
