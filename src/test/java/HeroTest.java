import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {


  @Test
   public void Hero_instantiatesCorrectly() {
     Hero myHero = new Hero("HumanTorch", 39, "Ignitefire", "Girls");
     assertEquals(true, myHero instanceof Hero);
   }

}
