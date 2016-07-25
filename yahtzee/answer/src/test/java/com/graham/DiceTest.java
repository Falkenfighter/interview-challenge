package com.graham;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import org.testng.annotations.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class DiceTest {

    @Mocked private Random random;
    @Injectable private Integer sides = 6;
    @Tested private Dice tested;

    @Test
    public void testRoll() throws Exception {
        new Expectations() {{
            random.nextInt(sides); returns(1, 2, 3, 4, 5);
        }};
        assertThat(tested.roll(5)).isEqualTo(new int[]{ 2, 3, 4, 5, 6 });
    }
}