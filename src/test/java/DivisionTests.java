
import org.example.Division;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DivisionTests {
    @Test
    public void TestDivision() {

        Division division = new Division();
        int result = division.divideTwoNum(180, 2);
        Assertions.assertEquals(60, result);
    }
}
