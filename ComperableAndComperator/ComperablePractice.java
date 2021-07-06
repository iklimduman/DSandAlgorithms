
// comperable and compertaor are independent from each other, neither needs to another to operate.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays ;

import java.util.* ;

import java.lang.* ;

public class ComperablePractice implements Comparable<Student>{
    public static void main(String[] args) {

        Student firstStudent = new Student("John", 21, "CS");
        Student secondStudent = new Student("Emma",21,"EE");
        Student thirdStudent = new Student("Adrianna",20,"EE");
        Student fourthStudent = new Student("George",19,"CS");

        //ArrayList<Student> studentArrayList = new ArrayList<Student>();
        Student[] studentArrayList = new Student[4];

        studentArrayList[0] = firstStudent;
        studentArrayList[1] = secondStudent;
        studentArrayList[2] = thirdStudent;
        studentArrayList[3] = fourthStudent;

        System.out.println("Before sorting" + studentArrayList.toString()) ;

        Arrays.sort(studentArrayList);

        System.out.println("After sorting " + studentArrayList.toString());
    }

    @Override
    public int compareTo(Student o) {
        if(o instanceof Student){
            Student other =(Student) o ;
            if(o.age > other.age){
                return 1 ;
            }
            else if( o.age == other.age){
                return 0 ;
            }
            else if ( o.age < other.age){
                return -1 ;
            }
        }
        return 0;
    }

    public int compare(Student s1, Student s2){
        return s1.getName().length() - s2.getName().length() ;
    }
}


class Student{

    public String name ;
    public int age ;
    public String major ;

    public Student(String name, int age, String major){
        this.age = age ;
        this.name = name ;
        this.major = major ;
    }

    public int getAge(){
        return this.age ;
    }

    public String getName(){
        return name ;
    }

    public void setAge(int age){
        this.age = age ;
    }
}

class ageComperator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        if ( s1.getAge() > s2.getAge()){
            return 1 ;
        }
        else if ( s1.getAge() < s2.getAge()){
            return -1 ;
        }
        else{
            return 0 ;
        }
    }
}


