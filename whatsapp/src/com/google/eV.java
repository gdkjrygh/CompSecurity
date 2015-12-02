// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Iterator;

// Referenced classes of package com.google:
//            v, b

class eV
    implements Iterator
{

    final v a;
    Iterator b;

    eV(v v1)
    {
        a = v1;
        super();
        b = v.a(a).iterator();
    }

    public String a()
    {
        return (String)b.next();
    }

    public boolean hasNext()
    {
        return b.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
