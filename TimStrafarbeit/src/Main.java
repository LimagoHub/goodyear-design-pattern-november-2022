import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

       CreateAndFillBean beanCreator = new CreateAndFillBean();

        System.out.println(beanCreator.perform("pojo.Person"));
    }
}