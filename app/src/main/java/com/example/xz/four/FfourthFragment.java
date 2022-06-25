package com.example.xz.four;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.xz.R;

public class FfourthFragment extends Fragment {
    private Spinner myspinner;
    private FfourthViewModel mViewModel;

    public static FfourthFragment newInstance() {
        return new FfourthFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ffourth,container,false);
//        Intent intent = new Intent(getActivity(),PicActivity.class);
//        startActivity(intent);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FfourthViewModel.class);
        // TODO: Use the ViewModel
    }

}