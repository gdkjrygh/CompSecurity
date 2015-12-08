// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NavigableMap;

// Referenced classes of package com.google.common.collect:
//            AbstractNavigableMap

private final class <init> extends <init>
{

    final AbstractNavigableMap this$0;

    Iterator entryIterator()
    {
        return descendingEntryIterator();
    }

    NavigableMap forward()
    {
        return AbstractNavigableMap.this;
    }

    private ()
    {
        this$0 = AbstractNavigableMap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
