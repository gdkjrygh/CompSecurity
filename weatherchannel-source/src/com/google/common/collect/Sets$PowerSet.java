// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, ImmutableMap, ImmutableSet, AbstractIndexedListIterator

private static final class ize extends AbstractSet
{

    final ImmutableMap inputSet;

    public boolean contains(Object obj)
    {
        if (obj instanceof Set)
        {
            obj = (Set)obj;
            return inputSet.keySet().containsAll(((java.util.Collection) (obj)));
        } else
        {
            return false;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ontainsAll)
        {
            obj = (ontainsAll)obj;
            return inputSet.equals(((quals) (obj)).inputSet);
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        return inputSet.keySet().hashCode() << inputSet.size() - 1;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return new AbstractIndexedListIterator(size()) {

            final Sets.PowerSet this$0;

            protected volatile Object get(int i)
            {
                return get(i);
            }

            protected Set get(int i)
            {
                return new Sets.SubSet(inputSet, i);
            }

            
            {
                this$0 = Sets.PowerSet.this;
                super(i);
            }
        };
    }

    public int size()
    {
        return 1 << inputSet.size();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(inputSet));
        return (new StringBuilder(s.length() + 10)).append("powerSet(").append(s).append(")").toString();
    }

    uilder(Set set)
    {
        uilder uilder = ImmutableMap.builder();
        int i = 0;
        for (set = ((Set)Preconditions.checkNotNull(set)).iterator(); set.hasNext();)
        {
            uilder.put(set.next(), Integer.valueOf(i));
            i++;
        }

        inputSet = uilder.build();
        boolean flag;
        if (inputSet.size() <= 30)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Too many elements to create power set: %s > 30", new Object[] {
            Integer.valueOf(inputSet.size())
        });
    }
}
