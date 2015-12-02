// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

// Referenced classes of package com.google.android.gms.internal:
//            nc, nj, mz, ie

public class nk extends nc
{

    private final nj agX;
    private final mz agY;
    private final ie agZ;

    public nk(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2)
    {
        this(context, looper, s, connectioncallbacks, onconnectionfailedlistener, s1, s2, null);
    }

    public nk(Context context, Looper looper, String s, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String s1, String s2, 
            String s3)
    {
        super(context, looper, connectioncallbacks, onconnectionfailedlistener, s1);
        agX = new nj(context, Ee);
        agY = mz.a(context, s2, s3, Ee);
        agZ = ie.a(context, Ee);
    }

    public void a(LocationListener locationlistener)
    {
        agX.a(locationlistener);
    }

    public void a(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        synchronized (agX)
        {
            agX.a(locationrequest, locationlistener, looper);
        }
        return;
        locationrequest;
        nj1;
        JVM INSTR monitorexit ;
        throw locationrequest;
    }

    public void disconnect()
    {
        nj nj1 = agX;
        nj1;
        JVM INSTR monitorenter ;
        boolean flag = isConnected();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        agX.removeAllListeners();
        agX.nm();
_L1:
        super.disconnect();
        nj1;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", ((Throwable) (obj)));
          goto _L1
        obj;
        nj1;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public Location nl()
    {
        return agX.nl();
    }
}
