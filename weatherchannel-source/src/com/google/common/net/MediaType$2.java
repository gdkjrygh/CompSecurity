// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Function;

// Referenced classes of package com.google.common.net:
//            MediaType

class this._cls0
    implements Function
{

    final MediaType this$0;

    public volatile Object apply(Object obj)
    {
        return apply((String)obj);
    }

    public String apply(String s)
    {
        if (MediaType.access$000().matchesAllOf(s))
        {
            return s;
        } else
        {
            return MediaType.access$100(s);
        }
    }

    ()
    {
        this$0 = MediaType.this;
        super();
    }
}
