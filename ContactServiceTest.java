package test;

import ContactService.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ContactServiceTest {

    @Test
    void testContactServiceTest(){
        Contact contact = new Contact("123", "Test", "Monkey", "8005551212", "123 Main St");
        assertTrue(contact.getId().equals("123"));
        assertTrue(contact.getFirstName().equals("Test"));
        assertTrue(contact.getLastName().equals("Monkey"));
        assertTrue(contact.getPhone().equals("8005551212"));
        assertTrue(contact.getAddress().equals("123 Main St"));
    }
}


