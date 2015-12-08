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

    boolean zzOG;
    private final BlockingQueue zzOH = new LinkedBlockingQueue();

    public zza()
    {
        zzOG = false;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzOH.add(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }

    public IBinder zzkt()
        throws InterruptedException
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
        }
        if (zzOG)
        {
            throw new IllegalStateException();
        } else
        {
            zzOG = true;
            return (IBinder)zzOH.take();
        }
    }
}
