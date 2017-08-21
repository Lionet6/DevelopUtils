package com.lionet.library.utils;

import android.os.SystemClock;
import android.view.View;

/**
 * 多击事件处理
 * Created by Administrator on 2017/1/19 0019.
 */

public class MulitClickUtil {

    /**
     * 多击事件监听
     *
     * @param view
     * @param num      次数
     * @param listener
     */
    public static void mulitClick(View view, final int num, final OnMulitClickListener listener) {
        final long[] mHits = new long[num];
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
                mHits[mHits.length - 1] = SystemClock.uptimeMillis();
                if (mHits[0] >= (SystemClock.uptimeMillis() - 250 * num)) {
                    listener.onClick(v);
                }
            }
        });
    }

    public interface OnMulitClickListener {
        public void onClick(View v);
    }

}
