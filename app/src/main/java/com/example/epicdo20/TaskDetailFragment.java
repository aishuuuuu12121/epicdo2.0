package com.example.epicdo20;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TaskDetailFragment extends Fragment {

    private EditText editTextTitle;
    private EditText editTextDescription;
    private Button saveButton;

    public TaskDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_task_detail, container, false);
        editTextTitle = view.findViewById(R.id.editTextTitle);
        editTextDescription = view.findViewById(R.id.editTextDescription);
        saveButton = view.findViewById(R.id.saveButton);

        saveButton.setOnClickListener(v -> {
            // Implement save logic here
        });

        return view;
    }
}
