// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.Context;
import android.content.SharedPreferences;

public class n
{

    private String a;
    private String b;
    private final String c;
    private Context d;

    private n()
    {
        c = "MaskedUser";
        d = null;
    }

    public n(Context context)
    {
        c = "MaskedUser";
        d = null;
        d = context;
    }

    public void a(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public boolean a()
    {
        return b == null || a == null;
    }

    public void b()
    {
        SharedPreferences sharedpreferences = d.getSharedPreferences("user_masked_name", 0);
        a = sharedpreferences.getString("user_masked", null);
        b = sharedpreferences.getString("user_mashed", null);
    }

    public void c()
    {
        a = null;
        b = null;
        d();
    }

    public void d()
    {
        android.content.SharedPreferences.Editor editor = d.getSharedPreferences("user_masked_name", 0).edit();
        editor.putString("user_masked", a);
        editor.putString("user_mashed", b);
        editor.apply();
    }

    public String e()
    {
        return a;
    }
}
