import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTester {
@Test

    public void PreformsCalculation(){
int x=5;
int y = 7;

var result = x+y;
var output = Main.Calculator(x,y);
assertEquals(result,output);


}
@Test
    public void FailingTest(){
    int a = 5;
    int b = 4;
    var result = a-b;
    var output = Main.Calculator(a,b);
    assertEquals(result,output);
}
}
