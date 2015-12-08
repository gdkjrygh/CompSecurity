// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            MultimapBuilder, Multimaps, ListMultimap, Multimap

class  extends 
{

    final build this$0;
    final int val$expectedValuesPerKey;

    public ListMultimap build()
    {
        return Multimaps.newListMultimap(eateMap(), new eateMap(val$expectedValuesPerKey));
    }

    public volatile Multimap build()
    {
        return build();
    }

    I()
    {
        this$0 = final_i;
        val$expectedValuesPerKey = I.this;
        super();
    }
}
