package com.company;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void main1() {

        Assert.assertEquals(1, Main.getLength());

    }
}