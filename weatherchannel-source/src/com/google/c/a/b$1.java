// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;


// Referenced classes of package com.google.c.a:
//            b

class nit> extends b
{

    final String a;
    final b b;

    CharSequence a(Object obj)
    {
        if (obj == null)
        {
            return a;
        } else
        {
            return b.a(obj);
        }
    }

    public b b(String s)
    {
        throw new UnsupportedOperationException("already specified useForNull");
    }

    nce(b b1, b b2, String s)
    {
        b = b1;
        a = s;
        super(b2, null);
    }
}
