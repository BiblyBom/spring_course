package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tets4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
       Dog anotherDog = context.getBean("myPet", Dog.class);
       myDog.setName("Белка");
       anotherDog.setName("Стрелка");

        System.out.println("Переменные ссылаются на один и тот же объект? \n" + (myDog == anotherDog));
        System.out.println(myDog.getName());
        System.out.println(anotherDog.getName());
        context.close();
    }
}
