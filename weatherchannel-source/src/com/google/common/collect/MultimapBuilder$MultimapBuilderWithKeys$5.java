// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;

// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, Multimaps, Multimap, SetMultimap, 
//            SortedSetMultimap

class init> extends init>
{

    final val.comparator this$0;
    final Comparator val$comparator;

    public volatile Multimap build()
    {
        return build();
    }

    public volatile SetMultimap build()
    {
        return build();
    }

    public SortedSetMultimap build()
    {
        return Multimaps.newSortedSetMultimap(eateMap(), new eateMap(val$comparator));
    }

    I()
    {
        this$0 = final_i;
        val$comparator = Comparator.this;
        super();
    }
}
