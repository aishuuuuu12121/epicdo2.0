package com.example.epicdo20;
import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;
import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;

public class Repository {

    private TaskDao taskDao;
    private LiveData<List<Task>> allTasks;

    Repository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        taskDao = db.taskDao();
        allTasks = taskDao.getAllTasks();
    }

    LiveData<List<Task>> getAllTasks() {
        return allTasks;
    }

    void insert(Task task) {
        AppDatabase.databaseWriteExecutor.execute(() -> taskDao.insert(task));
    }

    void update(Task task) {
        AppDatabase.databaseWriteExecutor.execute(() -> taskDao.update(task));
    }

    void delete(Task task) {
        AppDatabase.databaseWriteExecutor.execute(() -> taskDao.delete(task));
    }

    void deleteAllTasks() {
        AppDatabase.databaseWriteExecutor.execute(() -> taskDao.deleteAll());
    }

    // Optionally, if your TaskDao includes methods for finding specific tasks,
    // you can add corresponding methods here. For example:
    LiveData<Task> getTaskById(int id) {
        return taskDao.getTaskById(id);
    }
}
