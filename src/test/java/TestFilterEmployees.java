import city.service.Employee;
import org.junit.jupiter.api.Test;
import util.FilterEmployees;


import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestFilterEmployees
{
    @Test
    public void testFilterEmployees() {
        // Setup
        StubCityService stubApi = new StubCityService();
        FilterEmployees filterUtil = new FilterEmployees();
        Employee e = stubApi.getEmployee().get(0);

        // Run
        List<Employee> filtered = filterUtil.filter(stubApi.getEmployee(), "Edmonton");

        // Verify
        assertEquals(1, filtered.size());
        assertEquals(e.getAddress().getCity(), filtered.get(0).getAddress().getCity());

    }
}
