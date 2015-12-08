// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.AbstractSequentialIterator;

// Referenced classes of package com.google.common.cache:
//            LocalCache

class ator extends AbstractSequentialIterator
{

    final y this$0;

    protected y computeNext(y y)
    {
        y y1 = y.getNextInWriteQueue();
        y = y1;
        if (y1 == ad)
        {
            y = null;
        }
        return y;
    }

    protected volatile Object computeNext(Object obj)
    {
        return computeNext((y)obj);
    }

    y(y y1)
    {
        this$0 = this._cls0.this;
        super(y1);
    }
}
