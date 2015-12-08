// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, Sets

class istIterator extends AbstractIndexedListIterator
{

    final putSet this$0;

    protected volatile Object get(int i)
    {
        return get(i);
    }

    protected Set get(int i)
    {
        return new t>(putSet, i);
    }

    istIterator(int i)
    {
        this$0 = this._cls0.this;
        super(i);
    }
}
