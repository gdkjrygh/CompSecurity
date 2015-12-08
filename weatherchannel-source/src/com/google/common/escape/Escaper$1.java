// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.escape;

import com.google.common.base.Function;

// Referenced classes of package com.google.common.escape:
//            Escaper

class this._cls0
    implements Function
{

    final Escaper this$0;

    public volatile Object apply(Object obj)
    {
        return apply((String)obj);
    }

    public String apply(String s)
    {
        return escape(s);
    }

    ()
    {
        this$0 = Escaper.this;
        super();
    }
}
