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
//            Shorts

private static class end extends AbstractList
    implements RandomAccess, Serializable
{

    private static final long serialVersionUID = 0L;
    final short array[];
    final int end;
    final int start;

    public boolean contains(Object obj)
    {
        return (obj instanceof Short) && Shorts.access$000(array, ((Short)obj).shortValue(), start, end) != -1;
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

    public volatile Object get(int i)
    {
        return get(i);
    }

    public Short get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Short.valueOf(array[start + i]);
    }

    public int hashCode()
    {
        int j = 1;
        for (int i = start; i < end; i++)
        {
            j = j * 31 + Shorts.hashCode(array[i]);
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Short)
        {
            int i = Shorts.access$000(array, ((Short)obj).shortValue(), start, end);
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
        if (obj instanceof Short)
        {
            int i = Shorts.access$100(array, ((Short)obj).shortValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public volatile Object set(int i, Object obj)
    {
        return set(i, (Short)obj);
    }

    public Short set(int i, Short short1)
    {
        Preconditions.checkElementIndex(i, size());
        short word0 = array[start + i];
        array[start + i] = ((Short)Preconditions.checkNotNull(short1)).shortValue();
        return Short.valueOf(word0);
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

    short[] toShortArray()
    {
        int i = size();
        short aword0[] = new short[i];
        System.arraycopy(array, start, aword0, 0, i);
        return aword0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 6);
        stringbuilder.append('[').append(array[start]);
        for (int i = start + 1; i < end; i++)
        {
            stringbuilder.append(", ").append(array[i]);
        }

        return stringbuilder.append(']').toString();
    }

    (short aword0[])
    {
        this(aword0, 0, aword0.length);
    }

    <init>(short aword0[], int i, int j)
    {
        array = aword0;
        start = i;
        end = j;
    }
}
