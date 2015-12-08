// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import com.readystatesoftware.systembartint.SystemBarTintManager;

public class SystemBarTintHelper
{

    public SystemBarTintHelper()
    {
    }

    public static void enableTint(Activity activity)
    {
        SystemBarTintManager systembartintmanager = new SystemBarTintManager(activity);
        systembartintmanager.setStatusBarTintEnabled(true);
        systembartintmanager.setStatusBarTintColor(activity.getResources().getColor(com.walmartlabs.android.photo.R.color.actionbar_bg_top));
        activity.getWindow().setBackgroundDrawable(null);
        if (activity instanceof AppCompatActivity)
        {
            ((AppCompatActivity)activity).getSupportActionBar().setBackgroundDrawable(activity.getResources().getDrawable(com.walmartlabs.android.photo.R.drawable.actionbar_bg));
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            activity.getActionBar().setBackgroundDrawable(activity.getResources().getDrawable(com.walmartlabs.android.photo.R.drawable.actionbar_bg));
            return;
        }
    }
}
