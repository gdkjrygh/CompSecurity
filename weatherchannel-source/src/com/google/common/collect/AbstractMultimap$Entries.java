// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMultimap, Multimap

private class <init> extends <init>
{

    final AbstractMultimap this$0;

    public Iterator iterator()
    {
        return entryIterator();
    }

    Multimap multimap()
    {
        return AbstractMultimap.this;
    }

    private ()
    {
        this$0 = AbstractMultimap.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
