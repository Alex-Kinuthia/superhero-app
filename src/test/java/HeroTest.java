import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {


  @Test
   public void Hero_instantiatesCorrectly() {
     Hero myHero = new Hero("HumanTorch", 39, "Ignitefire", "Girls");
     assertEquals(true, myHero instanceof Hero);
   }

   @Test
     public void Hero_instantiatesWithDescription_String() {
       Hero myHero = new Hero("HumanTorch", 39, "Ignitefire", "Girls");
       assertEquals("HumanTorch", 39, "Ignitefire", "Girls", myHero.getName());
     }

     @Test
       public void Hero_instantiatesWithDescription_String() {
         Hero myHero = new Hero("HumanTorch", 39, "Ignitefire", "Girls");
         assertEquals("HumanTorch", 39, "Ignitefire", "Girls", myHero.getAge());
       }

       @Test
         public void Hero_instantiatesWithDescription_String() {
           Hero myHero = new Hero("HumanTorch", 39, "Ignitefire", "Girls");
           assertEquals("HumanTorch", 39, "Ignitefire", "Girls", myHero.getWeakness());
         }


}
