// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps

static abstract class  extends AbstractMap
{

    private transient Set entrySet;
    private transient Set keySet;
    private transient Collection values;

    abstract Set createEntrySet();

    Set createKeySet()
    {
        return new (this);
    }

    Collection createValues()
    {
        return new (this);
    }

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = createEntrySet();
            entrySet = set;
        }
        return set;
    }

    public Set keySet()
    {
        Set set1 = keySet;
        Set set = set1;
        if (set1 == null)
        {
            set = createKeySet();
            keySet = set;
        }
        return set;
    }

    public Collection values()
    {
        Collection collection1 = values;
        Collection collection = collection1;
        if (collection1 == null)
        {
            collection = createValues();
            values = collection;
        }
        return collection;
    }

    ()
    {
    }
}
