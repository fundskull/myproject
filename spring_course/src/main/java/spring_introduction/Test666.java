package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test666 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
    }
}
