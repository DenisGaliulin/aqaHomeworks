package ru.netology.javaqa;

import org.junit.Test;
import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn500() {

        int amount = 500;
        int expected = 500;


        int actual = service.remain(amount);


        assertEquals("Остаток до кэшбэка должен быть 500 рублей", expected, actual);
    }

    @Test
    public void shouldReturn1000() {

        int amount = 1000;
        int expected = 0;


        int actual = service.remain(amount);


        assertEquals("При сумме кратной 1000 остаток должен быть 0", expected, actual);
    }

    @Test
    public void shouldReturn200() {

        int amount = 800;
        int expected = 200;


        int actual = service.remain(amount);


        assertEquals("Остаток до кэшбэка должен быть 200 рублей", expected, actual);
    }

    @Test
    public void shouldReturn750() {
        int amount = 250;
        int expected = 750;


        int actual = service.remain(amount);


        assertEquals("Остаток до кэшбэка должен быть 750 рублей", expected, actual);
    }

    @Test
    public void shouldReturnOneThousand() {

        int amount = 0;
        int expected = 1000;


        int actual = service.remain(amount);


        assertEquals("При нулевой сумме остаток должен быть 1000", expected, actual);
    }

    @Test
    public void shouldReturn300() {

        int amount = 1700;
        int expected = 300; // 1000 - 1700 % 1000 = 1000 - 700 = 300


        int actual = service.remain(amount);


        assertEquals("Остаток до кэшбэка должен быть 300 рублей", expected, actual);
    }

}