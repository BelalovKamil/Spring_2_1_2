import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloworld =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld helloworld1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("Сравнение beans с дефолтным scope: " + (helloworld==helloworld1));
        ApplicationContext applicationContext2 =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat cat = (Cat)applicationContext2.getBean("cat");
        Cat cat1 = (Cat) applicationContext2.getBean("cat");
        System.out.println("Сравнение beans с prototype scope: " + (cat==cat1));
    }
}