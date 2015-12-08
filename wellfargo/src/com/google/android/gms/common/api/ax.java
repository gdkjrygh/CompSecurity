// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.android.gms.common.api:
//            n, ay, az, ba, 
//            bc, aw, q, r, 
//            a, g, bb, k, 
//            af, bg, Status, bh, 
//            h, ag, ai, bj, 
//            be, bf, i, bd

final class ax
    implements n
{

    private final x A = new ba(this);
    final w a;
    final Queue b = new LinkedList();
    BroadcastReceiver c;
    final Map d = new HashMap();
    final Map e = new HashMap();
    Set f;
    final h g;
    final Map h = new HashMap();
    final g i;
    final Set j = Collections.newSetFromMap(new ConcurrentHashMap(16, 0.75F, 2));
    private final Lock k = new ReentrantLock();
    private final Condition l;
    private final int m;
    private final int n;
    private final Context o;
    private final Looper p;
    private volatile boolean q;
    private long r;
    private long s;
    private final bc t;
    private final b u;
    private volatile bh v;
    private ConnectionResult w;
    private final Set x = Collections.newSetFromMap(new WeakHashMap());
    private final bf y = new ay(this);
    private final q z = new az(this);

    public ax(Context context, Looper looper, h h1, b b1, g g1, Map map, ArrayList arraylist, 
            ArrayList arraylist1, int i1, int j1)
    {
        r = 0x1d4c0L;
        s = 5000L;
        f = new HashSet();
        w = null;
        o = context;
        a = new w(looper, A);
        p = looper;
        t = new bc(this, looper);
        u = b1;
        m = i1;
        n = j1;
        l = k.newCondition();
        v = new aw(this);
        for (b1 = arraylist.iterator(); b1.hasNext(); a.a(arraylist))
        {
            arraylist = (q)b1.next();
        }

        for (b1 = arraylist1.iterator(); b1.hasNext(); a.a(arraylist))
        {
            arraylist = (r)b1.next();
        }

        arraylist = h1.f();
        arraylist1 = map.keySet().iterator();
        while (arraylist1.hasNext()) 
        {
            a a1 = (a)arraylist1.next();
            b1 = ((b) (map.get(a1)));
            if (arraylist.get(a1) != null)
            {
                if (((i)arraylist.get(a1)).b)
                {
                    i1 = 1;
                } else
                {
                    i1 = 2;
                }
            } else
            {
                i1 = 0;
            }
            h.put(a1, Integer.valueOf(i1));
            if (a1.d())
            {
                b1 = a(a1.b(), b1, context, looper, h1, z, a(a1, i1));
            } else
            {
                b1 = a(a1.a(), b1, context, looper, h1, z, a(a1, i1));
            }
            d.put(a1.c(), b1);
        }
        g = h1;
        i = g1;
    }

    private static com.google.android.gms.common.api.h a(g g1, Object obj, Context context, Looper looper, h h1, q q1, r r1)
    {
        return g1.a(context, looper, h1, obj, q1, r1);
    }

    private final r a(a a1, int i1)
    {
        return new bb(this, a1, i1);
    }

    private static c a(k k1, Object obj, Context context, Looper looper, h h1, q q1, r r1)
    {
        return new c(context, looper, k1.a(), q1, r1, h1, k1.a(obj));
    }

    static Lock a(ax ax1)
    {
        return ax1.k;
    }

    static bh b(ax ax1)
    {
        return ax1.v;
    }

    static void c(ax ax1)
    {
        ax1.n();
    }

    static void d(ax ax1)
    {
        ax1.o();
    }

    private void n()
    {
        k.lock();
        if (j())
        {
            b();
        }
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    private void o()
    {
        k.lock();
        if (l())
        {
            b();
        }
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public Looper a()
    {
        return p;
    }

    public af a(af af1)
    {
        bg bg1;
        boolean flag;
        if (af1.d() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        au.b(flag, "This task can not be executed (it's probably a Batch or malformed)");
        k.lock();
        if (!j())
        {
            break MISSING_BLOCK_LABEL_113;
        }
        b.add(af1);
        for (; !b.isEmpty(); bg1.c(com.google.android.gms.common.api.Status.c))
        {
            bg1 = (bg)b.remove();
            a(bg1);
        }

        break MISSING_BLOCK_LABEL_102;
        af1;
        k.unlock();
        throw af1;
        k.unlock();
        return af1;
        af1 = v.a(af1);
        k.unlock();
        return af1;
    }

    public com.google.android.gms.common.api.h a(com.google.android.gms.common.api.i i1)
    {
        i1 = (com.google.android.gms.common.api.h)d.get(i1);
        au.a(i1, "Appropriate Api was not requested.");
        return i1;
    }

    void a(ConnectionResult connectionresult)
    {
        k.lock();
        w = connectionresult;
        v = new aw(this);
        v.a();
        l.signalAll();
        k.unlock();
        return;
        connectionresult;
        k.unlock();
        throw connectionresult;
    }

    void a(bd bd)
    {
        bd = t.obtainMessage(3, bd);
        t.sendMessage(bd);
    }

    void a(bg bg1)
    {
        j.add(bg1);
        bg1.a(y);
    }

    public void a(q q1)
    {
        a.a(q1);
    }

    public void a(r r1)
    {
        a.a(r1);
    }

    void a(RuntimeException runtimeexception)
    {
        runtimeexception = t.obtainMessage(4, runtimeexception);
        t.sendMessage(runtimeexception);
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.append(s1).append("mState=").append(v.d());
        printwriter.append(" mResuming=").print(q);
        printwriter.append(" mWorkQueue.size()=").print(b.size());
        printwriter.append(" mUnconsumedRunners.size()=").println(j.size());
        String s2 = (new StringBuilder()).append(s1).append("  ").toString();
        a a1;
        for (Iterator iterator = h.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.h)d.get(a1.c())).a(s2, filedescriptor, printwriter, as))
        {
            a1 = (a)iterator.next();
            printwriter.append(s1).append(a1.e()).println(":");
        }

    }

    public void b()
    {
        k.lock();
        v.c();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public void b(q q1)
    {
        a.b(q1);
    }

    public void b(r r1)
    {
        a.b(r1);
    }

    public void c()
    {
        k.lock();
        l();
        v.b();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    public boolean d()
    {
        return v instanceof ag;
    }

    public boolean e()
    {
        return v instanceof ai;
    }

    void f()
    {
        bg bg1;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); bg1.b())
        {
            bg1 = (bg)iterator.next();
            bg1.a(null);
        }

        j.clear();
        for (Iterator iterator1 = x.iterator(); iterator1.hasNext(); ((bj)iterator1.next()).a()) { }
        x.clear();
    }

    void g()
    {
        for (Iterator iterator = d.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.h)iterator.next()).a()) { }
    }

    void h()
    {
        k.lock();
        v = new ai(this, g, h, u, i, k, o);
        v.a();
        l.signalAll();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    void i()
    {
        k.lock();
        l();
        v = new ag(this);
        v.a();
        l.signalAll();
        k.unlock();
        return;
        Exception exception;
        exception;
        k.unlock();
        throw exception;
    }

    boolean j()
    {
        return q;
    }

    void k()
    {
        if (j())
        {
            return;
        }
        q = true;
        if (c == null)
        {
            c = new be(this);
            IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
            intentfilter.addDataScheme("package");
            o.getApplicationContext().registerReceiver(c, intentfilter);
        }
        t.sendMessageDelayed(t.obtainMessage(1), r);
        t.sendMessageDelayed(t.obtainMessage(2), s);
    }

    boolean l()
    {
        if (!j())
        {
            return false;
        }
        q = false;
        t.removeMessages(2);
        t.removeMessages(1);
        if (c != null)
        {
            o.getApplicationContext().unregisterReceiver(c);
            c = null;
        }
        return true;
    }

    public int m()
    {
        return System.identityHashCode(this);
    }
}
