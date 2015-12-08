// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;

import android.content.pm.PackageManager;

// Referenced classes of package com.google.android.apps.analytics:
//            w

final class f
    implements w
{

    private final PackageManager a;
    private long b;
    private boolean c;
    private final String d = "com.google.analytics.optout";
    private final long e = 0x493e0L;

    f(PackageManager packagemanager)
    {
        a = packagemanager;
        c = false;
    }

    public final boolean a()
    {
        long l = System.currentTimeMillis();
        if (l > b + e)
        {
            try
            {
                a.getPackageInfo(d, 0);
                c = true;
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
            {
                c = false;
            }
            b = l;
        }
        return c;
    }
}
