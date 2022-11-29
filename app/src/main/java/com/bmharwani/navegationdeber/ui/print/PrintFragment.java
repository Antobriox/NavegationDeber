package com.bmharwani.navegationdeber.ui.print;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.bmharwani.navegationdeber.databinding.FragmentPrintBinding;


public class PrintFragment extends Fragment {
    private FragmentPrintBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
       PrintViewModel printViewModel =
                new ViewModelProvider(this).get(PrintViewModel.class);

        binding = FragmentPrintBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPrint;
        printViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

