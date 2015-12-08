// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;


// Referenced classes of package com.google.c.b:
//            af, v

static final class init> extends af
{

    final af a;

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return ((java.util.Entry)a.next()).getValue();
    }

    (af af1)
    {
        a = af1;
        super();
    }
}
