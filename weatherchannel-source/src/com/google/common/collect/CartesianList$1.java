// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.List;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, CartesianList

class nit> extends ImmutableList
{

    final CartesianList this$0;
    final int val$index;

    public Object get(int i)
    {
        Preconditions.checkElementIndex(i, size());
        int j = CartesianList.access$100(CartesianList.this, val$index, i);
        return ((List)CartesianList.access$000(CartesianList.this).get(i)).get(j);
    }

    boolean isPartialView()
    {
        return true;
    }

    public int size()
    {
        return CartesianList.access$000(CartesianList.this).size();
    }

    ()
    {
        this$0 = final_cartesianlist;
        val$index = I.this;
        super();
    }
}
