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
        View view = inflater.inflate(R.layout.commodity,container,false);
//        Intent intent = new Intent(getActivity(),PicActivity.class);
//        startActivity(intent);
        myspinner = (Spinner)view.findViewById(R.id.spinner_1);
        myspinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String select_item=parent.getItemAtPosition(position).toString();
                switch (select_item){
                    case "纵向排序":
                        Toast.makeText(getActivity(),"已设置成纵向排列",Toast.LENGTH_SHORT).show();
                        break;
                    case "瀑布流":
                        Toast.makeText(getActivity(),"已设置成瀑布流排列",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }

        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FfourthViewModel.class);
        // TODO: Use the ViewModel
    }

}