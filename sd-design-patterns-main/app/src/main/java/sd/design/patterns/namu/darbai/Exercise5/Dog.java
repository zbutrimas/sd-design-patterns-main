package sd.design.patterns.namu.darbai.Exercise5;

import java.util.*;

public class Dog {

        String name;
        String type;
        Integer age;
        List<String> toys;

    void addToys(List<String> toys) {
        this.toys = toys;
    }


    void dogNew() {
        System.out.println("Dog: " + name);
        System.out.println("Type: " + type);
        System.out.println("Age: " + age + " year");
        System.out.println("Adding toys: ");
        for (String toy : toys) {
            System.out.println("   " + toy);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    public String toString() {
//            StringBuffer display = new StringBuffer();
//            display.append(this.name + this.type + this.age + " ----\n");
//            for (String toy : toys) {
//                display.append(toy + "\n");
//            }
//            return display.toString();
//        }
    }
