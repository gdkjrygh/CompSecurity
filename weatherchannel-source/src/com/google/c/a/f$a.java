// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;

import java.io.Serializable;

// Referenced classes of package com.google.c.a:
//            e, f

private static class <init>
    implements e, Serializable
{

    private final Object a;

    public boolean a(Object obj)
    {
        return a.equals(obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof uals)
        {
            obj = (uals)obj;
            return a.equals(((uals) (obj)).a);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("Predicates.equalTo(").append(a).append(")").toString();
    }

    private lder(Object obj)
    {
        a = obj;
    }

    a(Object obj, a a1)
    {
        this(obj);
    }
}
