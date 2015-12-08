// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            TransformedIterator, AbstractTable

class tor extends TransformedIterator
{

    final AbstractTable this$0;

    Object transform(tor tor)
    {
        return tor.lue();
    }

    volatile Object transform(Object obj)
    {
        return transform((transform)obj);
    }

    tor(Iterator iterator)
    {
        this$0 = AbstractTable.this;
        super(iterator);
    }
}
