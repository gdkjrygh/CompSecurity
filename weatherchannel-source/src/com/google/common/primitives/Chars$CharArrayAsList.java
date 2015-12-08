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
//            Chars

private static class end extends AbstractList
    implements RandomAccess, Serializable
{

    private static final long serialVersionUID = 0L;
    final char array[];
    final int end;
    final int start;

    public boolean contains(Object obj)
    {
        return (obj instanceof Character) && Chars.access$000(array, ((Character)obj).charValue(), start, end) != -1;
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

    public Character get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        return Character.valueOf(array[start + i]);
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
            j = j * 31 + Chars.hashCode(array[i]);
        }

        return j;
    }

    public int indexOf(Object obj)
    {
        if (obj instanceof Character)
        {
            int i = Chars.access$000(array, ((Character)obj).charValue(), start, end);
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
        if (obj instanceof Character)
        {
            int i = Chars.access$100(array, ((Character)obj).charValue(), start, end);
            if (i >= 0)
            {
                return i - start;
            }
        }
        return -1;
    }

    public Character set(int i, Character character)
    {
        Preconditions.checkElementIndex(i, size());
        char c = array[start + i];
        array[start + i] = ((Character)Preconditions.checkNotNull(character)).charValue();
        return Character.valueOf(c);
    }

    public volatile Object set(int i, Object obj)
    {
        return set(i, (Character)obj);
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

    char[] toCharArray()
    {
        int i = size();
        char ac[] = new char[i];
        System.arraycopy(array, start, ac, 0, i);
        return ac;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(size() * 3);
        stringbuilder.append('[').append(array[start]);
        for (int i = start + 1; i < end; i++)
        {
            stringbuilder.append(", ").append(array[i]);
        }

        return stringbuilder.append(']').toString();
    }

    (char ac[])
    {
        this(ac, 0, ac.length);
    }

    <init>(char ac[], int i, int j)
    {
        array = ac;
        start = i;
        end = j;
    }
}
