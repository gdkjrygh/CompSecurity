// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.c;

import java.util.Arrays;

// Referenced classes of package a.a.a.c:
//            d

public final class c
{

    private d a[];
    private int b;
    private int c;
    private int d;

    public c()
    {
        this(16);
    }

    public c(int i)
    {
        b = i;
        c = (i * 4) / 3;
        a = new d[i];
    }

    public Object a(long l)
    {
        int i = (int)(l >>> 32);
        int j = (int)l;
        int k = b;
        d d1 = a[((i ^ j) & 0x7fffffff) % k];
        do
        {
            if (d1 == null)
            {
                return null;
            }
            if (d1.a == l)
            {
                return d1.b;
            }
            d1 = d1.c;
        } while (true);
    }

    public Object a(long l, Object obj)
    {
        int i = (((int)(l >>> 32) ^ (int)l) & 0x7fffffff) % b;
        d d2 = a[i];
        d d1 = d2;
        do
        {
            if (d1 == null)
            {
                a[i] = new d(l, obj, d2);
                d = d + 1;
                if (d > c)
                {
                    a(b * 2);
                }
                return null;
            }
            if (d1.a == l)
            {
                Object obj1 = d1.b;
                d1.b = obj;
                return obj1;
            }
            d1 = d1.c;
        } while (true);
    }

    public void a()
    {
        d = 0;
        Arrays.fill(a, null);
    }

    public void a(int i)
    {
        d ad[];
        int j;
        int k;
        ad = new d[i];
        k = a.length;
        j = 0;
_L2:
        if (j >= k)
        {
            a = ad;
            b = i;
            c = (i * 4) / 3;
            return;
        }
        d d1 = a[j];
        do
        {
label0:
            {
                if (d1 != null)
                {
                    break label0;
                }
                j++;
            }
            if (true)
            {
                continue;
            }
            long l1 = d1.a;
            int l = (((int)(l1 >>> 32) ^ (int)l1) & 0x7fffffff) % i;
            d d2 = d1.c;
            d1.c = ad[l];
            ad[l] = d1;
            d1 = d2;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object b(long l)
    {
        int i = (((int)(l >>> 32) ^ (int)l) & 0x7fffffff) % b;
        d d1 = a[i];
        d d2 = null;
        do
        {
            if (d1 == null)
            {
                return null;
            }
            d d3 = d1.c;
            if (d1.a == l)
            {
                if (d2 == null)
                {
                    a[i] = d3;
                } else
                {
                    d2.c = d3;
                }
                d = d - 1;
                return d1.b;
            }
            d2 = d1;
            d1 = d3;
        } while (true);
    }

    public void b(int i)
    {
        a((i * 5) / 3);
    }
}
