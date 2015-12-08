// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.primitives:
//            Longs

private static class end extends AbstractList
    implements RandomAccess, Serializable
{

    private static final long serialVersionUID = 0L;
    final long array[];
    final int end;
    final int start;

    public boolean contains(Object obj)
    {
        return (obj instanceof Long) && Longs.access$000(array, ((Long)obj).longValue(), start, end) != -1;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof end)
            {
                obj = (end)obj;
                int j = size();
                if (((size) (obj)).size() != j)
                {
                    return false;
                }
                int i = 0;
                while (i < j) 
                {
                    if (array[start + i] != ((start) (obj)).array[((array) (obj)).start + i])
                    {
                        return false;
                    }
                    i++;
                }
            } else
            {
                return super.equals(obj);
            }
        }
        return true;
    }

    public Long get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Long.valueOf(array[start + i]);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int hashCode()
    {
        int j = 1;
        for (int i = start; i < end; i++)
        {
            j = j * 31 + Longs.hashCode(array[i]);
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Long)
        {
            int i = Longs.access$000(array, ((Long)obj).longValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj instanceof Long)
        {
            int i = Longs.access$100(array, ((Long)obj).longValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public Long set(int i, Long long1)
    {
        Preconditions.checkElementIndex(i, size());
        long l = array[start + i];
        array[start + i] = ((Long)Preconditions.checkNotNull(long1)).longValue();
        return Long.valueOf(l);
    }

    public volatile Object set(int i, Object obj)
    {
        return set(i, (Long)obj);
    }

    public int size()
    {
        return end - start;
    }

    public List subList(int i, int j)
    {
        Preconditions.checkPositionIndexes(i, j, size());
        if (i == j)
        {
            return Collections.emptyList();
        } else
        {
            return new <init>(array, start + i, start + j);
        }
    }

    long[] toLongArray()
    {
        int i = size();
        long al[] = new long[i];
        System.arraycopy(array, start, al, 0, i);
        return al;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 10);
        stringbuilder.append('[').append(array[start]);
        for (int i = start + 1; i < end; i++)
        {
            stringbuilder.append(", ").append(array[i]);
        }

        return stringbuilder.append(']').toString();
    }

    (long al[])
    {
        this(al, 0, al.length);
    }

    <init>(long al[], int i, int j)
    {
        array = al;
        start = i;
        end = j;
    }
}
