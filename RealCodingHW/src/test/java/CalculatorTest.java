import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Before
    public void setUp() {
        Calculator calculator = new Calculator();
    }
    @Test
    public void setResult()  {
        calculator.getResult();
        assertThat(calculator.getResult(), is(0));
    }
    @Test
    public void caladd()    {
        calculator.add(2500, 500);
        assertThat(calculator.getResult(), is(3000));

    }
    @Test
    public void callingResultAtLeastOne()    {
        Calculator calculator = mock(Calculator.class);
        calculator.getResult();
        verify(calculator, atLeastOnce()).getResult();

    }
    //==================================   Money  ==========================================
    @Test
    public void won_Dollar(){  // 원은 몇 달러인가?
        calculator.wonToDollar();
        assertThat(calculator.getDollar(), equalTo(calculator.getWon() / 1200) );
    }

    @Test
    public void won_Pound(){
        calculator.wonToPound();
        assertThat(calculator.getPound(), Matchers.is(calculator.getWon() / 1500) );
    }

    @Test
    public void won_Yen(){
        calculator.wonToYen();
        assertEquals(calculator.getYen(),(calculator.getWon() / 10));
    }

}