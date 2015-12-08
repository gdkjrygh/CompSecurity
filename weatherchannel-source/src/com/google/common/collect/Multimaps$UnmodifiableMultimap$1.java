// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import java.util.Collection;

// Referenced classes of package com.google.common.collect:
//            Multimaps

class this._cls0
    implements Function
{

    final apply this$0;

    public volatile Object apply(Object obj)
    {
        return apply((Collection)obj);
    }

    public Collection apply(Collection collection)
    {
        return Multimaps.access$000(collection);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
