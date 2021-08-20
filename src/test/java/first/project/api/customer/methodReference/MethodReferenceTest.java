package first.project.api.customer.methodReference;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Comparator.comparingInt;

public class MethodReferenceTest {
    class MethodReferenceClass{
        Supplier<Date> newDate = Date::new;
        Consumer<String> print = System.out::print;
        Function<Object, String> objectToString = String::valueOf;
        Function<String, Integer> stringToInteger = Integer::parseInt;
        BiFunction<Integer, Integer, Integer> integerMax = Math::max;
    }
    @Test
    void listSortTest() {
        List<String> list = Arrays.asList("Apple", "Orange", "Kiwi");
        list.sort(comparingInt(String::length));
        list.forEach(System.out::println);
    }
}
