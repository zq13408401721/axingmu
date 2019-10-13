package com.example.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.myapplication.R;
import com.example.myapplication.adaper.NeighborhoodRec_Adapter;
import com.example.myapplication.base.BaseFragment;
import com.example.myapplication.fragment.neighbor.ContactsActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class Neighborhood_Fragment extends BaseFragment {

    @BindView(R.id.neighbor_rec)
    RecyclerView neighborRec;
    Unbinder unbinder;
    @BindView(R.id.address_secrecy)
    ImageView addressSecrecy;
    @BindView(R.id.address_more)
    ImageView addressMore;
    Unbinder unbinder1;


    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_neighborhood_;
    }

    @Override
    protected void initView() {
        super.initView();
        neighborRec.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add("asd");
        }
        NeighborhoodRec_Adapter neighborhoodRec_adapter = new NeighborhoodRec_Adapter(strings);
        neighborRec.setAdapter(neighborhoodRec_adapter);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }

    @OnClick({R.id.address_secrecy, R.id.address_more})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.address_secrecy:
                break;
            case R.id.address_more:
                Intent intent = new Intent(getContext(), ContactsActivity.class);

                startActivity(intent);

                break;
        }
    }
}
