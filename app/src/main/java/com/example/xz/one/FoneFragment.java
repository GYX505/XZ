package com.example.xz.one;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.xz.R;

public class FoneFragment extends Fragment {

    private FoneViewModel mViewModel;
    private EditText gyx_serch;

    public static FoneFragment newInstance() {
        return new FoneFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //在这里写Java代码，包括跳转等，foneviewmodel用不到，不用管，其余同理
        View root=inflater.inflate(R.layout.fragment_fone, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FoneViewModel.class);
        // TODO: Use the ViewModel
    }

}