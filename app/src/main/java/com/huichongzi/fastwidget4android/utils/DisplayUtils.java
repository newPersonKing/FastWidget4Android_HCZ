package com.huichongzi.fastwidget4android.utils;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class DisplayUtils {

    private static float mDensity = 0;
    private static int mDensityDpi = 0;
    private static int mDensityW = 0;
    private static int mDensityH = 0;

    /**
     * 获取屏幕密度
     *
     * @param context
     * @return
     */
    public static float getDensity(Context context) {
        if (mDensity == 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            mDensity = displayMetrics.density;
        }
        return mDensity;
    }

    /**
     * 获取屏幕密度dpi
     *
     * @param context
     * @return
     */
    public static int getDensityDpi(Context context) {
        if(mDensityDpi == 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            mDensityDpi = displayMetrics.densityDpi;
        }
        return mDensityDpi;
    }


    /**
     * 获取屏幕宽度
     *
     * @param context
     * @return
     */
    public static int getDisplayW(Context context) {
        if(mDensityW == 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            mDensityW = displayMetrics.widthPixels;
        }
        return mDensityW;
    }

    /**
     * 获取屏幕高度
     *
     * @param context
     * @return
     */
    public static int getDisplayH(Context context) {
        if(mDensityH == 0) {
            WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            mDensityH = displayMetrics.heightPixels;
        }
        return mDensityH;
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        return (int) (dpValue * getDensity(context) + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        return (int) (pxValue / getDensity(context) + 0.5f);
    }

}
