import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public FizzBuzz() {
    }

    public String sayHello() {
        return "FizzBuzz says hello!";
    }

    public List<String> fizzBuzz(int num) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= num; i++) {
            String str = "";
            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);

            if(divisibleBy3) {
                str += "Fizz";
            }
            if(divisibleBy5) {
                str += "Buzz";
            }
            if(str.equals("")) {
                str = Integer.toString(i);
            }
            result.add(str);
        }
        return result;
    }

}
