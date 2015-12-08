// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.b;

import java.util.Set;

// Referenced classes of package com.google.c.b:
//            j, s

final class f extends j
{

    static final f a = new f();

    private f()
    {
    }

    public j a()
    {
        return this;
    }

    public s b()
    {
        return s.f();
    }

    s c()
    {
        throw new AssertionError("should never be called");
    }

    public s d()
    {
        return s.f();
    }

    public Set entrySet()
    {
        return b();
    }

    public Object get(Object obj)
    {
        return null;
    }

    public boolean isEmpty()
    {
        return true;
    }

    public Set keySet()
    {
        return d();
    }

    public int size()
    {
        return 0;
    }

}
