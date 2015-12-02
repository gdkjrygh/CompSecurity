// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal:
//            nc

class agV extends Handler
{

    private final LocationListener agV;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 33;
           goto _L1 _L2
_L1:
        Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
_L3:
        return;
_L2:
        message = new Location((Location)message.obj);
        agV.onLocationChanged(message);
        if (nc.a == 0) goto _L3; else goto _L1
    }

    public ionListener(LocationListener locationlistener)
    {
        agV = locationlistener;
    }

    public ionListener(LocationListener locationlistener, Looper looper)
    {
        super(looper);
        agV = locationlistener;
    }
}
