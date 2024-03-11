package jk1;
import java.util.*;
class Main{
public static void main(String[] args){
Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
person1.print();

Person person2 = new Person("山田", "花子", 22, 1.5, 40);
person2.print();

Person.printCount();
}
}
class Person{
public static int count = 0;
public String firstName;
public String lastName;
public int age;
public double height, weight;

// コンストラクタを定義しインスタンスフィールドに値をセット
Person(String firstName, int age, double height, double weight) {
Person.count++;

    this.firstName = firstName;
    this.age = age;
    this.height = height;
    this.weight = weight;
}
