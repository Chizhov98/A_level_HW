import hw9.CheckTurn;
import hw9.Convert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)

public class CheckTurnTest {
    @Mock
    Convert converterMock;
    CheckTurn checkMock;
    @InjectMocks
    CheckTurn check;

    @Test
    public void validationOfCoords_nominal() {
        boolean result = check.validationOfCoords(1, 2, 3, 4);
        Assert.assertTrue(result);
    }

    @Test
    public void validationOfCoords_false_resalt() {
        boolean result = check.validationOfCoords(1000, 2, 3, 4);
        Assert.assertFalse(result);
    }

    @Test
    public void checkTurn_nominal(){
        boolean result =check.checkTurn(1,1,2,3);
        Assert.assertTrue(result);
    }
    @Test
    public void checkTurn_false_result(){
        Mockito.when(checkMock.letterRangeOfTurn(any(),any())).thenReturn(5).thenReturn(3);
        Mockito.when(checkMock.numRangeOfTurn(any(),any())).thenReturn(1).thenReturn(3);
        boolean result =check.checkTurn(1,1,1,1);
        Assert.assertFalse(result);
    }

}
