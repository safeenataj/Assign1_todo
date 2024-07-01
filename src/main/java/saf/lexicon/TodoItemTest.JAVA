package saf.lexicon;

import static org.junit.Assert.*;
import org.junit.Test;
import java.time.LocalDate;

public class TodoItemTest {
    @Test
    public void testIsOverdue() {
        TodoItem item = new TodoItem(1, "Change tires", "Change to winter tires", LocalDate.now().minusDays(1), false, new Person(1, "Nisse", "Olsson", "nisse@gmail.com"));
        assertTrue(item.isOverdue());
    }

    @Test
    public void testGetSummary() {
        Person creator = new Person(1, "Nisse", "Olsson", "nisse@gmail.com");
        TodoItem item = new TodoItem(1, "Change tires", "Change to winter tires", LocalDate.now().plusDays(1), false, creator);
        assertEquals("id: 1, title: Change tires, description: Change to winter tires, deadline: " + LocalDate.now().plusDays(1) + ", done: false, creator: id: 1, name: Nisse Olsson, email: nisse@gmail.com", item.getSummary());
    }
}
