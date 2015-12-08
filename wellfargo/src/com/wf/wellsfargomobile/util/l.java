// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.i;

public class l
{

    public static void a(Activity activity)
    {
        Object obj = activity.getApplicationContext().getPackageName();
        String s = (new StringBuilder()).append("market://details?id=").append(((String) (obj))).toString();
        if ("Amazon Appstore for Android".equals(com.wf.wellsfargomobile.a.a.h()))
        {
            s = (new StringBuilder()).append("amzn://apps/android?p=").append(((String) (obj))).toString();
        }
        obj = new i();
        ((i) (obj)).a(s);
        ((i) (obj)).show(((AppCompatActivity)activity).getSupportFragmentManager(), "Open Url in Browser Confirmation");
    }
}
