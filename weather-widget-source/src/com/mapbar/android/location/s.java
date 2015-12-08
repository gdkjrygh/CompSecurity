// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.content.Context;
import android.net.ConnectivityManager;

public final class s
{

    private static s b;
    ConnectivityManager a;
    private Context c;

    private s(Context context)
    {
        c = context;
        a = (ConnectivityManager)c.getSystemService("connectivity");
    }

    public static s a(Context context)
    {
        if (b == null)
        {
            b = new s(context);
        }
        return b;
    }
}
