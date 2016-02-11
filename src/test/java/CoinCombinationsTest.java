// Integration imports
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
// Unit imports
import org.junit.*;
import static org.junit.Assert.*;



// public class CoinCombinationsTest {
//
//
//   @Test
//   public void makeChange_returnNumberOfQuarters_2() {
//     CoinCombinations newCombo = new CoinCombinations();
//     assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
//   }
//
//   @Test
//   public void makeChange_returnNumberOfDimes_1() {
//     CoinCombinations newCombo = new CoinCombinations();
//     assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
//   }
//
//   @Test
//   public void makeChange_returnNumberOfNickels_1() {
//     CoinCombinations newCombo = new CoinCombinations();
//     assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
//   }
//
//   @Test
//   public void makeChange_returnNumberOfPennies_3() {
//     CoinCombinations newCombo = new CoinCombinations();
//     assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
//   }
//
//   @Test
//   public void makeChange_returnZeroForAll_0() {
//     CoinCombinations newCombo = new CoinCombinations();
//     assertEquals("Quarters: 0 Dimes: 0 Nickels: 0 Pennies: 0", newCombo.makeChange(0));
//   }
// }

public class CoinCombinationsTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Input a number between 0 and 99 and we'll make change for ya!");
  }

  @Test
  public void calculateAndReturnCorrectOutput() {
    goTo("http://localhost:4567");
    fill("#amount").with("68");
    submit(".btn");
    assertThat(pageSource()).contains("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3");
  }

  @Test
  public void returnZeroForAllUponSubmit() {
    goTo("http://localhost:4567");
    fill("#amount").with("0");
    submit(".btn");
    assertThat(pageSource()).contains("Quarters: 0 Dimes: 0 Nickels: 0 Pennies: 0");
  }

  @Test
  public void makeChange_returnNumberOfQuarters_2() {
    CoinCombinations newCombo = new CoinCombinations();
    assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
  }

  @Test
  public void makeChange_returnNumberOfDimes_1() {
    CoinCombinations newCombo = new CoinCombinations();
    assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
  }

  @Test
  public void makeChange_returnNumberOfNickels_1() {
    CoinCombinations newCombo = new CoinCombinations();
    assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
  }

  @Test
  public void makeChange_returnNumberOfPennies_3() {
    CoinCombinations newCombo = new CoinCombinations();
    assertEquals("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3", newCombo.makeChange(68));
  }

  @Test
  public void makeChange_returnZeroForAll_0() {
    CoinCombinations newCombo = new CoinCombinations();
    assertEquals("Quarters: 0 Dimes: 0 Nickels: 0 Pennies: 0", newCombo.makeChange(0));
  }

}
