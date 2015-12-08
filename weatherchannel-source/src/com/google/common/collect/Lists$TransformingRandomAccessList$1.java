// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            TransformedListIterator, Lists

class this._cls0 extends TransformedListIterator
{

    final nction this$0;

    Object transform(Object obj)
    {
        return nction.apply(obj);
    }

    (ListIterator listiterator)
    {
        this$0 = this._cls0.this;
        super(listiterator);
    }
}
