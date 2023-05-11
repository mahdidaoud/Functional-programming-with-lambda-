package fr.codeonce.lambda.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListConcatenator {

    public List<String> concat(List<String> l1, List<Integer> l2) {
        Stream<String> stringStream = l1.stream();
        Stream<String> integerStream = l2.stream().map(Object::toString);
        Stream<String> concatenatedStream = Stream.concat(stringStream, integerStream);
        return concatenatedStream.collect(Collectors.toList());
    }
    }
    

