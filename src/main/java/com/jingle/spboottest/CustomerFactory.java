package com.jingle.spboottest;



import com.jingle.customer.entity.Customer;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.ImportResource;

@ImportResource("classpath:beans.xml")
public class CustomerFactory implements FactoryBean<Customer> {
    @Override
    public Customer getObject() throws Exception {
        return new Customer("kezhi","zhu");
    }

    @Override
    public Class<?> getObjectType() {
        return Customer.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
