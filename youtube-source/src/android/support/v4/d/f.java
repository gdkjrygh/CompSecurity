// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.d;

import android.net.ConnectivityManager;

// Referenced classes of package android.support.v4.d:
//            c

final class f
    implements c
{

    f()
    {
    }

    public final boolean a(ConnectivityManager connectivitymanager)
    {
        return connectivitymanager.isActiveNetworkMetered();
    }
}
