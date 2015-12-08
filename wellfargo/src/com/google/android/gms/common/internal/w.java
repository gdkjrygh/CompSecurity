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
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            au, x

public final class w
    implements android.os.Handler.Callback
{

    final ArrayList a = new ArrayList();
    private final x b;
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private volatile boolean e;
    private final AtomicInteger f = new AtomicInteger(0);
    private boolean g;
    private final Handler h;
    private final Object i = new Object();

    public w(Looper looper, x x1)
    {
        e = false;
        g = false;
        b = x1;
        h = new Handler(looper, this);
    }

    public void a()
    {
        e = false;
        f.incrementAndGet();
    }

    public void a(int j)
    {
        boolean flag = false;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        }
        au.a(flag, "onUnintentionalDisconnection must only be called on the Handler thread");
        h.removeMessages(1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        int k;
        g = true;
        obj1 = new ArrayList(c);
        k = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        q q1 = (q)((Iterator) (obj1)).next();
        if (e && f.get() == k) goto _L3; else goto _L2
_L2:
        a.clear();
        g = false;
        return;
_L3:
        if (c.contains(q1))
        {
            q1.a(j);
        }
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(Bundle bundle)
    {
        boolean flag;
        boolean flag1 = true;
        Object obj;
        Object obj1;
        q q1;
        int j;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "onConnectionSuccess must only be called on the Handler thread");
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag);
        h.removeMessages(1);
        g = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        au.a(flag);
        obj1 = new ArrayList(c);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L2; else goto _L1
_L1:
        q1 = (q)((Iterator) (obj1)).next();
        if (e && b.b() && f.get() == j) goto _L3; else goto _L2
_L2:
        a.clear();
        g = false;
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (!a.contains(q1))
        {
            q1.a(bundle);
        }
        if (true) goto _L5; else goto _L4
_L4:
        bundle;
        obj;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    public void a(ConnectionResult connectionresult)
    {
        Object obj;
        Object obj1;
        r r1;
        int j;
        boolean flag;
        if (Looper.myLooper() == h.getLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.a(flag, "onConnectionFailure must only be called on the Handler thread");
        h.removeMessages(1);
        obj = i;
        obj;
        JVM INSTR monitorenter ;
        obj1 = new ArrayList(d);
        j = f.get();
        obj1 = ((ArrayList) (obj1)).iterator();
_L2:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_134;
        }
        r1 = (r)((Iterator) (obj1)).next();
        if (!e || f.get() != j)
        {
            return;
        }
        if (d.contains(r1))
        {
            r1.a(connectionresult);
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

    public void a(q q1)
    {
        au.a(q1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!c.contains(q1))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionCallbacks(): listener ").append(q1).append(" is already registered").toString());
_L2:
        if (b.b())
        {
            h.sendMessage(h.obtainMessage(1, q1));
        }
        return;
        c.add(q1);
        if (true) goto _L2; else goto _L1
_L1:
        q1;
        obj;
        JVM INSTR monitorexit ;
        throw q1;
    }

    public void a(r r1)
    {
        au.a(r1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (!d.contains(r1))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        Log.w("GmsClientEvents", (new StringBuilder()).append("registerConnectionFailedListener(): listener ").append(r1).append(" is already registered").toString());
_L2:
        return;
        d.add(r1);
        if (true) goto _L2; else goto _L1
_L1:
        r1;
        obj;
        JVM INSTR monitorexit ;
        throw r1;
    }

    public void b()
    {
        e = true;
    }

    public void b(q q1)
    {
        au.a(q1);
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (c.remove(q1)) goto _L2; else goto _L1
_L1:
        Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionCallbacks(): listener ").append(q1).append(" not found").toString());
_L4:
        return;
_L2:
        if (g)
        {
            a.add(q1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        q1;
        obj;
        JVM INSTR monitorexit ;
        throw q1;
    }

    public void b(r r1)
    {
        au.a(r1);
        synchronized (i)
        {
            if (!d.remove(r1))
            {
                Log.w("GmsClientEvents", (new StringBuilder()).append("unregisterConnectionFailedListener(): listener ").append(r1).append(" not found").toString());
            }
        }
        return;
        r1;
        obj;
        JVM INSTR monitorexit ;
        throw r1;
    }

    public boolean handleMessage(Message message)
    {
        if (message.what == 1)
        {
            q q1 = (q)message.obj;
            synchronized (i)
            {
                if (e && b.b() && c.contains(q1))
                {
                    q1.a(b.a_());
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
}
