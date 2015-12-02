// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.AbstractList;
import java.util.List;

// Referenced classes of package com.google:
//            a_, bX

class Q extends AbstractList
    implements List
{

    a_ a;

    public bX a(int i)
    {
        return a.d(i);
    }

    void a()
    {
        modCount = modCount + 1;
    }

    public Object get(int i)
    {
        return a(i);
    }

    public int size()
    {
        return a.a();
    }
}
