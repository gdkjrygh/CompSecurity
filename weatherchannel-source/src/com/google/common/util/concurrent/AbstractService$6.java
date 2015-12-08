// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;


// Referenced classes of package com.google.common.util.concurrent:
//            AbstractService, Monitor

class t> extends t>
{

    final AbstractService this$0;

    public boolean isSatisfied()
    {
        return state().areTo(ING) <= 0;
    }

    _cls9(Monitor monitor)
    {
        this$0 = AbstractService.this;
        super(monitor);
    }
}
