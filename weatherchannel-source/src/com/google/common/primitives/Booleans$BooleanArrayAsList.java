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
//            Booleans

private static class end extends AbstractList
    implements RandomAccess, Serializable
{

    private static final long serialVersionUID = 0L;
    final boolean array[];
    final int end;
    final int start;

    public boolean contains(Object obj)
    {
        return (obj instanceof Boolean) && Booleans.access$000(array, ((Boolean)obj).booleanValue(), start, end) != -1;
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

    public Boolean get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Boolean.valueOf(array[start + i]);
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
            j = j * 31 + Booleans.hashCode(array[i]);
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Boolean)
        {
            int i = Booleans.access$000(array, ((Boolean)obj).booleanValue(), start, end);
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
        if (obj instanceof Boolean)
        {
            int i = Booleans.access$100(array, ((Boolean)obj).booleanValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public Boolean set(int i, Boolean boolean1)
    {
        Preconditions.checkElementIndex(i, size());
        boolean flag = array[start + i];
        array[start + i] = ((Boolean)Preconditions.checkNotNull(boolean1)).booleanValue();
        return Boolean.valueOf(flag);
    }

    public volatile Object set(int i, Object obj)
    {
        return set(i, (Boolean)obj);
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

    boolean[] toBooleanArray()
    {
        int i = size();
        boolean aflag[] = new boolean[i];
        System.arraycopy(array, start, aflag, 0, i);
        return aflag;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 7);
        String s;
        int i;
        if (array[start])
        {
            s = "[true";
        } else
        {
            s = "[false";
        }
        stringbuilder.append(s);
        i = start + 1;
        while (i < end) 
        {
            if (array[i])
            {
                s = ", true";
            } else
            {
                s = ", false";
            }
            stringbuilder.append(s);
            i++;
        }
        return stringbuilder.append(']').toString();
    }

    (boolean aflag[])
    {
        this(aflag, 0, aflag.length);
    }

    <init>(boolean aflag[], int i, int j)
    {
        array = aflag;
        start = i;
        end = j;
    }
}
