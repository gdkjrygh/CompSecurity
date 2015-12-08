// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            Tables, Maps

class this._cls0
    implements Function
{

    final nction this$0;

    public volatile Object apply(Object obj)
    {
        return apply((Map)obj);
    }

    public Map apply(Map map)
    {
        return Maps.transformValues(map, nction);
    }

    _cls9()
    {
        this$0 = this._cls0.this;
        super();
    }
}
