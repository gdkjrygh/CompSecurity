// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            b

public final class a
{

    private boolean a;

    public a()
    {
        boolean flag;
        if (Class.forName("com.google.ads.AdRequest") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            a = flag;
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            a = false;
        }
        return;
    }

    final int a()
    {
        if (!a)
        {
            return 0;
        } else
        {
            return b.a().b();
        }
    }
}
