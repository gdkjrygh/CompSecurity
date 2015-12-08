// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Ordering

final class LexicographicalOrdering extends Ordering
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Ordering elementOrder;

    LexicographicalOrdering(Ordering ordering)
    {
        elementOrder = ordering;
    }

    public int compare(Iterable iterable, Iterable iterable1)
    {
        iterable = iterable.iterator();
        iterable1 = iterable1.iterator();
        while (iterable.hasNext()) 
        {
            if (!iterable1.hasNext())
            {
                return 1;
            }
            int i = elementOrder.compare(iterable.next(), iterable1.next());
            if (i != 0)
            {
                return i;
            }
        }
        return !iterable1.hasNext() ? 0 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((Iterable)obj, (Iterable)obj1);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof LexicographicalOrdering)
        {
            obj = (LexicographicalOrdering)obj;
            return elementOrder.equals(((LexicographicalOrdering) (obj)).elementOrder);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return elementOrder.hashCode() ^ 0x7bb78cf5;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(elementOrder));
        return (new StringBuilder(s.length() + 18)).append(s).append(".lexicographical()").toString();
    }
}
