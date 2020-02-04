package util;

import city.service.Employee;

import java.util.ArrayList;
import java.util.List;

public class FilterEmployees {

    public List<Employee> filter(List<Employee> employees, String city) {
        if (city == null) {
            return employees;
        }

        List<Employee> result = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getAddress().getCity().equals(city)) {
                result.add(e);
            }
        }

        return result;
    }
}
