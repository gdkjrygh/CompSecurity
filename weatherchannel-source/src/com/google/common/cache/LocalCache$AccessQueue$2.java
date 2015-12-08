// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.AbstractSequentialIterator;

// Referenced classes of package com.google.common.cache:
//            LocalCache

class tor extends AbstractSequentialIterator
{

    final  this$0;

    protected  computeNext( )
    {
         1 = .getNextInAccessQueue();
         = 1;
        if (1 == ad)
        {
             = null;
        }
        return ;
    }

    protected volatile Object computeNext(Object obj)
    {
        return computeNext(()obj);
    }

    ( 1)
    {
        this$0 = this._cls0.this;
        super(1);
    }
}
