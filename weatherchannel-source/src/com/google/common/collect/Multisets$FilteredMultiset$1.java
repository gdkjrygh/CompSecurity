// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;

// Referenced classes of package com.google.common.collect:
//            Multisets

class this._cls0
    implements Predicate
{

    final apply this$0;

    public boolean apply(this._cls0 _pcls0)
    {
        return edicate.apply(_pcls0.edicate());
    }

    public volatile boolean apply(Object obj)
    {
        return apply((apply)obj);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
