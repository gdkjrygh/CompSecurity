// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.d;

import android.content.Context;
import android.content.SharedPreferences;

public class a
{

    private final String a = "HCESharedPrefUtil";
    private final String b = "HceWalletConstSharedPref";
    private Context c;
    private SharedPreferences d;

    public a(Context context)
    {
        d = null;
        c = context;
    }

    public String a(String s)
    {
        d = c.getSharedPreferences("HceWalletConstSharedPref", 0);
        return d.getString(s, "");
    }

    public void a(String s, String s1)
    {
        if (s1 != null)
        {
            d = c.getSharedPreferences("HceWalletConstSharedPref", 0);
            android.content.SharedPreferences.Editor editor = d.edit();
            editor.putString(s, s1);
            editor.apply();
        }
    }
}
