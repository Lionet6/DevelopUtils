package com.lionet.library.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.lionet.library.utils.WindowUtil;


/**
 * 虚拟状态栏
 * Created by Administrator on 2017/2/12.
 */
public class StatusBarView extends View {

    private Context context;

    public StatusBarView(Context context) {
        super(context);
        this.context = context;
    }

    public StatusBarView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public StatusBarView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //设置宽度为整个屏幕的宽度，高度为状态栏高度
        setMeasuredDimension(WindowUtil.getWindowWidth(context), WindowUtil.getStatusBarHeight(context));
    }


}