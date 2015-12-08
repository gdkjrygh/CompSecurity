// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Supplier;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractIdleService

class this._cls0
    implements Supplier
{

    final AbstractIdleService this$0;

    public volatile Object get()
    {
        return get();
    }

    public String get()
    {
        String s = String.valueOf(String.valueOf(serviceName()));
        String s1 = String.valueOf(String.valueOf(state()));
        return (new StringBuilder(s.length() + 1 + s1.length())).append(s).append(" ").append(s1).toString();
    }

    ()
    {
        this$0 = AbstractIdleService.this;
        super();
    }
}
