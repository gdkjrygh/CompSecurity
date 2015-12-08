// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import com.readystatesoftware.systembartint.SystemBarTintManager;
import com.uservoice.uservoicesdk.integration.IntegrationProvider;
import com.walmart.android.utils.ViewUtil;

public class UserVoiceIntegrationProvider
    implements IntegrationProvider
{

    public UserVoiceIntegrationProvider()
    {
    }

    public String getAnonymousEmail(Context context)
    {
        return context.getString(0x7f090120);
    }

    public int getListSelector()
    {
        return 0x7f0200dd;
    }

    public ViewGroup initAndGetViewLayout(AppCompatActivity appcompatactivity)
    {
        Object obj = new SystemBarTintManager(appcompatactivity);
        ((SystemBarTintManager) (obj)).setStatusBarTintEnabled(true);
        ((SystemBarTintManager) (obj)).setStatusBarTintColor(appcompatactivity.getResources().getColor(0x7f0f0006));
        obj = appcompatactivity.getSupportActionBar();
        ((ActionBar) (obj)).setBackgroundDrawable(appcompatactivity.getResources().getDrawable(0x7f02003c));
        ((ActionBar) (obj)).setIcon(0x7f020040);
        return (ViewGroup)ViewUtil.inflate(appcompatactivity, 0x7f0401c2);
    }
}
