package designpatterns;

import designpatterns.adapter.LegacyOrderRepositoryAdapter;
import designpatterns.adapter.OrderDataAdapter;
import designpatterns.adapter.ReportGenerator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReportGeneratorTest {

    @Test
    public void calculateMonthlySales_shouldReturn1000() {
        ReportGenerator reportGenerator = new ReportGenerator();
        OrderDataAdapter orderDataAdapter = new LegacyOrderRepositoryAdapter();

        assertEquals(1000, reportGenerator.calculateMonthlySales(orderDataAdapter));
    }

}
