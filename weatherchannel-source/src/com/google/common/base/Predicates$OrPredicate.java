// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.google.common.base:
//            Predicate, Predicates, Joiner

private static class <init>
    implements Predicate, Serializable
{

    private static final long serialVersionUID = 0L;
    private final List components;

    public boolean apply(Object obj)
    {
        for (int i = 0; i < components.size(); i++)
        {
            if (((Predicate)components.get(i)).apply(obj))
            {
                return true;
            }
        }

        return false;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof components)
        {
            obj = (components)obj;
            return components.equals(((components) (obj)).components);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return components.hashCode() + 0x53c91cf;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(Predicates.access$800().join(components)));
        return (new StringBuilder(s.length() + 15)).append("Predicates.or(").append(s).append(")").toString();
    }

    private (List list)
    {
        components = list;
    }

    components(List list, components components1)
    {
        this(list);
    }
}
