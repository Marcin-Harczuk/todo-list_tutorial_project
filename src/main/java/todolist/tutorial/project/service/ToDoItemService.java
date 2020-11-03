package todolist.tutorial.project.service;
import todolist.tutorial.project.model.ToDoData;
import todolist.tutorial.project.model.ToDoItem;

public interface ToDoItemService {

    void addItem(ToDoItem toAdd);

    void removeItem(int id);

    ToDoItem getItem(int id);

    void updateItem(ToDoItem toUpdate);

    ToDoData getData();
}
