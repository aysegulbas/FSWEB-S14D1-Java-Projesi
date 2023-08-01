package coo.workintech.main.main;

import coo.workintech.main.company.*;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        Employee asci=new Employee(1,"Osman");
        asci.work();
        JuniorDeveloper jn1=new JuniorDeveloper(2,"Ahmet");
        jn1.work();
        JuniorDeveloper jn2=new JuniorDeveloper(3,"Aylin");
        jn2.work();
        //JuniorDeveloper[] juniors=new JuniorDeveloper[]{jn1,jn2};

        MidDeveloper mid1=new  MidDeveloper(2,"Oguz");
        mid1.work();
        MidDeveloper mid2=new  MidDeveloper(3,"Nur");
        mid2.work();
        //MidDeveloper[] mids=new  MidDeveloper[]{mid2,mid1};

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(5, "Aysegul");
        seniorDeveloper.work();

        HRManager hrManager=new HRManager(1,"ayse",new JuniorDeveloper[3],new SeniorDeveloper[1],new MidDeveloper[2]);
        hrManager.work();
        System.out.println("Senior salary: "+seniorDeveloper.getSalary());
        System.out.println("HR manager salary: "+hrManager.getSalary());
        System.out.println("Joniors "+ Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mid developers "+Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors developers "+Arrays.toString(hrManager.getSeniors()));
        hrManager.addEmployee(0, jn1);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println("***********************************************");
        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

    }
}
