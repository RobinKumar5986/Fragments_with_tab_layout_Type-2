package com.example.haider.fragmentswithtablayouttype_2;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.haider.fragmentswithtablayouttype_2.Fragments.CallFragment;
import com.example.haider.fragmentswithtablayouttype_2.Fragments.ChatsFragment;
import com.example.haider.fragmentswithtablayouttype_2.Fragments.StatusFragment;
import com.google.android.material.tabs.TabLayout;

public class fragmentAdapter extends FragmentPagerAdapter {

    public fragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0)
            return new ChatsFragment();
        else if(position==1)
            return new StatusFragment();
        else
            return new CallFragment();
    }
    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0) return "Chats";
        else if(position==1) return "Status";
        else return  "Calls";
    }
}
