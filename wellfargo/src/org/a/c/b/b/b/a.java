// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.b;

import org.a.c.b.b.a.j;
import org.a.c.b.b.i;

public abstract class a extends org.a.c.a.a
    implements j
{

    public final int b;
    public final int c;
    public final String d;

    public a(int k, int l, String s)
    {
        b = k;
        c = l;
        d = s;
    }

    public static final byte[] a()
    {
        return new byte[4];
    }

    public final boolean a(i k)
    {
        return c > 0 && c * k.f <= 4;
    }

    public abstract byte[] a(Object obj, int k);

    public final byte[] b(i k)
    {
        if (a(k))
        {
            int l = c;
            l = k.f * l;
            byte abyte0[] = new byte[l];
            System.arraycopy(k.h, 0, abyte0, 0, l);
            return abyte0;
        } else
        {
            return k.i;
        }
    }

    public abstract Object c(i k);

    public String toString()
    {
        return (new StringBuilder("[")).append(getClass().getName()).append(". type: ").append(b).append(", name: ").append(d).append(", length: ").append(c).append("]").toString();
    }
}
