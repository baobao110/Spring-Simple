import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Person a=(Person) context.getBean("person");
		Dog dog=(Dog) context.getBean("dog");
		a.setDog(dog);
		dog.setAge(55);
		System.out.println(a.getDog().getAge());
	}
}
