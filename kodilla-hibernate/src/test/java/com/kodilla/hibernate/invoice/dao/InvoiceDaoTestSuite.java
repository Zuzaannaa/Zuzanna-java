package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice("21/43/77");

        Product cucumber = new Product("Cucumber");
        Product donut = new Product("Donut");
        Product cheese = new Product("Cheese");

        Item item1 = new Item(new BigDecimal(99), 12, new BigDecimal(45), cucumber);
        Item item2 = new Item(new BigDecimal(21), 98, new BigDecimal(22), donut);
        Item item3 = new Item(new BigDecimal(45), 89, new BigDecimal(88), cheese);

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        Optional<Invoice> invoicePersist = invoiceDao.findById(invoiceId);
        String nameOfProduct = cucumber.getName();
        int items = invoicePersist.get().getItems().size();

        //Then
        Assert.assertEquals("Cucumber", nameOfProduct);
        Assert.assertEquals(3, items);

        //CleanUp
        invoiceDao.delete(invoice);







    }
}
