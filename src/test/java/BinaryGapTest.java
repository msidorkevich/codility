import org.junit.Test;

import static java.lang.Math.pow;
import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {

    @Test
    public void oneGap() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("1001", 2))).isEqualTo(2);
    }

    @Test
    public void twoGaps() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("1000010001", 2))).isEqualTo(4);
    }

    @Test
    public void trailingZerosOnRight() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("10100", 2))).isEqualTo(1);
    }

    @Test
    public void trailingZerosOnLeft() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("00101", 2))).isEqualTo(1);
    }

    @Test
    public void trailingZerosOnLeftAndRight() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("00010100", 2))).isEqualTo(1);
    }

    @Test
    public void noZeros() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("11111", 2))).isEqualTo(0);
    }

    @Test
    public void allZerosAreTrailing() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("00011100", 2))).isEqualTo(0);
    }

    @Test
    public void allZeros() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("00000", 2))).isEqualTo(0);
    }

    @Test
    public void powerOfTwo() {
        assertThat(BinaryGap.gapSize(2*2*2*2)).isEqualTo(0);
        assertThat(BinaryGap.gapSize(2*2*2*2*2*2*2*2*2*2)).isEqualTo(0);
    }

    @Test
    public void moreThanTwoGaps() {
        assertThat(BinaryGap.gapSize(Integer.parseInt("101001000", 2))).isEqualTo(2);
    }
}