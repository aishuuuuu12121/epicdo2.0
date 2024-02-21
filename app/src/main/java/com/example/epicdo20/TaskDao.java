package com.example.epicdo20;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

@Dao
public interface TaskDao {

    @Insert
    void insert(Task task);

    @Update
    void update(Task task);

    @Delete
    void delete(Task task);

    @Query("DELETE FROM task_table")
    void deleteAllTasks();

    @Query("SELECT * FROM task_table ORDER BY priority DESC")
    LiveData<List<Task>> getAllTasks();
    // Define the deleteAll method
    @Query("DELETE FROM task_table")
    void deleteAll();

    @Query("SELECT * FROM task_table WHERE id = :taskId")
    LiveData<Task> getTaskById(int taskId);
}
