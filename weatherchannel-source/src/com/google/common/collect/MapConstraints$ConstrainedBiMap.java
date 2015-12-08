// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            BiMap, MapConstraints, MapConstraint

private static class inverse extends inverse
    implements BiMap
{

    volatile BiMap inverse;

    protected BiMap _mthdelegate()
    {
        return (BiMap)super.legate();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    public Object forcePut(Object obj, Object obj1)
    {
        constraint.checkKeyValue(obj, obj1);
        return _mthdelegate().forcePut(obj, obj1);
    }

    public BiMap inverse()
    {
        if (inverse == null)
        {
            inverse = new <init>(_mthdelegate().inverse(), this, new (constraint));
        }
        return inverse;
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        return _mthdelegate().values();
    }

    (BiMap bimap, BiMap bimap1, MapConstraint mapconstraint)
    {
        super(bimap, mapconstraint);
        inverse = bimap1;
    }
}
