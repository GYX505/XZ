package com.example.xz;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.xz.Adapters.Pagerdapter;
import com.example.xz.five.FfirthFragment;
import com.example.xz.four.FfourthFragment;
import com.example.xz.one.FoneFragment;
import com.example.xz.three.FthreeFragment;
import com.example.xz.two.FtwoFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class BaseActivity extends AppCompatActivity {
    private TabLayout myTab;
    private ViewPager2 myPager2;
    List<String> titles=new ArrayList<>();
    List<Integer> icons=new ArrayList<>();
    List<Fragment> fragments=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //去掉导航栏
        getSupportActionBar().hide();
        setContentView(R.layout.activity_base);
        // 隐藏状态栏
//       getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Init();//加载数据
    }

    private void Init() {
        myTab = findViewById(R.id.tab2);
        myPager2 = findViewById(R.id.viewpager2);

        //添加标题
        titles.add("首页");
        titles.add("发布");
        titles.add("消息");
        titles.add("书店");
        titles.add("个人");

        icons.add(R.drawable.home);
        icons.add(R.drawable.fabu);
        icons.add(R.drawable.message);
        icons.add(R.drawable.shoppingcenter);
        icons.add(R.drawable.personal);
        //添加Fragment进去
        fragments.add(new FoneFragment());
        fragments.add(new FtwoFragment());
        fragments.add(new FthreeFragment());
        fragments.add(new FfourthFragment());
        fragments.add(new FfirthFragment());

        myTab.setTabMode(TabLayout.MODE_FIXED);

        //实例化适配器
        Pagerdapter pagerdapter=new Pagerdapter(getSupportFragmentManager(),getLifecycle(),fragments);

        //设置适配器
        myPager2.setAdapter(pagerdapter);
        //TabLayout和Viewpager2进行关联
        new TabLayoutMediator(myTab, myPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(titles.get(position));
                tab.setIcon(icons.get(position));
            }
        }).attach();
    }
}