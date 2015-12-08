// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.eventbus:
//            EventBus, EventSubscriber

static class subscriber
{

    final Object event;
    final EventSubscriber subscriber;

    public (Object obj, EventSubscriber eventsubscriber)
    {
        event = Preconditions.checkNotNull(obj);
        subscriber = (EventSubscriber)Preconditions.checkNotNull(eventsubscriber);
    }
}
