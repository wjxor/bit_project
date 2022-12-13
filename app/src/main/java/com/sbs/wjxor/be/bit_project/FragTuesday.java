package com.sbs.wjxor.be.bit_project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragTuesday extends Fragment {
    private View view;

    public static FragTuesday newInstance() {
        FragTuesday frag_tuesday = new FragTuesday();
        return frag_tuesday;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_tuesday, container, false);

        return view;
    }
}
