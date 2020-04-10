package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TableRepositoryTest {

	@DisplayName("존재하는 테이블 번호인 경우")
	@Test
	void fromTest() {
		assertThat(TableRepository.from(1)).isEqualTo(new Table(1));
	}

	@DisplayName("존재하지 않는 테이블 번호인 경우")
	@Test
	void fromTest2() {
		assertThatThrownBy(() -> TableRepository.from(4))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
