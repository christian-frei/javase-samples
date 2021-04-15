package date;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;

class FirstFridayOfNextMonthTest {

    @Test
    void getFirstFridayOfNextMonth() {
        var cut = new FirstFridayOfNextMonth();
        String result = cut.getFirstFridayOfNextMonth();
        assertThat(result, is(notNullValue()));
        System.out.println("result = " + result);
    }
}