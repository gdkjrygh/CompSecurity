// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b.a;

import org.a.c.b.b.b.a;
import org.a.c.b.b.i;

// Referenced classes of package org.a.c.b.b.a:
//            k, o, l

public class e
    implements k, o
{

    public final String a;
    public final int b;
    public final a c[];
    public final int d;
    public final l e;

    public e(String s, int j, a a1, int l, l l1)
    {
        this(s, j, new a[] {
            a1
        }, l, l1);
    }

    public e(String s, int j, a aa[], int l, l l1)
    {
        a = s;
        b = j;
        c = aa;
        d = l;
        e = l1;
    }

    public Object a(i j)
    {
        return j.b.c(j);
    }

    public final String a()
    {
        return (new StringBuilder(String.valueOf(b))).append(" (0x").append(Integer.toHexString(b)).append(": ").append(a).append("): ").toString();
    }

    public byte[] a(a a1, Object obj, int j)
    {
        return a1.a(obj, j);
    }

    public String toString()
    {
        return (new StringBuilder("[TagInfo. tag: ")).append(b).append(" (0x").append(Integer.toHexString(b)).append(", name: ").append(a).append("]").toString();
    }
}
