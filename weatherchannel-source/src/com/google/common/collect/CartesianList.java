// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.collect:
//            ImmutableList

final class CartesianList extends AbstractList
    implements RandomAccess
{

    private final transient ImmutableList axes;
    private final transient int axesSizeProduct[];

    CartesianList(ImmutableList immutablelist)
    {
        int ai[];
        axes = immutablelist;
        ai = new int[immutablelist.size() + 1];
        ai[immutablelist.size()] = 1;
        int i;
        try
        {
            i = immutablelist.size() - 1;
        }
        // Misplaced declaration of an exception variable
        catch (ImmutableList immutablelist)
        {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[i] = IntMath.checkedMultiply(ai[i + 1], ((List)immutablelist.get(i)).size());
        i--;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_32;
_L1:
        axesSizeProduct = ai;
        return;
    }

    static List create(List list)
    {
        ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
        ImmutableList immutablelist;
        for (list = list.iterator(); list.hasNext(); builder.add(immutablelist))
        {
            immutablelist = ImmutableList.copyOf((List)list.next());
            if (immutablelist.isEmpty())
            {
                return ImmutableList.of();
            }
        }

        return new CartesianList(builder.build());
    }

    private int getAxisIndexForProductIndex(int i, int j)
    {
        return (i / axesSizeProduct[j + 1]) % ((List)axes.get(j)).size();
    }

    public boolean contains(Object obj)
    {
        if (!(obj instanceof List))
        {
            return false;
        }
        obj = (List)obj;
        if (((List) (obj)).size() != axes.size())
        {
            return false;
        }
        for (obj = ((List) (obj)).listIterator(); ((ListIterator) (obj)).hasNext();)
        {
            int i = ((ListIterator) (obj)).nextIndex();
            if (!((List)axes.get(i)).contains(((ListIterator) (obj)).next()))
            {
                return false;
            }
        }

        return true;
    }

    public ImmutableList get(final int index)
    {
        Preconditions.checkElementIndex(index, size());
        return new ImmutableList() {

            final CartesianList this$0;
            final int val$index;

            public Object get(int i)
            {
                Preconditions.checkElementIndex(i, size());
                int j = getAxisIndexForProductIndex(index, i);
                return ((List)axes.get(i)).get(j);
            }

            boolean isPartialView()
            {
                return true;
            }

            public int size()
            {
                return axes.size();
            }

            
            {
                this$0 = CartesianList.this;
                index = i;
                super();
            }
        };
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public int size()
    {
        return axesSizeProduct[0];
    }


}
