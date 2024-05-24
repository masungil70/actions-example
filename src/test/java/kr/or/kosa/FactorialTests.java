package kr.or.kosa;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FactorialApplicationTests {

	@Test
	void 정상적인양의정수의_펙토리() {
		try {
			assertThat(Factorial.factorialUsingForLoop(3)).isEqualTo(6);
		} catch (NegativeValueException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void 음의정수의_예외_펙토리() {
		 assertThatThrownBy(() -> Factorial.factorialUsingForLoop(-1))
         .isInstanceOf(NegativeValueException.class);
	    
	}

}
