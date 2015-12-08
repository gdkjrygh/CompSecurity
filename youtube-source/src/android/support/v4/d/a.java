// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;

import android.net.ConnectivityManager;

// Referenced classes of package android.support.v4.d:
//            f, e, d, b, 
//            c

public final class a
{

    private static final c a;

    public static boolean a(ConnectivityManager connectivitymanager)
    {
        return a.a(connectivitymanager);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new f();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            a = new e();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a = new d();
        } else
        {
            a = new b();
        }
    }
}
