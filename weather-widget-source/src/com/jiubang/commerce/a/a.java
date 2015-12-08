// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.a;

import android.content.Context;
import android.content.SharedPreferences;

public final class a
{

    private SharedPreferences a;
    private android.content.SharedPreferences.Editor b;

    public a(Context context, String s, int i)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        a = context.getSharedPreferences(s, i);
        b = a.edit();
        return;
        context;
        context.printStackTrace();
        return;
    }

    public String a(String s, String s1)
    {
        String s2 = s1;
        if (a != null)
        {
            s2 = a.getString(s, s1);
        }
        return s2;
    }

    public boolean a()
    {
        return a(true);
    }

    public boolean a(boolean flag)
    {
        if (b == null)
        {
            return false;
        }
        if (android.os.Build.VERSION.SDK_INT >= 9 && flag)
        {
            b.apply();
            return true;
        } else
        {
            return b.commit();
        }
    }

    public void b(String s, String s1)
    {
        if (b != null)
        {
            b.putString(s, s1);
        }
    }
}
