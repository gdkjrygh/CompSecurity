// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import android.content.SharedPreferences;
import com.jiubang.commerce.ad.a.c;
import com.jiubang.commerce.utils.j;

public class ag
{

    private static ag c;
    private SharedPreferences a;
    private Context b;
    private long d;
    private String e;

    private ag(Context context)
    {
        if (context != null)
        {
            context = context.getApplicationContext();
        } else
        {
            context = null;
        }
        b = context;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = b.getSharedPreferences("ADSDK_SETTING", 4);
        } else
        {
            a = b.getSharedPreferences("ADSDK_SETTING", 0);
        }
        c();
    }

    public static ag a(Context context)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        com/jiubang/commerce/ad/e/ag;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = new ag(context);
        }
        com/jiubang/commerce/ad/e/ag;
        JVM INSTR monitorexit ;
_L2:
        return c;
        context;
        com/jiubang/commerce/ad/e/ag;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void c()
    {
        d = a.getLong("ADSDK_USER_TAG_UPDATE", 0L);
        e = a.getString("ADSDK_USER_TAG_STRING", null);
    }

    public c a()
    {
        c c1 = new c();
        c1.a(e);
        return c1;
    }

    public void a(long l)
    {
        if (j.a)
        {
            j.b("maple", (new StringBuilder()).append("AdSdkSetting.setLastUserTagUpdateTime:").append(l).toString());
        }
        d = l;
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putLong("ADSDK_USER_TAG_UPDATE", l);
        editor.commit();
    }

    public void a(String s)
    {
        e = s;
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("ADSDK_USER_TAG_STRING", s);
        editor.commit();
    }

    public void a(String s, long l)
    {
        a(s);
        a(l);
    }

    public long b()
    {
        if (j.a)
        {
            j.b("maple", (new StringBuilder()).append("AdSdkSetting.getLastUserTagUpdateTime:").append(d).toString());
        }
        return d;
    }
}
