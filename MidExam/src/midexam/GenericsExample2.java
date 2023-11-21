/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

// Generic class with a placeholder type T
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class GenericsExample2 {
    public static void main(String[] args) {
        // Creating a Box for Integer
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Integer Value: " + intBox.getValue());

        // Creating a Box for String
        Box<String> strBox = new Box<>("Hello, Generics!");
        System.out.println("String Value: " + strBox.getValue());
    }
}

