// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.math.IntMath;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            Collections2, ImmutableList

private static final class inputList extends AbstractCollection
{

    final ImmutableList inputList;

    public boolean contains(Object obj)
    {
        if (obj instanceof List)
        {
            obj = (List)obj;
            return Collections2.access$100(inputList, ((List) (obj)));
        } else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return new nit>(inputList);
    }

    public int size()
    {
        return IntMath.factorial(inputList.size());
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(inputList));
        return (new StringBuilder(s.length() + 14)).append("permutations(").append(s).append(")").toString();
    }

    (ImmutableList immutablelist)
    {
        inputList = immutablelist;
    }
}
