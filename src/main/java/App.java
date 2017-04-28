import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

 // creating a root route in App.java file that will render our home page
 // displaying custom methods
    get("/", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();
          model.put("heroes", request.session().attribute("heroes"));
          model.put("template", "templates/index.vtl");
          return new ModelAndView(model, layout);
        }, new VelocityTemplateEngine());

        post("/heroes", (request, response) -> {
          Map<String, Object> model = new HashMap<String, Object>();

        ArrayList<Hero> heroes = request.session().attribute("heroes");
        if (heroes == null) {
        heroes = new ArrayList<Hero>();
        request.session().attribute("heroes", heroes);
        }

        String name = request.queryParams("name");
     int age = Integer.parseInt(request.queryParams("age"));
     String strength = request.queryParams("strength");
     String weakness = request.queryParams("weakness");
     Hero newHero = new Hero(name, age, strength, weakness);
     heroes.add(newHero);

             model.put("template", "templates/success.vtl");
             return new ModelAndView(model, layout);
           }, new VelocityTemplateEngine());


      }
    }
