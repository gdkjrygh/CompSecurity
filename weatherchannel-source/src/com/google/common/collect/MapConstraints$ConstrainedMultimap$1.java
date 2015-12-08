// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, MapConstraints

class val.asMapDelegate extends ForwardingMap
{

    Set entrySet;
    final values this$0;
    final Map val$asMapDelegate;
    Collection values;

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return val$asMapDelegate;
    }

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = MapConstraints.access$200(val$asMapDelegate.entrySet(), nstraint);
            entrySet = set;
        }
        return set;
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Collection get(Object obj)
    {
        boolean flag;
        try
        {
            obj = t(obj);
            flag = ((Collection) (obj)).isEmpty();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return null;
        }
        if (flag)
        {
            obj = null;
        }
        return ((Collection) (obj));
    }

    public Collection values()
    {
        Collection collection = values;
        Object obj = collection;
        if (collection == null)
        {
            obj = new (_mthdelegate().values(), entrySet());
            values = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }

    ()
    {
        this$0 = final_;
        val$asMapDelegate = Map.this;
        super();
    }
}
