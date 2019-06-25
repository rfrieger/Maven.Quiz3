package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        Stream<SomeType> stream = Stream.of(array);
        List<SomeType> myList = stream.filter(e -> getNumberOfOccurrences(e)%2 != 0).collect(Collectors.toList());

       return myList.get(0);
    }

    public SomeType findEvenOccurringValue() {
        Stream<SomeType> stream = Stream.of(array);
        List<SomeType> myList = stream.filter(e -> getNumberOfOccurrences(e)%2 ==0).collect(Collectors.toList());

        return myList.get(0);
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Stream<SomeType> stream = Stream.of(array);
        List<SomeType> myList = stream.filter(e -> e == valueToEvaluate).collect(Collectors.toList());
        return myList.size();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
