// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Log;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbh

public class zzy
    implements zzbh
{

    private int zzMQ;

    public zzy()
    {
        zzMQ = 5;
    }

    public void e(String s)
    {
        if (zzMQ <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void setLogLevel(int i)
    {
        zzMQ = i;
    }

    public void v(String s)
    {
        if (zzMQ <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void zzaC(String s)
    {
        if (zzMQ <= 3)
        {
            Log.d("GoogleTagManager", s);
        }
    }

    public void zzaD(String s)
    {
        if (zzMQ <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void zzaE(String s)
    {
        if (zzMQ <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void zzb(String s, Throwable throwable)
    {
        if (zzMQ <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void zzd(String s, Throwable throwable)
    {
        if (zzMQ <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }
}
