
package coo.workintech.main.company;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniors;
    private SeniorDeveloper[] seniors;
    private MidDeveloper[] mids;

    public HRManager(long id, String name, JuniorDeveloper[] juniors, SeniorDeveloper[] seniors, MidDeveloper[] mids) {
        super(id, name);
        this.juniors = juniors;
        this.seniors = seniors;
        this.mids = mids;
    }
    public void addEmployee(int index,JuniorDeveloper developer){
        try{
        if(juniors[index]==null){
            juniors[index]=developer;
        }else{
            System.out.println("index dolu");
        }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found"+ex.getMessage());
        }
    }
    public void addEmployee(int index,MidDeveloper developer){
        try{
            if(mids[index]==null){
                mids[index]=developer;
            }else{
                System.out.println("index dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found"+ex.getMessage());
        }
    }
    public void addEmployee(int index,SeniorDeveloper developer){
        try{
            if(seniors[index]==null){
                seniors[index]=developer;
            }else{
                System.out.println("index dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found"+ex.getMessage());
        }
    }

    public JuniorDeveloper[] getJuniors() {
        return juniors;
    }

    public SeniorDeveloper[] getSeniors() {
        return seniors;
    }

    public MidDeveloper[] getMids() {
        return mids;
    }

    @Override
    public void work() {
        setSalary(9000);
        System.out.println(getName()+"HRmanagement begins to work");
    }
}
