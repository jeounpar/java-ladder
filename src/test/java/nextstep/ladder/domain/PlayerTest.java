package nextstep.ladder.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PlayerTest {

    @ParameterizedTest
    @ValueSource(strings = {"pobi", "honux", "crong", "jk"})
    @DisplayName("팩토리 메소드 정상 작동")
    void create(String name) {
        assertNotNull(Player.of(name));
    }

    @Test
    @DisplayName("팩토리 메소드 예외 발생")
    void create_validate() {
        assertThatIllegalArgumentException().isThrownBy(() -> Player.of("abcdef"));
    }
}