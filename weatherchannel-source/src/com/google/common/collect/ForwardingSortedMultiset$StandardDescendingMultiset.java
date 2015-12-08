// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            DescendingMultiset, ForwardingSortedMultiset, SortedMultiset

protected abstract class this._cls0 extends DescendingMultiset
{

    final ForwardingSortedMultiset this$0;

    SortedMultiset forwardMultiset()
    {
        return ForwardingSortedMultiset.this;
    }

    public ()
    {
        this$0 = ForwardingSortedMultiset.this;
        super();
    }
}
