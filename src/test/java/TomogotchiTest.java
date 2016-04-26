import org.junit.*;
import static org.junit.Assert.*;

public class TomogotchiTest {

  @Test
    public void tomogotchi_instantiatesCorrectly_true() {
      Tomogotchi myTomogotchi = new Tomogotchi();
      assertEquals(true, myTomogotchi instanceof Tomogotchi);
    }
  @Test
    public void tomogotchi_instantiatesWithCorrectValues_true() {
      Tomogotchi myTomogotchi = new Tomogotchi();
      assertEquals(27, myTomogotchi.totalHealth());
    }
  @Test
    public void tomogotchi_feed_int() {
      Tomogotchi myTomogotchi = new Tomogotchi();
      myTomogotchi.feed();
      assertEquals(8, myTomogotchi.getHunger());
      assertEquals(8, myTomogotchi.getSleep());
      assertEquals(8, myTomogotchi.getActivity());
    }
  @Test
    public void tomogotchi_rest_int() {
      Tomogotchi myTomogotchi = new Tomogotchi();
      myTomogotchi.rest();
      assertEquals(5, myTomogotchi.getHunger());
      assertEquals(11, myTomogotchi.getSleep());
      assertEquals(8, myTomogotchi.getActivity());
    }
  @Test
    public void tomogotchi_exercise_int() {
      Tomogotchi myTomogotchi = new Tomogotchi();
      myTomogotchi.exercise();
      assertEquals(5, myTomogotchi.getHunger());
      assertEquals(8, myTomogotchi.getSleep());
      assertEquals(11, myTomogotchi.getActivity());
    }

  @Test
  public void isAlive_whenAlive_true() {
    Tomogotchi myTomogotchi = new Tomogotchi();
    myTomogotchi.totalHealth();
    assertEquals(true, myTomogotchi.isAlive());
  }

}
