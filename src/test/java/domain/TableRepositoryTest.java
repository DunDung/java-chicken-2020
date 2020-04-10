package domain;

import static org.assertj.core.api.AssertionsForClassTypes.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TableRepositoryTest {

	@DisplayName("존재하는 테이블 번호인 경우")
	@Test
	void fromWithNumberTest() {
		assertThat(TableRepository.fromWithNumber(1)).isEqualTo(new Table(1));
	}

	@DisplayName("존재하지 않는 테이블 번호인 경우")
	@Test
	void fromWithNumberTest2() {
		assertThatThrownBy(() -> TableRepository.fromWithNumber(4))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
