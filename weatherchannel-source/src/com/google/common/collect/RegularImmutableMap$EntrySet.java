// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableMapEntrySet, RegularImmutableMap, RegularImmutableAsList, ImmutableList, 
//            UnmodifiableIterator, ImmutableMap

private class <init> extends ImmutableMapEntrySet
{

    final RegularImmutableMap this$0;

    ImmutableList createAsList()
    {
        return new RegularImmutableAsList(this, RegularImmutableMap.access$100(RegularImmutableMap.this));
    }

    public UnmodifiableIterator iterator()
    {
        return asList().iterator();
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    ImmutableMap map()
    {
        return RegularImmutableMap.this;
    }

    private ()
    {
        this$0 = RegularImmutableMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
