// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.common.collect:
//            FilteredEntryMultimap

final class key
    implements Predicate
{

    private final Object key;
    final FilteredEntryMultimap this$0;

    public boolean apply(Object obj)
    {
        return FilteredEntryMultimap.access$000(FilteredEntryMultimap.this, key, obj);
    }

    (Object obj)
    {
        this$0 = FilteredEntryMultimap.this;
        super();
        key = obj;
    }
}
