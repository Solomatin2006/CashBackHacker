package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @Test
    public void testRemain1() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemain2() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
}