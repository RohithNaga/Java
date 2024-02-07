package practisePrograms;

import java.util.*;
import java.io.*;

class person {
    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getname() {
        return name;
    }
    public void changename(String name) {
        this.name = name;
    }
    public void printdetails(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println();
    }

}
public class thiskeyword {
    public static void main(String[] args) {
        person obj1 = new person("abc", 21);
        person obj2 = new person("def", 20);

        obj1.printdetails();
        obj2.printdetails();

        obj2.changename("ghi");
        System.out.println("now after changing the name of the second person: " + obj2.getname());
        System.out.println();

        obj2.printdetails();
    }
}
