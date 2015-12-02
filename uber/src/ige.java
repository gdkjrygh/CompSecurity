// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public abstract class ige
{

    private Queue a;
    private final int b;
    private icj c;

    public ige()
    {
        this((byte)0);
    }

    private ige(byte byte0)
    {
        b = 0;
        c();
        c = iim.b().a();
        c.a(new idd() {

            final int a = 0;
            final int b = 0;
            final ige c;

            public final void a()
            {
                int k = 0;
                int i = 0;
                int l = ige.a(c).size();
                if (l < a)
                {
                    for (k = b; i < k - l; i++)
                    {
                        ige.a(c).add(c.b());
                    }

                } else
                if (l > b)
                {
                    int i1 = b;
                    for (int j = k; j < l - i1; j++)
                    {
                        ige.a(c).poll();
                    }

                }
            }

            
            {
                c = ige.this;
                super();
            }
        }, 67L, 67L, TimeUnit.SECONDS);
    }

    static Queue a(ige ige1)
    {
        return ige1.a;
    }

    private void c()
    {
        if (iho.a())
        {
            a = new igt(Math.max(b, 1024));
            return;
        } else
        {
            a = new ConcurrentLinkedQueue();
            return;
        }
    }

    public final Object a()
    {
        Object obj1 = a.poll();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = b();
        }
        return obj;
    }

    public final void a(Object obj)
    {
        if (obj == null)
        {
            return;
        } else
        {
            a.offer(obj);
            return;
        }
    }

    protected abstract Object b();
}
