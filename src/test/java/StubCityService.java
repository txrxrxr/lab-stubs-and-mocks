import java.util.ArrayList;
import java.util.List;

import city.service.Address;
import city.service.Employee;

public class StubCityService {

    public List<Employee> getEmployee() {
        Employee e1 = new Employee( "John Doe", 1,  150000, new Address("Garneau", "Edmonton"));
        Employee e2 = new Employee( "James Doe", 2,  200000, new Address("Garneau", "Calgary"));

        List<Employee> data = new ArrayList<>();
        data.add(e1);
        data.add(e2);
        return data;
    }
}
