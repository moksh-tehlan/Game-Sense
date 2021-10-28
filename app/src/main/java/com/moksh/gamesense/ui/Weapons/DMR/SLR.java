package com.moksh.gamesense.ui.Weapons.DMR;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.moksh.gamesense.R;
import com.moksh.gamesense.ui.Weapons.CustomProgressBar;

public class SLR extends Fragment {

    FrameLayout slr;
    CustomProgressBar cb;
    public SLR() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slr,container,false);
        slr = view.findViewById(R.id.slr);

        String url_to_image = "https://opgg-pubg-static.akamaized.net/images/meta/WeapFNFal.png?image=w_500%2Ce_trim%2Fe_outline%3Aouter%3A8%3A0%2Fe_outline%3Aouter%3A3%3A1000%2Cco_rgb%3A00000080%2Fw_500%2Ch_500%2Cc_pad&v=2";
        View view1 = inflater.inflate(R.layout.sample_layout_guns,null);
        cb = new CustomProgressBar();
        cb.prog(view1,58,0.1, 840,3.683,500,20000, "SLR", "DMR", "7.62", "Single", "All", url_to_image,this.getContext(), false);
        slr.addView(view1);
        return view;
    }
}