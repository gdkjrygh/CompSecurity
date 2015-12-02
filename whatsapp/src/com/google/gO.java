// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.Iterator;

// Referenced classes of package com.google:
//            gq, fQ

class gO
    implements Iterator
{

    private Iterator a;

    public gO(Iterator iterator)
    {
        a = iterator;
    }

    public java.util.Map.Entry a()
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)a.next();
        Object obj = entry;
        if (entry.getValue() instanceof gq)
        {
            obj = new fQ(entry, null);
        }
        return ((java.util.Map.Entry) (obj));
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        a.remove();
    }
}
