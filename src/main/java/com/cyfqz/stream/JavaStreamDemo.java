package com.cyfqz.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * java流操作
 *
 * @author slashoper Email:liqan@szlanyou.com
 * @since 2023/09/25 14:17
 */
public class JavaStreamDemo {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("zhangsan", 11000.5), new User("lisi", 12000.5),new User(
                "wangwu",30000.5)
        );
//        Map<String, Double> stringDoubleMap = users.stream().collect(Collectors.toMap(s -> s.getName(), s -> s.getSalary()));
        Map<String, Double> stringDoubleMap = users.stream().collect(Collectors.toMap(User::getName, User::getSalary));
        stringDoubleMap.forEach((k,v) -> {
            System.out.printf("姓名:%s,工资：%.2f %n",k,v);
        });

//        long s = 1000;
//        System.out.println(s);
    }

    static class User{
        private String name;
        private Double salary;


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public User(String name, Double salary) {
            this.name = name;
            this.salary = salary;
        }

        public User() {
        }
    }
}
