package com.example.epicdo20; // Ensure this matches your actual package name

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.util.Date;

@Entity(tableName = "task_table")
public class Task {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String title; // Assuming you have a title field

    public String description; // Assuming you have a description field

    @ColumnInfo(name = "priority")
    public int priority;

    @ColumnInfo(name = "category")
    public String category;

    @ColumnInfo(name = "due_date")
    public Date dueDate; // Using java.util.Date for the date type

    // Constructor, getters, and setters
    public Task(String title, String description, int priority, String category, Date dueDate) {
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.category = category;
        this.dueDate = dueDate;
    }

    // Getters and setters for the new fields
    // Note: Depending on your requirements, you might want to add logic to these

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public String getTitle() {
        return title;
    }
}
