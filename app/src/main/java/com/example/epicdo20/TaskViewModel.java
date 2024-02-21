package com.example.epicdo20;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import java.util.List;
import com.example.epicdo20.Repository;

public class TaskViewModel extends AndroidViewModel {

    private Repository repository;
    private final LiveData<List<Task>> allTasks;

    public TaskViewModel(Application application) {
        super(application);
        repository = new Repository(application);
        allTasks = repository.getAllTasks();
    }

    LiveData<List<Task>> getAllTasks() { return allTasks; }

    public void insert(Task task) { repository.insert(task); }

    // Add methods for update, delete, etc., as needed
}