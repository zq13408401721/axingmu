package com.example.myapplication.presenter.acivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.myapplication.R;
import com.example.myapplication.base.BaseActivity;
import com.example.myapplication.interfaces.IBasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
 *作者:SeeHeart 2019/10/12 15:43
 */
public class Activity_detail_activity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.activity_detail_applybtn)
    Button activityDetailApplybtn;
    @BindView(R.id.ll_activity)
    LinearLayout llActivity;
    private PopupWindow popupWindow;

    @Override
    protected IBasePresenter getPresenter() {
        return null;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_detail_activity;
    }

    @Override
    public void showError(String errorMsg) {

    }

    @Override
    protected void initView() {
        //初始化弹窗
        initPopupWindow();


    }

    /**
     * 初始化弹窗
     */
    private void initPopupWindow() {
        View view = LayoutInflater.from(this).inflate(R.layout.popupwindow_activity_detail, null);
        ImageView window_finish_iv = view.findViewById(R.id.window_finish_iv);
        Button window_apply_btn = view.findViewById(R.id.window_apply_btn);

        window_finish_iv.setOnClickListener(this);
        window_apply_btn.setOnClickListener(this);

        popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(true);

        //弹窗阴影
        winodwOutShadow(popupWindow);

    }

    /**
     * //弹窗监听关闭后背景透明度
     * @param popupWindow
     */
    private void winodwOutShadow(PopupWindow popupWindow) {

        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                WindowManager.LayoutParams lp = Activity_detail_activity.this.getWindow().getAttributes();
                lp.alpha = 1f;
                Activity_detail_activity.this.getWindow().setAttributes(lp);
            }
        });

    }

    @Override
    protected void initData() {

    }

    @OnClick(R.id.activity_detail_applybtn)
    public void onViewClicked(View view) {

        switch (view.getId()) {

            case R.id.activity_detail_applybtn://弹窗显示时背景透明度
                WindowManager.LayoutParams lp = Activity_detail_activity.this.getWindow().getAttributes();
                lp.alpha = 0.7f;
                Activity_detail_activity.this.getWindow().setAttributes(lp);
                popupWindow.showAtLocation(llActivity, Gravity.CENTER,0,0);
                break;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.window_finish_iv:
                popupWindow.dismiss();

                break;

            case R.id.window_apply_btn:

                break;

        }
    }

}
