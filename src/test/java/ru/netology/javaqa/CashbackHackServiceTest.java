package ru.netology.javaqa;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn500() {

        int amount = 500;
        int expected = 500;


        int actual = service.remain(amount);


        assertEquals(actual, expected, "Остаток до кэшбэка должен быть 500 рублей");
    }

    @Test
    public void shouldReturn0() {

        int amount = 1000;
        int expected = 0;


        int actual = service.remain(amount);


        assertEquals(actual, expected, "При сумме кратной 1000 остаток должен быть 0");
    }

    @Test
    public void shouldReturn200() {

        int amount = 800;
        int expected = 200;


        int actual = service.remain(amount);


        assertEquals(actual, expected, "Остаток до кэшбэка должен быть 200 рублей");
    }

    @Test
    public void shouldReturn750() {
        int amount = 250;
        int expected = 750;


        int actual = service.remain(amount);


        assertEquals(actual, expected, "Остаток до кэшбэка должен быть 750 рублей");
    }

    @Test
    public void shouldReturnOneThousand() {

        int amount = 0;
        int expected = 1000;


        int actual = service.remain(amount);


        assertEquals(actual, expected, "При нулевой сумме остаток должен быть 1000");
    }

    @Test
    public void shouldReturn300() {

        int amount = 1700;
        int expected = 300; // 1000 - 1700 % 1000 = 1000 - 700 = 300


        int actual = service.remain(amount);


        assertEquals(actual, expected, "Остаток до кэшбэка должен быть 300 рублей");
    }

}