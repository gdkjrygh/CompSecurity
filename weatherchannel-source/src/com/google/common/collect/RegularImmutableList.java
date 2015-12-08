// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Iterators, UnmodifiableListIterator

class RegularImmutableList extends ImmutableList
{

    private final transient Object array[];
    private final transient int offset;
    private final transient int size;

    RegularImmutableList(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    RegularImmutableList(Object aobj[], int i, int j)
    {
        offset = i;
        size = j;
        array = aobj;
    }

    int copyIntoArray(Object aobj[], int i)
    {
        System.arraycopy(((Object) (array)), offset, ((Object) (aobj)), i, size);
        return size + i;
    }

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, size);
        return array[offset + i];
    }

    public int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= size)
                {
                    break label1;
                }
                j = i;
                if (array[offset + i].equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    boolean isPartialView()
    {
        return size != array.length;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = size - 1;
label0:
        do
        {
label1:
            {
                if (i < 0)
                {
                    break label1;
                }
                j = i;
                if (array[offset + i].equals(obj))
                {
                    break label0;
                }
                i--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public UnmodifiableListIterator listIterator(int i)
    {
        return Iterators.forArray(array, offset, size, i);
    }

    public volatile ListIterator listIterator(int i)
    {
        return listIterator(i);
    }

    public int size()
    {
        return size;
    }

    ImmutableList subListUnchecked(int i, int j)
    {
        return new RegularImmutableList(array, offset + i, j - i);
    }
}
