package com.jingle.employee;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.jingle.AbstractTest;
import com.jingle.employee.entity.Employee;


import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


public class EmployeeServiceControllerTest extends AbstractTest {

    @Test
    public void getEmployee() throws Exception {
        String uri = "/employee/10";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        Employee employee = super.mapFromJson(content, Employee.class);
        assertEquals("kezhi1", employee.getName());
    }
    @Test
    public void createEmployee() throws Exception {
        String uri = "/employee/save";
        Employee employee = new Employee();
        employee.setName("kezhi3");
        employee.setEmail("kezhu3@gmail.com");
        String inputJson = super.mapToJson(employee);
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(201, status);
        String content = mvcResult.getResponse().getContentAsString();
        assertEquals(content, "SAVE IS OK");
    }

}