// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.billing;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.jiubang.core.b.a;
import java.util.ArrayList;

public class o
{

    private Context a;
    private SharedPreferences b;
    private ArrayList c;

    public o(Context context)
    {
        a = context;
        b = GoWidgetApplication.c(a.getApplicationContext()).a();
        c = new ArrayList();
        c();
    }

    private void c()
    {
        if (!TextUtils.isEmpty("1#7"));
        String as[] = "1#7".split("#");
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s = as[i];
            c.add(Integer.valueOf(Integer.parseInt(s)));
        }

    }

    public boolean a()
    {
        return false;
    }

    public boolean b()
    {
        return c.contains(Integer.valueOf(7));
    }
}
