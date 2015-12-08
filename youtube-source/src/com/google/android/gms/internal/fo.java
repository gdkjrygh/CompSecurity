// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            fp, gi, fq

public final class fo
{

    final ArrayList a = new ArrayList();
    private final fq b;
    private ArrayList c;
    private boolean d;
    private ArrayList e;
    private final Handler f;
    private boolean g;

    fo(fq fq1, Handler handler)
    {
        d = false;
        g = false;
        handler = new fp(this, Looper.getMainLooper());
        c = new ArrayList();
        e = new ArrayList();
        b = fq1;
        f = handler;
    }

    static ArrayList a(fo fo1)
    {
        return fo1.c;
    }

    static fq b(fo fo1)
    {
        return fo1.b;
    }

    protected final void a()
    {
        boolean flag1 = true;
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        Object obj = b;
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        ArrayList arraylist1;
        Exception exception1;
        int i;
        int j;
        boolean flag;
        if (!d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.gi.a(flag);
        f.removeMessages(1);
        d = true;
        if (a.size() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.gi.a(flag);
        arraylist1 = c;
        j = arraylist1.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        if (b.k() && b.e())
        {
            a.size();
            if (!a.contains(arraylist1.get(i)))
            {
                ((b)arraylist1.get(i)).a(null);
            }
            break MISSING_BLOCK_LABEL_183;
        }
        a.clear();
        d = false;
        obj;
        JVM INSTR monitorexit ;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(int i)
    {
        f.removeMessages(1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int j;
        d = true;
        arraylist1 = c;
        j = arraylist1.size();
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (b.k())
        {
            if (c.contains(arraylist1.get(i)))
            {
                ((b)arraylist1.get(i)).a();
            }
            break MISSING_BLOCK_LABEL_95;
        }
        d = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(a a1)
    {
        f.removeMessages(1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int j;
        g = true;
        arraylist1 = e;
        j = arraylist1.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (b.k())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (e.contains(arraylist1.get(i)))
        {
            ((d)arraylist1.get(i)).a(a1);
        }
        break MISSING_BLOCK_LABEL_103;
        g = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        a1;
        arraylist;
        JVM INSTR monitorexit ;
        throw a1;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(b b1)
    {
        com.google.android.gms.internal.gi.a(b1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (!c.contains(b1))
        {
            break MISSING_BLOCK_LABEL_82;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionCallbacks(): listener ")).append(b1).append(" is already registered").toString());
_L2:
        if (b.e())
        {
            f.sendMessage(f.obtainMessage(1, b1));
        }
        return;
        if (d)
        {
            c = new ArrayList(c);
        }
        c.add(b1);
        if (true) goto _L2; else goto _L1
_L1:
        b1;
        throw b1;
    }

    public final void a(d d1)
    {
        com.google.android.gms.internal.gi.a(d1);
        ArrayList arraylist = e;
        arraylist;
        JVM INSTR monitorenter ;
        if (!e.contains(d1))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        Log.w("GmsClientEvents", (new StringBuilder("registerConnectionFailedListener(): listener ")).append(d1).append(" is already registered").toString());
_L2:
        return;
        if (g)
        {
            e = new ArrayList(e);
        }
        e.add(d1);
        if (true) goto _L2; else goto _L1
_L1:
        d1;
        throw d1;
    }

    public final void b(b b1)
    {
        com.google.android.gms.internal.gi.a(b1);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        if (d)
        {
            c = new ArrayList(c);
        }
        if (c.remove(b1)) goto _L4; else goto _L3
_L3:
        Log.w("GmsClientEvents", (new StringBuilder("unregisterConnectionCallbacks(): listener ")).append(b1).append(" not found").toString());
_L2:
        return;
_L4:
        if (d && !a.contains(b1))
        {
            a.add(b1);
        }
        if (true) goto _L2; else goto _L5
_L5:
        b1;
        throw b1;
    }
}
