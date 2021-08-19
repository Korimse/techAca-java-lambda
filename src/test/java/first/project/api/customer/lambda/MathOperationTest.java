package first.project.api.customer.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void main() {
        MathOperation plus = (a, b) -> a + b;
        MathOperation multi = (a, b) -> a * b;
        assertThat(plus.main(3, 5), is(equalTo(8)));
        assertThat(multi.main(5, 6), is(equalTo(30)));
    }
}