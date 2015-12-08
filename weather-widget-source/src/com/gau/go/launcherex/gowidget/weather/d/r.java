// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.d;

import android.content.Context;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.statistics.w;

public class r
{

    public static String a(Context context)
    {
        context = w.d(context);
        if (TextUtils.isEmpty(context))
        {
            throw new Exception("\u83B7\u53D6\u4E0D\u5230\u8BBE\u5907IMEI");
        } else
        {
            return context;
        }
    }
}
