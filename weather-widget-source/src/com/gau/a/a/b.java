// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.gau.a.a.d.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.gau.a.a:
//            e, d, c

public class b
    implements e
{

    private int a;
    private List b;
    private List c;
    private com.gau.a.a.b.b d;
    private Context e;
    private byte f[];
    private Handler g;

    public b(Context context)
    {
        a = 2;
        b = new ArrayList();
        c = new ArrayList();
        f = new byte[0];
        g = new Handler(Looper.getMainLooper());
        if (context == null)
        {
            throw new IllegalArgumentException("context must have value");
        } else
        {
            e = context;
            d = new com.gau.a.a.b.b();
            return;
        }
    }

    private void a()
    {
        g.post(new d(this));
    }

    static byte[] a(b b1)
    {
        return b1.f;
    }

    private void b()
    {
        int j;
        if (b != null && !b.isEmpty() && c != null)
        {
            if ((j = c.size()) < a)
            {
label0:
                {
                    a a1;
                    for (int i = 0; i < a - j && !b.isEmpty(); i++)
                    {
                        break label0;
                    }

                    a1 = (a)b.remove(0);
                    if (a1 != null)
                    {
                        c.add(a1);
                        c(a1);
                        return;
                    }
                }
            }
        }
    }

    static void b(b b1)
    {
        b1.b();
    }

    private void c(a a1)
    {
        a1 = d.a(a1, this, e);
        if (a1 == null)
        {
            return;
        }
        if (a1.a().l())
        {
            a1.c();
            return;
        } else
        {
            a1.d();
            return;
        }
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("Addrequest must have request");
        }
        byte abyte0[] = f;
        abyte0;
        JVM INSTR monitorenter ;
        if (!a1.l())
        {
            break MISSING_BLOCK_LABEL_69;
        }
        b.add(a1);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            Collections.sort(b, new c(this));
        }
        b();
_L2:
        return;
        c(a1);
        if (true) goto _L2; else goto _L1
_L1:
        a1;
        abyte0;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(a a1, int i)
    {
        com.gau.a.a.f.b.a("schedule onException", null);
        com.gau.a.a.f.b.a("testBattery, Begin HttpConnectScheduler onException", null);
        if (a1 == null)
        {
            return;
        }
        e e1 = a1.i();
        if (e1 != null)
        {
            e1.a(a1, i);
        }
        synchronized (f)
        {
            if (c != null && !c.isEmpty())
            {
                c.remove(a1);
                if (d != null)
                {
                    d.a(a1);
                }
            }
        }
        a();
        com.gau.a.a.f.b.a("testBattery, End HttpConnectScheduler onException", null);
        return;
        a1;
        abyte0;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void a(a a1, com.gau.a.a.e.b b1)
    {
        com.gau.a.a.f.b.a("schedule onFinish", null);
        com.gau.a.a.f.b.a("testBattery, Begin HttpConnectScheduler onFinish", null);
        if (a1 == null)
        {
            return;
        }
        a1.i().a(a1, b1);
        synchronized (f)
        {
            if (c != null && !c.isEmpty())
            {
                c.remove(a1);
                if (d != null)
                {
                    d.a(a1);
                }
            }
        }
        a();
        com.gau.a.a.f.b.a("testBattery, End HttpConnectScheduler onFinish", null);
        return;
        a1;
        b1;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void b(a a1)
    {
        a1.i().b(a1);
    }
}
