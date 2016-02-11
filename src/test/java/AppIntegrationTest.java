// import org.fluentlenium.adapter.FluentTest;
// import org.junit.ClassRule;
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//
// import static org.assertj.core.api.Assertions.assertThat;
//
// public class CoinCombinationsTest extends FluentTest {
//   public WebDriver webDriver = new HtmlUnitDriver();
//   public WebDriver getDefaultDriver() {
//       return webDriver;
//   }
//
//   @ClassRule
//   public static ServerRule server = new ServerRule();
//
//   @Test
//   public void rootTest() {
//       goTo("http://localhost:4567/");
//       assertThat(pageSource()).contains("Input a number between 0 and 99 and we'll make change for ya!");
//   }
//
//   @Test
//   public void methodName() {
//     goTo("http://localhost:4567");
//     fill("#amount").with("68");
//     submit(".btn");
//     assertThat(pageSource()).contains("Quarters: 2 Dimes: 1 Nickels: 1 Pennies: 3");
//   }
//
//   @Test
//   public void methodName() {
//     goTo("http://localhost:4567");
//     fill("#amount").with("0");
//     submit("#submit-button");
//     assertThat(pageSource()).contains("Quarters: 0 Dimes: 0 Nickels: 0 Pennies: 0");
//   }
//
// }
