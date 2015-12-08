// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, Hashing, RegularImmutableAsList, Iterators, 
//            ImmutableList, UnmodifiableIterator

final class RegularImmutableSet extends ImmutableSet
{

    private final Object elements[];
    private final transient int hashCode;
    private final transient int mask;
    final transient Object table[];

    RegularImmutableSet(Object aobj[], int i, Object aobj1[], int j)
    {
        elements = aobj;
        table = aobj1;
        mask = j;
        hashCode = i;
    }

    public boolean contains(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = Hashing.smear(obj.hashCode());
        do
        {
            Object obj1 = table[mask & i];
            if (obj1 == null)
            {
                continue;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    int copyIntoArray(Object aobj[], int i)
    {
        System.arraycopy(((Object) (elements)), 0, ((Object) (aobj)), i, elements.length);
        return elements.length + i;
    }

    ImmutableList createAsList()
    {
        return new RegularImmutableAsList(this, elements);
    }

    public int hashCode()
    {
        return hashCode;
    }

    boolean isHashCodeFast()
    {
        return true;
    }

    boolean isPartialView()
    {
        return false;
    }

    public UnmodifiableIterator iterator()
    {
        return Iterators.forArray(elements);
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return elements.length;
    }
}
