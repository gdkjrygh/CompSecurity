// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableMap;

// Referenced classes of package com.google.common.collect:
//            TreeRangeMap

class this._cls1 extends AbstractSet
{

    final is._cls0 this$1;

    public Iterator iterator()
    {
        return TreeRangeMap.access$100(_fld0).values().iterator();
    }

    public int size()
    {
        return TreeRangeMap.access$100(_fld0).size();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
