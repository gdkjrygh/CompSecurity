// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap, BiMap, Maps

private static class inverse extends ForwardingMap
    implements BiMap, Serializable
{

    private static final long serialVersionUID = 0L;
    final BiMap _flddelegate;
    BiMap inverse;
    final Map unmodifiableMap;
    transient Set values;

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected Map _mthdelegate()
    {
        return unmodifiableMap;
    }

    public Object forcePut(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public BiMap inverse()
    {
        BiMap bimap = inverse;
        Object obj = bimap;
        if (bimap == null)
        {
            obj = new <init>(_flddelegate.inverse(), this);
            inverse = ((BiMap) (obj));
        }
        return ((BiMap) (obj));
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        Set set1 = values;
        Set set = set1;
        if (set1 == null)
        {
            set = Collections.unmodifiableSet(_flddelegate.values());
            values = set;
        }
        return set;
    }

    (BiMap bimap, BiMap bimap1)
    {
        unmodifiableMap = Collections.unmodifiableMap(bimap);
        _flddelegate = bimap;
        inverse = bimap1;
    }
}
