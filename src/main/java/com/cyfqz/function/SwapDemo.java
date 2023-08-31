package com.cyfqz.function;

/**
 * java 只有 值传递，没有引用传递，
 */
public class SwapDemo {
    public static void main(String[] args) {
        Person person1 = new Person("张三",18);
        Person person2 = new Person("李四",20);
        swap(person1,person2);
        System.out.println("person1="+person1.getName()+",person2="+person2.getName());

        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = i;
        }

        swapArrayElem(arr);

        System.out.println("交换后");
        System.out.println("array1="+arr[0]+", array2="+arr[1]);
    }

    public static void swapArrayElem(int[] array){
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
        System.out.println("--->函数内部array1="+array[0]+",array2="+array[1]);
    }


    public static void swap(Person p1,Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;
        System.out.println("p1="+p1.getName()+",p2="+p2.getName());
    }

}

class Person{

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
