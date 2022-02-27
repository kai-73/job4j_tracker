package ru.job4j.collection.exercises;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SubList09Test {

    private List<String> list = new ArrayList<>();

    @Before
    public void setUp() {
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("three");
        list.add("ten");
    }

    @Test
    public void getElementsBetweenIndexes() {
        List<String> result = SubList09.getElementsBetweenIndexes(list, "three");
        List<String> expected = List.of("three", "four", "five", "six", "seven", "eight");
        assertThat(result, is(expected));
    }

    @Test
    public void getElementsBetweenIndexesEmptyList() {
        List<String> result = SubList09.getElementsBetweenIndexes(list, "aaa");
        List<String> expected = List.of();
        assertThat(result, is(expected));
    }
}