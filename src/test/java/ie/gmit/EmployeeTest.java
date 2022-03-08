package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setup()
    {
        employee = new Employee();
    }

    @Test
    void testGetEmployeeName()
    {
        assertEquals("Aonghus", employee.getName());
    }

    @Test
    void testGetEmployNum()
    {
        assertEquals(123, employee.getEmployNum());
    }



}
