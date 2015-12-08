// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b;

import java.util.ArrayList;

// Referenced classes of package org.a.c.b.b:
//            n, b, k, c, 
//            i

class m
    implements n
{

    private k a;
    private ArrayList b;
    private ArrayList c;
    private final boolean d;

    public m()
    {
        this((byte)0);
    }

    public m(byte byte0)
    {
        a = null;
        b = new ArrayList();
        c = new ArrayList();
        d = true;
    }

    public boolean a()
    {
        return d;
    }

    public boolean a(c c1)
    {
        b.add(c1);
        return true;
    }

    public final boolean a(i i)
    {
        c.add(i);
        return true;
    }

    public final boolean a(k k)
    {
        a = k;
        return true;
    }

    public final boolean b()
    {
        return true;
    }

    public final b c()
    {
        return new b(a, b);
    }
}
