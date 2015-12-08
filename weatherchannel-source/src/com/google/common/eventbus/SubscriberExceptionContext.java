// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.lang.reflect.Method;

// Referenced classes of package com.google.common.eventbus:
//            EventBus

public class SubscriberExceptionContext
{

    private final Object event;
    private final EventBus eventBus;
    private final Object subscriber;
    private final Method subscriberMethod;

    SubscriberExceptionContext(EventBus eventbus, Object obj, Object obj1, Method method)
    {
        eventBus = (EventBus)Preconditions.checkNotNull(eventbus);
        event = Preconditions.checkNotNull(obj);
        subscriber = Preconditions.checkNotNull(obj1);
        subscriberMethod = (Method)Preconditions.checkNotNull(method);
    }

    public Object getEvent()
    {
        return event;
    }

    public EventBus getEventBus()
    {
        return eventBus;
    }

    public Object getSubscriber()
    {
        return subscriber;
    }

    public Method getSubscriberMethod()
    {
        return subscriberMethod;
    }
}
