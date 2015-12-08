// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            TransformedIterator, Multisets

class it> extends TransformedIterator
{

    final transform this$0;

    Object transform(it> it>)
    {
        return it>.nt();
    }

    volatile Object transform(Object obj)
    {
        return transform((transform)obj);
    }

    (Iterator iterator)
    {
        this$0 = this._cls0.this;
        super(iterator);
    }
}
