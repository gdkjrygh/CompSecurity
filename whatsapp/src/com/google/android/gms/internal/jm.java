// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            qw, jx

public final class jm
{

    private final b MX;
    private final ArrayList MY = new ArrayList();
    final ArrayList MZ = new ArrayList();
    private boolean Na;
    private final ArrayList Nb = new ArrayList();
    private final Handler mHandler;

    public jm(Context context, Looper looper, b b1)
    {
        Na = false;
        MX = b1;
        mHandler = new a(looper);
    }

    static ArrayList a(jm jm1)
    {
        return jm1.MY;
    }

    static b b(jm jm1)
    {
        return jm1.MX;
    }

    public void aE(int i)
    {
        boolean flag;
        flag = qw.a;
        mHandler.removeMessages(1);
        ArrayList arraylist = MY;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        Na = true;
        iterator = (new ArrayList(MY)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (MX.gN()) goto _L3; else goto _L2
_L2:
        Na = false;
        return;
_L3:
        if (MY.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnectionSuspended(i);
        }
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        if (!flag) goto _L4; else goto _L2
    }

    public void b(ConnectionResult connectionresult)
    {
        boolean flag;
        flag = qw.a;
        mHandler.removeMessages(1);
        ArrayList arraylist = Nb;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator = (new ArrayList(Nb)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener;
        onconnectionfailedlistener = (com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener)iterator.next();
        if (!MX.gN())
        {
            return;
        }
        if (Nb.contains(onconnectionfailedlistener))
        {
            onconnectionfailedlistener.onConnectionFailed(connectionresult);
        }
          goto _L3
_L2:
        arraylist;
        JVM INSTR monitorexit ;
        return;
        connectionresult;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectionresult;
_L3:
        if (!flag) goto _L4; else goto _L2
    }

    protected void dU()
    {
        synchronized (MY)
        {
            f(MX.fX());
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void f(Bundle bundle)
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = qw.a;
        ArrayList arraylist = MY;
        arraylist;
        JVM INSTR monitorenter ;
        Iterator iterator;
        com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks;
        boolean flag;
        if (!Na)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        mHandler.removeMessages(1);
        Na = true;
        if (MZ.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        jx.K(flag);
        iterator = (new ArrayList(MY)).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        connectioncallbacks = (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)iterator.next();
        if (MX.gN() && MX.isConnected()) goto _L3; else goto _L2
_L2:
        MZ.clear();
        Na = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!MZ.contains(connectioncallbacks))
        {
            connectioncallbacks.onConnected(bundle);
        }
        continue; /* Loop/switch isn't completed */
        bundle;
        arraylist;
        JVM INSTR monitorexit ;
        throw bundle;
        if (!flag2) goto _L4; else goto _L2
    }

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        jx.i(connectioncallbacks);
        synchronized (MY)
        {
label0:
            {
                if (MY.contains(connectioncallbacks))
                {
                    Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(connectioncallbacks).append(" is already registered").toString());
                    if (!qw.a)
                    {
                        break label0;
                    }
                }
                MY.add(connectioncallbacks);
            }
        }
        if (MX.isConnected())
        {
            mHandler.sendMessage(mHandler.obtainMessage(1, connectioncallbacks));
        }
        return;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        jx.i(onconnectionfailedlistener);
        synchronized (Nb)
        {
label0:
            {
                if (Nb.contains(onconnectionfailedlistener))
                {
                    Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" is already registered").toString());
                    if (!qw.a)
                    {
                        break label0;
                    }
                }
                Nb.add(onconnectionfailedlistener);
            }
        }
        return;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    public void unregisterConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        jx.i(connectioncallbacks);
        synchronized (MY)
        {
label0:
            {
                if (MY == null)
                {
                    break label0;
                }
                if (!MY.remove(connectioncallbacks))
                {
                    Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(connectioncallbacks).append(" not found").toString());
                    if (!qw.a)
                    {
                        break label0;
                    }
                }
                if (Na)
                {
                    MZ.add(connectioncallbacks);
                }
            }
        }
        return;
        connectioncallbacks;
        arraylist;
        JVM INSTR monitorexit ;
        throw connectioncallbacks;
    }

    public void unregisterConnectionFailedListener(com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        jx.i(onconnectionfailedlistener);
        synchronized (Nb)
        {
            if (Nb != null && !Nb.remove(onconnectionfailedlistener))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(onconnectionfailedlistener).append(" not found").toString());
            }
        }
        return;
        onconnectionfailedlistener;
        arraylist;
        JVM INSTR monitorexit ;
        throw onconnectionfailedlistener;
    }

    private class a extends Handler
    {

        final jm Nc;

        public void handleMessage(Message message)
        {
            if (message.what == 1)
            {
                synchronized (jm.a(Nc))
                {
                    if (jm.b(Nc).gN() && jm.b(Nc).isConnected() && jm.a(Nc).contains(message.obj))
                    {
                        Bundle bundle = jm.b(Nc).fX();
                        ((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)message.obj).onConnected(bundle);
                    }
                }
                return;
            } else
            {
                Log.wtf("GmsClientEvents", "Don't know how to handle this message.");
                return;
            }
            message;
            arraylist;
            JVM INSTR monitorexit ;
            throw message;
        }

        public a(Looper looper)
        {
            Nc = jm.this;
            super(looper);
        }
    }


    private class b
    {

        public abstract Bundle fX();

        public abstract boolean gN();

        public abstract boolean isConnected();
    }

}
