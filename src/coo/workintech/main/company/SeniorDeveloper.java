package coo.workintech.main.company;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(10000);
        System.out.println(getName()+"Seniordeveloper begins to work");
    }
}
