// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class zza
    implements ServiceConnection
{

    boolean zzYg;
    private final BlockingQueue zzYh = new LinkedBlockingQueue();

    public zza()
    {
        zzYg = false;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzYh.add(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }

    public IBinder zzmS()
        throws InterruptedException
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        }
        if (zzYg)
        {
            throw new IllegalStateException();
        } else
        {
            zzYg = true;
            return (IBinder)zzYh.take();
        }
    }
}
