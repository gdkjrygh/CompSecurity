// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;


// Referenced classes of package com.google.common.eventbus:
//            EventBus

class this._cls0 extends ThreadLocal
{

    final EventBus this$0;

    protected Boolean initialValue()
    {
        return Boolean.valueOf(false);
    }

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    ()
    {
        this$0 = EventBus.this;
        super();
    }
}
