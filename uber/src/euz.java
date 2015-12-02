// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class euz
{

    private final gju a;
    private final SharedPreferences b;

    public euz(Context context, gju gju1)
    {
        b = context.getSharedPreferences(".payment_prefs", 0);
        a = gju1;
    }

    public final String a()
    {
        long l = b.getLong("alipay_code_expires_at", -1L);
        boolean flag;
        if (gju.a() > l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return null;
        } else
        {
            return b.getString("alipay_verification_code", null);
        }
    }

    public final void a(String s, long l)
    {
        long l1 = gju.a();
        b.edit().putString("alipay_verification_code", s).putLong("alipay_code_expires_at", l1 + l).apply();
    }
}
