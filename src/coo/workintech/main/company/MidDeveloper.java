package coo.workintech.main.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(7000);
        System.out.println(getName()+"Middeveloper begins to work");
    }
}
