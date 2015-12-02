// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class nb
{

    private final String a;

    public nb(String s)
    {
        a = s;
    }

    public static String a()
    {
        ot.e();
        return ajc.b();
    }

    public final boolean a(String s, Intent intent)
    {
        if (s != null && intent != null)
        {
            ot.n();
            String s1 = mz.b(intent);
            ot.n();
            intent = mz.c(intent);
            if (s1 != null && intent != null)
            {
                ot.n();
                if (!s.equals(mz.a(s1)))
                {
                    of.e("Developer payload not match.");
                    return false;
                }
                if (a != null && !nc.a(a, s1, intent))
                {
                    of.e("Fail to verify signature.");
                    return false;
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }
}
