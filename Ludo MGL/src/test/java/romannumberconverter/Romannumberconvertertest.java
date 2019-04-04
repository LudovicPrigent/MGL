package romannumberconverter;

import org.junit.Test;
import org.junit.Before;

import static org.assertj.core.api.Assertions.*;

public class Romannumberconvertertest {

  Romannumberconverter roman;

  @Before
  public void setup() {
    roman = new Romannumberconverter();
  }

  @Test
  public void check1() {
    assertThat(roman.convert("X"))
      .isEqualTo(10);
  }
  @Test
  public void check2() {
    assertThat(roman.convert("XVI"))
      .isEqualTo(16);
  }
  @Test
  public void check_null() {
    assertThatThrownBy(() -> roman.convert(null))
    .isInstanceOf(IllegalArgumentException.class)
    .hasMessageContaining("cannot be null");
  }
}
