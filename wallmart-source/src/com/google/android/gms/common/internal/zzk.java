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
//            zzx

public final class zzk
    implements android.os.Handler.Callback
{
    public static interface zza
    {

        public abstract boolean isConnected();

        public abstract Bundle zzmw();
    }


    private final Handler mHandler;
    private final zza zzadM;
    private final ArrayList zzadN = new ArrayList();
    final ArrayList zzadO = new ArrayList();
    private final ArrayList zzadP = new ArrayList();
    private volatile boolean zzadQ;
    private final AtomicInteger zzadR = new AtomicInteger(0);
    private boolean zzadS;
    private final Object zzpc = new Object();

    public zzk(Looper looper, zza zza1)
    {
        zzadQ = false;
        zzadS = false;
        zzadM = zza1;
        mHandler = new Handler(looper, this);
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj;
            synchronized (zzpc)
            {
                if (zzadQ && zzadM.isConnected() && zzadN.contains(connectioncallbacks))
                {
                    connectioncallbacks.onConnected(zzadM.zzmw());
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
        zzx.zzv(connectioncallbacks);
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzadN.contains(connectioncallbacks);
        }
        return flag;
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public boolean isConnectionFailedListenerRegistered(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzx.zzv(onconnectionfailedlistener);
        boolean flag;
        synchronized (zzpc)
        {
            flag = zzadP.contains(onconnectionfailedlistener);
        }
        return flag;
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzx.zzv(connectioncallbacks);
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzadN.contains(connectioncallbacks))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
_L2:
        if (zzadM.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        zzadN.add(connectioncallbacks);
        if (true) goto _L2; else goto _L1
_L1:
        connectioncallbacks;
        obj;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzx.zzv(onconnectionfailedlistener);
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzadP.contains(onconnectionfailedlistener))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
_L2:
        return;
        zzadP.add(onconnectionfailedlistener);
        if (true) goto _L2; else goto _L1
_L1:
        onconnectionfailedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        zzx.zzv(connectioncallbacks);
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzadN.remove(connectioncallbacks)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
_L4:
        return;
_L2:
        if (zzadS)
        {
            zzadO.add(connectioncallbacks);
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
        zzx.zzv(onconnectionfailedlistener);
        synchronized (zzpc)
        {
            if (!zzadP.remove(onconnectionfailedlistener))
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

    public void zzbB(int i)
    {
        boolean flag = false;
        if (Looper.myLooper() == mHandler.getLooper())
        {
            flag = true;
        }
        zzx.zza(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        mHandler.removeMessages(1);
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int j;
        zzadS = true;
        obj1 = new ArrayList(zzadN);
        j = zzadR.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (zzadQ && zzadR.get() == j) goto _L3; else goto _L2
_L2:
        zzadO.clear();
        zzadS = false;
        return;
_L3:
        if (zzadN.contains(connectioncallbacks))
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

    public void zzh(Bundle bundle)
    {
        boolean flag;
        boolean flag1 = true;
        Object obj;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        int i;
        if (Looper.myLooper() == mHandler.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (!zzadS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzY(flag);
        mHandler.removeMessages(1);
        zzadS = true;
        if (zzadO.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzx.zzY(flag);
        obj1 = new ArrayList(zzadN);
        i = zzadR.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)((Iterator) (obj1)).next();
        if (zzadQ && zzadM.isConnected() && zzadR.get() == i) goto _L3; else goto _L2
_L2:
        zzadO.clear();
        zzadS = false;
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!zzadO.contains(connectioncallbacks))
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

    public void zzj(ConnectionResult connectionresult)
    {
        Object obj;
        Object obj1;
        com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener;
        int i;
        boolean flag;
        if (Looper.myLooper() == mHandler.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "onConnectionFailure must only be called on the Handler thread");
        mHandler.removeMessages(1);
        obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(zzadP);
        i = zzadR.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_134;
        }
        onconnectionfailedlistener = (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)((Iterator) (obj1)).next();
        if (!zzadQ || zzadR.get() != i)
        {
            return;
        }
        if (zzadP.contains(onconnectionfailedlistener))
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

    public void zzoI()
    {
        zzadQ = false;
        zzadR.incrementAndGet();
    }

    public void zzoJ()
    {
        zzadQ = true;
    }
}
