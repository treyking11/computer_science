package test;

import ContactService.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ContactTest {

    @Test
    void testContactClass(){
        Contact contact = new Contact("12345", "Trey", "King", "8585551212", "363 Hemlock Ave");
        assertTrue(contact.getId().equals("12345"));
        assertTrue(contact.getFirstName().equals("Trey"));
        assertTrue(contact.getLastName().equals("King"));
        assertTrue(contact.getPhone().equals("8585551212"));
        assertTrue(contact.getAddress().equals("363 Hemlock Ave"));
    }

    @Test
    void testContactIdNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Trey", "King", "8585551212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactIdTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678900", "Trey", "King", "8585551212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "King", "8585551212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactNameTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "TreyTreyTrey", "King", "8585551212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactLastNameNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Trey", null, "8585551212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactLastNameTooLong(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Trey", "KingKingKing", "8585551212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactPhoneNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Trey", "King", null, "363 Hemlock Ave");
        });
    }

    @Test
    void testContactPhoneLength(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Trey", "King", "85855512121212", "363 Hemlock Ave");
        });
    }

    @Test
    void testContactAddressNull(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Trey", "King", "8585551212", null);
        });
    }

    @Test
    void testContactAddressLength(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Trey", "King", "8585551212", "363 Hemlock Ave 363 Hemlock Ave 363 Hemlock Ave 363 Hemlock Ave");
        });
    }


}
