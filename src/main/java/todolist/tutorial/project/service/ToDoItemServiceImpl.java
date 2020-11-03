package todolist.tutorial.project.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import todolist.tutorial.project.model.ToDoData;
import todolist.tutorial.project.model.ToDoItem;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    // == fields ==
    @Getter
    private final ToDoData data = new ToDoData();

    // == public methods ==
    @Override
    public void addItem(ToDoItem toAdd) {
        data.addItem(toAdd);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public ToDoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(ToDoItem toUpdate) {
        data.updateItem(toUpdate);
    }
}

