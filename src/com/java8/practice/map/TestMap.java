package com.java8.practice.map;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
		String str = "hello hello hello hello bye bye bye bye bye ciao bye ciao ciao ciao ciao ciao ciao ciao bye ciao ciao ciao ciao ciao ciao don jimmy xyz";

		Map<String, Long> t = Arrays.stream(str.split("\\s+")).parallel()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(9)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

		System.out.println(t);
		System.out.println(Arrays.stream(str.split("\\s+")).collect(new MyCollector() ));

	}

}

class MyCollector implements Collector<String, Map<String, Long>, Map<String, Long>> {

	@Override
	public Supplier<Map<String, Long>> supplier() {
		return LinkedHashMap::new;
	}

	@Override
	public BiConsumer<Map<String, Long>, String> accumulator() {
		return (map, b) -> map.merge(b,Long.valueOf(1), (a, s) -> a + s);
	}

	@Override
	public BinaryOperator<Map<String, Long>> combiner() {
		return (a, b) -> a;
	}

	@Override
	public Set<Characteristics> characteristics() {
		return Collections.emptySet();
	}

	@Override
	public Function<Map<String, Long>, Map<String, Long>> finisher() {
		return (a) -> {
			return a.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(
					Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

		};
	}

}