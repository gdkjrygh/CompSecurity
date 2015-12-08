// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;


// Referenced classes of package com.google.common.eventbus:
//            AsyncEventBus, EventSubscriber

class val.subscriber
    implements Runnable
{

    final AsyncEventBus this$0;
    final Object val$event;
    final EventSubscriber val$subscriber;

    public void run()
    {
        AsyncEventBus.access$001(AsyncEventBus.this, val$event, val$subscriber);
    }

    ()
    {
        this$0 = final_asynceventbus;
        val$event = obj;
        val$subscriber = EventSubscriber.this;
        super();
    }
}
