package com.example.xz.three;

import androidx.appcompat.widget.SearchView;
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
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xz.R;

public class FthreeFragment extends Fragment {

    private FthreeViewModel mViewModel;
    private SearchView search;
    private Button btn_clears;
    private TextView nums;
    private Spinner spinner;
    private ImageView image1,image2,image3,image4;
    public static FthreeFragment newInstance() {
        return new FthreeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_fthree, container, false);
        btn_clears=root.findViewById(R.id.clear_message);
        nums=root.findViewById(R.id.message_nums);
        search=root.findViewById(R.id.search);
        spinner=root.findViewById(R.id.spin);
        image1=root.findViewById(R.id.img_xing);
        image2=root.findViewById(R.id.img_doctor);
        initSpinner();
        btn_clears.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nums.setVisibility(view.GONE);
            }
        });
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DialogueActivity1.class);
                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),DialogueActivity2.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(), SearchActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }
    private void initSpinner() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String info = (String) spinner.getSelectedItem();
                Toast.makeText(getContext(), info, Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FthreeViewModel.class);
        // TODO: Use the ViewModel
    }

}