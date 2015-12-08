// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            TreeBasedTable

class this._cls0
    implements Function
{

    final TreeBasedTable this$0;

    public volatile Object apply(Object obj)
    {
        return apply((Map)obj);
    }

    public Iterator apply(Map map)
    {
        return map.keySet().iterator();
    }

    ()
    {
        this$0 = TreeBasedTable.this;
        super();
    }
}
