import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void 테스트한다() {
        //given
        int number = 3;

        //when //then
        assertThat(number).isEqualTo(3);
    }
}