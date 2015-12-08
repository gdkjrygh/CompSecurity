// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.c.b:
//            af, t

static final class init> extends af
{

    boolean a;
    final Object b;

    public boolean hasNext()
    {
        return !a;
    }

    public Object next()
    {
        if (a)
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return b;
        }
    }

    mentException(Object obj)
    {
        b = obj;
        super();
    }
}
