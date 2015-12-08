// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzi

private static class zzaCP extends Handler
{

    private final LocationListener zzaCP;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
            return;

        case 1: // '\001'
            message = new Location((Location)message.obj);
            break;
        }
        zzaCP.onLocationChanged(message);
    }

    public (LocationListener locationlistener)
    {
        zzaCP = locationlistener;
    }

    public zzaCP(LocationListener locationlistener, Looper looper)
    {
        super(looper);
        zzaCP = locationlistener;
    }
}
