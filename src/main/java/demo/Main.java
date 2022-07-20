package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        // Another way to get bean using id
        Nurse nurse = (Nurse)context.getBean("nurse");
        nurse.assist();
        // Added interface Staff to decouple the application
        Staff staff = context.getBean(Doctor.class);
        staff.assist();
    }
}
