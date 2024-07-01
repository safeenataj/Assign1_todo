package saf.lexicon;
import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testGetSummary() {
        Person person = new Person(1, "Nisse", "Olsson", "nisse@gmail.com");
        assertEquals("id: 1, name: Nisse Olsson, email: nisse@gmail.com", person.getSummary());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFirstNameNotNull() {
        new Person(1, null, "Olsson", "nisse@gmail.com");
    }
}
