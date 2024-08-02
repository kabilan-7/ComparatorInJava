package comparatorandcomparable;

import java.util.*;
class

Student implements Comparable<Student>{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student that) {
        if(this.age>that.age) return 1;
        else return -1;
    }
}
public class ComparatorTutorial {
    //comparator used to sort elements based on our own logic
    //sort the element based in the last digit using comparator interface
    public static void main(String[] args) {
//        List<Integer> list=new ArrayList<>();
//        list.add(36);
//        list.add(41);
//        list.add(78);
//        list.add(42);
//        List<String> list1=new ArrayList<>();
//        list1.add("Kabilan");
//        list1.add("vijay");
//        list1.add("sivakarthikeyan");
//        list1.add("rajini");
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1%10>o2%10) return 1;
//                else return -1;
//            }
//        };
//
//        Comparator<String> com = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()>o2.length()){
//                    return 1;
//                }else
//                    return -1;
//            }
//        };
//        Collections.sort(list1,com);
        List<Student> list = new ArrayList<>();
        list.add(new Student("kabilan",19));
        list.add(new Student("vijay",13));
        list.add(new Student("ajith",10));
//        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.age>o2.age) return 1;
//                else return -1;
//            }
//        };
//        Collections.sort(list,comparator);
//        for(Student student:list){
//            System.out.print(student.name + " " + student.age);
//            System.out.println();
//        }
//        //without passing comparator object using comparable
        Collections.sort(list);
        for(Student student:list){
            System.out.print(student.name + " " + student.age);
            System.out.println();
        }

    }


}
