package coo.workintech.main.company;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id,String name){
        super(id,name);
    }

    @Override
    public void work() {
        setSalary(20000);
        System.out.println(getName()+"Junior begins to work");
    }
    public void work(double salary) {
        setSalary(salary);
        System.out.println(getName() + " junior developer begins to work.");
    }

}
