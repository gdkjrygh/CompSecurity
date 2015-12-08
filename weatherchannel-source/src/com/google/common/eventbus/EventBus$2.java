// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.google.common.eventbus:
//            EventBus

class this._cls0 extends ThreadLocal
{

    final EventBus this$0;

    protected volatile Object initialValue()
    {
        return initialValue();
    }

    protected Queue initialValue()
    {
        return new LinkedList();
    }

    ()
    {
        this$0 = EventBus.this;
        super();
    }
}
