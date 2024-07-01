package saf.lexicon;

import static org.junit.Assert.*;
import org.junit.Test;

public class TodoItemTaskTest {
    @Test
    public void testAssignedField() {
        Person assignee = new Person(1, "Nisse", "Olsson", "nisse@gmail.com");
        TodoItem item = new TodoItem(1, "Change tires", "Change to winter tires", LocalDate.now().plusDays(1), false, assignee);
        TodoItemTask task = new TodoItemTask(1, item, assignee);
        assertTrue(task.isAssigned());
    }

    @Test
    public void testGetSummary() {
        Person creator = new Person(1, "Nisse", "Olsson", "nisse@gmail.com");
        TodoItem item = new TodoItem(1, "Change tires", "Change to winter tires", LocalDate.now().plusDays(1), false, creator);
        TodoItemTask task = new TodoItemTask(1, item, creator);
        assertEquals("id: 1, assigned: true, todoItem: id: 1, title: Change tires, description: Change to winter tires, deadline: " + LocalDate.now().plusDays(1) + ", done: false, creator: id: 1, name: Nisse Olsson, email: nisse@gmail.com, assignee: id: 1, name: Nisse Olsson, email: nisse@gmail.com", task.getSummary());
    }
}
