// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingCollection, Sets, ImmutableSet, CartesianList, 
//            ImmutableList

private static final class delegate extends ForwardingCollection
    implements Set
{

    private final transient ImmutableList axes;
    private final transient CartesianList _flddelegate;

    static Set create(List list)
    {
        der der = new der(list.size());
        ImmutableSet immutableset;
        for (list = list.iterator(); list.hasNext(); der.add(immutableset))
        {
            immutableset = ImmutableSet.copyOf((Set)list.next());
            if (immutableset.isEmpty())
            {
                return ImmutableSet.of();
            }
        }

        list = der.build();
        return new <init>(list, new CartesianList(new ImmutableList(list) {

            final ImmutableList val$axes;

            public volatile Object get(int i)
            {
                return get(i);
            }

            public List get(int i)
            {
                return ((ImmutableSet)axes.get(i)).asList();
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
                axes = immutablelist;
                super();
            }
        }));
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Collection _mthdelegate()
    {
        return _flddelegate;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof delegate)
        {
            obj = (delegate)obj;
            return axes.equals(((ls) (obj)).axes);
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        int i = size() - 1;
        for (int j = 0; j < axes.size(); j++)
        {
            i = ~~(i * 31);
        }

        int k = 1;
        for (Iterator iterator = axes.iterator(); iterator.hasNext();)
        {
            Set set = (Set)iterator.next();
            k = ~~(k * 31 + (size() / set.size()) * set.hashCode());
        }

        return ~~(k + i);
    }

    private t>(ImmutableList immutablelist, CartesianList cartesianlist)
    {
        axes = immutablelist;
        _flddelegate = cartesianlist;
    }
}
