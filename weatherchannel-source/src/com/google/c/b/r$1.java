// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


// Referenced classes of package com.google.c.b:
//            i, r, m, k

class nit> extends i
{

    final m a;
    final r b;

    k c()
    {
        return b;
    }

    public Object get(int j)
    {
        return ((java.util.Entry)a.get(j)).getValue();
    }

    (r r1, m m1)
    {
        b = r1;
        a = m1;
        super();
    }
}
