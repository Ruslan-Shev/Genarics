package org.example;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AviaSoulsTest {
    @Test
    public void testSearchAndSortBy() {
        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Moscow", "Paris", 100);
        Ticket t2 = new Ticket("Moscow", "Paris", 200);
        Ticket t3 = new Ticket("Moscow", "Paris", 150);
        manager.add(t1);
        manager.add(t2);
        manager.add(t3);

        Comparator<Ticket> comparator = Comparator.comparing(Ticket::getPrice);
        Ticket[] expected = {t1, t3, t2};
        Ticket[] actual = manager.searchAndSortBy("Moscow", "Paris", comparator);
        assertArrayEquals(expected, actual);
    }
}

