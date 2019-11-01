package ru.example;

import org.junit.Test;
import org.junit.Ignore;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class BullsnCowsTest {

    @Test
    public void test() throws Exception {
        assertThat(BullsnCows.forTest(), is(equalTo(9000)));
    }
}
