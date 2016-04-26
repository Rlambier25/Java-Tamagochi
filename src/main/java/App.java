import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("tomogotchi", request.session().attribute("tomogotchi"));


      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



    post("/newTomogotchi", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Tomogotchi newTomogotchi = new Tomogotchi();
      request.session().attribute("tomogotchi", newTomogotchi);


      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



    post ("/myTomogotchiFeed", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Tomogotchi myTomogotchi = request.session().attribute("tomogotchi");

      myTomogotchi.feed();

      model.put("tomogotchi", request.session().attribute("tomogotchi"));

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



    post ("/myTomogotchiRest", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Tomogotchi myTomogotchi = request.session().attribute("tomogotchi");

      myTomogotchi.rest();

      model.put("tomogotchi", request.session().attribute("tomogotchi"));

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



    post ("/myTomogotchiExercise", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      Tomogotchi myTomogotchi = request.session().attribute("tomogotchi");

      myTomogotchi.exercise();

      model.put("tomogotchi", request.session().attribute("tomogotchi"));

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

}
