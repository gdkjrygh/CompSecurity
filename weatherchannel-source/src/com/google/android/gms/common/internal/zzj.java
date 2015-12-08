// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu

public final class zzj
    implements android.os.Handler.Callback
{
    public static interface zza
    {

        public abstract boolean isConnected();

        public abstract Bundle zzlM();
    }


    private final Handler mHandler;
    private final zza zzaaC;
    private final ArrayList zzaaD = new ArrayList();
    final ArrayList zzaaE = new ArrayList();
    private final ArrayList zzaaF = new ArrayList();
    private volatile boolean zzaaG;
    private final AtomicInteger zzaaH = new AtomicInteger(0);
    private boolean zzaaI;
    private final Object zzqt = new Object();

    public zzj(Looper looper, zza zza1)
    {
        zzaaG = false;
        zzaaI = false;
        zzaaC = zza1;
        mHandler = new Handler(looper, this);
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
            synchronized (zzqt)
            {
                if (zzaaG && zzaaC.isConnected() && zzaaD.contains(connectioncallbacks))
                {
                    connectioncallbacks.onConnected(zzaaC.zzlM());
                }
            }
            return true;
        } else
        {
            Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
            return false;
        }
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnectionCallbacksRegistered(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzu.zzu(connectioncallbacks);
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzaaD.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.zzu(onconnectionfailedlistener);
        boolean flag;
        synchronized (zzqt)
        {
            flag = zzaaF.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzu.zzu(connectioncallbacks);
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!zzaaD.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (zzaaC.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        zzaaD.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.zzu(onconnectionfailedlistener);
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (!zzaaF.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        zzaaF.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzu.zzu(connectioncallbacks);
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzaaD.remove(connectioncallbacks)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L4:
        return;
_L2:
        if (zzaaI)
        {
            zzaaE.add(connectioncallbacks);
        }
        if (true) goto _L4; else goto _L3
_L3:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzu.zzu(onconnectionfailedlistener);
        synchronized (zzqt)
        {
            if (!zzaaF.remove(onconnectionfailedlistener))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" not found").toString());
            }
        }
        return;
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void zzbu(int i)
    {
        mHandler.removeMessages(1);
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int j;
        zzaaI = true;
        obj1 = new ArrayList(zzaaD);
        j = zzaaH.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (zzaaG && zzaaH.get() == j) goto _L3; else goto _L2
_L2:
        zzaaE.clear();
        zzaaI = false;
        return;
_L3:
        if (zzaaD.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnectionSuspended(i);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzg(Bundle bundle)
    {
        boolean flag1 = true;
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        int i;
        boolean flag;
        if (!zzaaI)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        mHandler.removeMessages(1);
        zzaaI = true;
        if (zzaaE.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzU(flag);
        obj1 = new ArrayList(zzaaD);
        i = zzaaH.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (zzaaG && zzaaC.isConnected() && zzaaH.get() == i) goto _L3; else goto _L2
_L2:
        zzaaE.clear();
        zzaaI = false;
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!zzaaE.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnected(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public void zzh(ConnectionResult connectionresult)
    {
        mHandler.removeMessages(1);
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int i;
        obj1 = new ArrayList(zzaaF);
        i = zzaaH.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (obj1)).next();
        if (!zzaaG || zzaaH.get() != i)
        {
            return;
        }
        if (zzaaF.contains(onconnectionfailedlistener))
        {
            onconnectionfailedlistener.onConnectionFailed(connectionresult);
        }
        if (true) goto _L2; else goto _L1
_L1:
        connectionresult;
        obj;
        JVM INSTR monitorexit ;
        throw connectionresult;
        obj;
        JVM INSTR monitorexit ;
    }

    public void zznT()
    {
        zzaaG = false;
        zzaaH.incrementAndGet();
    }

    public void zznU()
    {
        zzaaG = true;
    }
}
