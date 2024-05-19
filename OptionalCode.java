package Interview;

import java.util.Optional;

public class OptionalCode {

    public static void main(String[] args) {
        String abc =null;
        Optional<String> opt1 = Optional.ofNullable(abc);
        System.out.println(opt1.orElse("ABC"));

        String abcd = "Hello";
        Optional<String> opt2 = Optional.of(abcd);
        System.out.println(opt2.get());


    }
}
