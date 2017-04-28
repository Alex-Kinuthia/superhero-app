import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class TeamTest {

  @Test
    public void all_returnsAllInstancesOfSquad_true() {
     Team firstTeam = new Team("Fantastic4");
     Team secondTeam = new Team("Xmen");
     assertEquals(true, Team.all().contains(firstTeam));
     assertEquals(true, Team.all().contains(secondTeam));
   }

    @Test
    public void clear_emptiesAllCategoriesFromList_0() {
      Team testTeam = new Team("Fantastic4");
      Team.clear();
      assertEquals(Team.all().size(), 0);
    }

    @Test
    public void getId_teamsInstantiateWithAnId_1() {
      Team.clear();
     Team testTeam = new Team("Fantastic4");
     assertEquals(1, testTeam.getId());
   }

   @Test
   public void find_returnsTeamWithSameId_secondTeam() {
     Team.clear();
     Team firstTeam = new Team("Fantastic4");
     Team secondTeam = new Team("Xmen");
     assertEquals(Team.find(secondTeam.getId()), secondTeam);
   }

// adding a test to make sure a Team instantiates with an empty hero list:
   @Test
   public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
    Team.clear();
    Team testTeam = new Team("Fantastic4");
    assertEquals(0, testTeam.getHeroes().size());
  }

// adding a hero to a squad
  @Test
  public void addHero_addsHeroToList_true() {
    Team testTeam = new Team("Fantastic4");
    Hero testHero = new Hero("HumanTorch", 39, "Ignitefire", "Girls");
    testTeam.addHero(testHero);
    assertTrue(testTeam.getHeroes().contains(testHero));
  }
  }
