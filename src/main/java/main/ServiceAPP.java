package main;

// импортируем необходимые библиотеки spring -spring Application и библиотеку автоконфигурации
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication  //указание на то, что это у нас приложение springboot
public class ServiceAPP {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAPP.class, args);
    }
}
