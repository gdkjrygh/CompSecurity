// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.Ordering;
import java.util.Comparator;
import java.util.Map;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

static final class val.map extends Ordering
{

    final Map val$map;
    final Comparator val$valueComparator;

    public int compare(Object obj, Object obj1)
    {
        return val$valueComparator.compare(val$map.get(obj), val$map.get(obj1));
    }

    _cls9(Comparator comparator, Map map1)
    {
        val$valueComparator = comparator;
        val$map = map1;
        super();
    }
}
