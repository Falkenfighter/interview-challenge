package com.graham;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class YahtzeeTest {

    @Mocked private Dice dice;
    @Tested private Yahtzee tested;

    @Test
    public void testMainNoLoop() throws Exception {
        new Expectations(tested) {{
            Yahtzee.yahtzee((int[]) any); returns(false, true);
            dice.roll(5); result = new int[0]; times = 2;
        }};
        Yahtzee.main(null);
    }

    @Test
    public void testYahtzee() throws Exception {
        assertThat(Yahtzee.yahtzee(new int[]{1, 1})).isTrue();
    }
}