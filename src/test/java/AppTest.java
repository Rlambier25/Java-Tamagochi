import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("My Tomogotchi");
  }
  @Test
  public void getsSuccessPage() {
    goTo("http://localhost:4567/");
    submit("#newTomogotchiBtn");
    assertThat(pageSource()).contains("Success!");
  }
  @Test
  public void tomogotchiIsCreated() {
    goTo("http://localhost:4567/");
    submit("#newTomogotchiBtn");
    click("a", withText("Go Back"));
    assertThat(pageSource()).contains("Hunger:");
  }
  @Test
  public void tomogotchiFeed() {
    goTo("http://localhost:4567/");
    submit("#newTomogotchiBtn");
    click("a", withText("Go Back"));
    submit("#tomogotchiFeedBtn");
    assertThat(pageSource()).contains("Hunger:");
  }
  @Test
  public void tomogotchiRest() {
    goTo("http://localhost:4567/");
    submit("#newTomogotchiBtn");
    click("a", withText("Go Back"));
    submit("#tomogotchiRestBtn");
    assertThat(pageSource()).contains("Sleep:");
  }
  @Test
  public void tomogotchiExercise() {
    goTo("http://localhost:4567/");
    submit("#newTomogotchiBtn");
    click("a", withText("Go Back"));
    submit("#tomogotchiExerciseBtn");
    assertThat(pageSource()).contains("Activity:");
  }
}
