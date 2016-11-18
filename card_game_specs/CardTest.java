import card_game.*;
import static org.junit.Assert.*;
import org.junit.*;


  public class CardTest{

         Card sevenOfDiamonds;

    @Before 
    public void before(){
        sevenOfDiamonds = new Card(7, SuitType.DIAMONDS);
    }

    @Test 
    public void cardHasValue(){
        assertEquals(7, sevenOfDiamonds.getNumber());
    }

    @Test
    public void cardHasType(){
      assertEquals(SuitType.DIAMONDS, sevenOfDiamonds.getType());
    }

    @Test
    public void cardValueAsString(){
      assertEquals("7 of diamonds", sevenOfDiamonds.toString());
    }

  
  
   
  }