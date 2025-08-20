package org.example;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private int age;

    public static void main(String[] args) {
        User user = new User();
        user.setName("홍길동");
        user.setAge(30);
        System.out.println("이름: " + user.getName());
        System.out.println("나이: " + user.getAge());
    }
}