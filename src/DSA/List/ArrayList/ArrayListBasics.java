package DSA.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBasics
{
    public static void main(String[] args)
    {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("1","Ganapati","hegde"));
        empList.add(new Employee("2","Artemis","Paul"));
        empList.add(new Employee("3","Xiomo","mi"));

        System.out.println(empList);
        empList.add(2,new Employee("4","Hello","Baba"));
        System.out.println(empList);

        Employee[] objEmpArray = empList.toArray(new Employee[empList.size()]);


    }
}
