// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            FilteredKeySetMultimap, Sets

class t> extends t>
    implements Set
{

    final FilteredKeySetMultimap this$0;

    public boolean equals(Object obj)
    {
        return Sets.equalsImpl(this, obj);
    }

    public int hashCode()
    {
        return Sets.hashCodeImpl(this);
    }

    ()
    {
        this$0 = FilteredKeySetMultimap.this;
        super(FilteredKeySetMultimap.this);
    }
}
