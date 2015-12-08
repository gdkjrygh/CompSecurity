// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class NullsFirstOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Ordering ordering;

    NullsFirstOrdering(Ordering ordering1)
    {
        ordering = ordering1;
    }

    public int compare(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return 0;
        }
        if (obj == null)
        {
            return -1;
        }
        if (obj1 == null)
        {
            return 1;
        } else
        {
            return ordering.compare(obj, obj1);
        }
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof NullsFirstOrdering)
        {
            obj = (NullsFirstOrdering)obj;
            return ordering.equals(((NullsFirstOrdering) (obj)).ordering);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return ordering.hashCode() ^ 0x39153a74;
    }

    public Ordering nullsFirst()
    {
        return this;
    }

    public Ordering nullsLast()
    {
        return ordering.nullsLast();
    }

    public Ordering reverse()
    {
        return ordering.reverse().nullsLast();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(ordering));
        return (new StringBuilder(s.length() + 13)).append(s).append(".nullsFirst()").toString();
    }
}
