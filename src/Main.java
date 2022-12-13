
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Arrays.stream(args)
                .forEach(System.out::println);

        //Random r = new Random();
        //System.out.println(r.nextInt(10));
    }
}