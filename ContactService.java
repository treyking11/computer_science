package ContactService;

import java.util.*;

public class ContactService {

    private static int uniqueId = 0;
    private static Map<Integer, Contact> contacts = new HashMap<>();
    public Map<Integer, Contact> addContact(Contact contact) {
        uniqueId++;
        contacts.put(uniqueId, contact);
        return contacts;
    }

    public Map<Integer, Contact> deleteContact(String contactId) {
        Iterator iter = contacts.entrySet().iterator();

        while (iter.hasNext()){
            Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>) iter.next();

            if (contact.getValue().getContactId() == contactId) {
                iter.remove();
            }
        }

        return contacts;
    }

    public Map<Integer, Contact> updateContact(String id, String firstName, String lastName, String phone, String address) {
        Iterator iter = contacts.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Integer, Contact> entry = (Map.Entry<Integer, Contact>)iter.next();

            if (contact.getValue().getId()== id) {
                entry.getValue().setFirstName(firstName);
                entry.getValue().setLastName(lastName);
                entry.getValue().setPhone(phone);
                entry.getValue().setAddress(address);

            }
        }

        return contacts;
    }

}