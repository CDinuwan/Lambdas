package test;

import com.functionalprogramming.Employee;
import org.testng.Assert;
import org.testng.annotations.Test;


class EmployeeTest {

    private com.functionalprogramming.EmployeeUtils employeeUtils = new com.functionalprogramming.EmployeeUtils();

    @Test
    void employeeFullName() {
        Employee employee = new Employee();
        employee.setFirstName("Jerome");
        employee.setLastName("Donaldson");

        String actual = employeeUtils.getFullName(employee);

        Assert.assertEquals(actual, "Jerome Donaldson");
    }

    @Test
    void employeeManagersLastName() {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee2.setLastName("Westbay");
        employee1.setManager(employee2);

        String actual = employeeUtils.getManagersLastName(employee1);

        Assert.assertEquals(actual, "Westbay");
    }

    @Test
    void employeeInEmploymentLongerThanFiveYears() {
        Employee employee = new Employee();
        employee.setYearsOfService(20);

        Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

        Assert.assertTrue(actual);
    }

    @Test
    void employeeHasMoreThanThreeDirectReports() {
        Employee employee = new Employee();
        employee.setNumberOfDirectReports(5);

        Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);

        Assert.assertTrue(actual);
    }

    @Test
    void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
        Employee employee = new Employee();
        employee.setYearsOfService(5);
        employee.setNumberOfDirectReports(1);

        Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

        Assert.assertTrue(actual);
    }

}