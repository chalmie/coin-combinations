import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;



public class CoinCombinations {
  public static void main( String[] args ) {
    // front-end

    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");


      int user_input = Integer.parseInt(request.queryParams("amount"));
      String result = makeChange(user_input);

      model.put("result", result);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
  // Back-end

  public static String makeChange(int user_input) {
    int change = user_input;

    int quarters = change / 25;
    if (quarters > 0) {
      change = change % 25;
    }
    int dimes = change / 10;
    if (dimes > 0) {
      change = change % 10;
    }
    int nickels = change / 5;
    if (nickels > 0) {
      change = change % 5;
    }

    String strQuarters = Integer.toString(quarters);
    String strDimes = Integer.toString(dimes);
    String strNickels = Integer.toString(nickels);
    String strPennies = Integer.toString(change);

    return "Quarters: " + strQuarters + " Dimes: " + strDimes + " Nickels: " + strNickels + " Pennies: " + strPennies;
  }


}
