// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.app.offline.sync:
//            a

public class OfflineSyncService extends Service
{

    private static a a = null;

    public OfflineSyncService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        L.c("PUDL binding sync adapter");
        return a.getSyncAdapterBinder();
    }

    public void onCreate()
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            L.e("PUDL creating sync service for the 1st time");
            a = new a(getApplicationContext(), true);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
