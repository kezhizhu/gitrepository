package com.jingle.customer;

import com.jingle.employee.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryBeanXmlConfigTest {
    @Autowired
    private Employee employee;

    @Test
    public void testConstructWorkerByXml() {
        assertEquals(employee.getId(), 1);
    }
}
