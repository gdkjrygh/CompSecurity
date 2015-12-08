// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.common.eventbus:
//            SubscriberExceptionHandler, EventBus, SubscriberExceptionContext

private static final class logger
    implements SubscriberExceptionHandler
{

    private final Logger logger;

    public void handleException(Throwable throwable, SubscriberExceptionContext subscriberexceptioncontext)
    {
        Logger logger1 = logger;
        Level level = Level.SEVERE;
        String s = String.valueOf(String.valueOf(subscriberexceptioncontext.getSubscriber()));
        subscriberexceptioncontext = String.valueOf(String.valueOf(subscriberexceptioncontext.getSubscriberMethod()));
        logger1.log(level, (new StringBuilder(s.length() + 30 + subscriberexceptioncontext.length())).append("Could not dispatch event: ").append(s).append(" to ").append(subscriberexceptioncontext).toString(), throwable.getCause());
    }

    public (String s)
    {
        String s1 = String.valueOf(String.valueOf(com/google/common/eventbus/EventBus.getName()));
        s = String.valueOf(String.valueOf((String)Preconditions.checkNotNull(s)));
        logger = Logger.getLogger((new StringBuilder(s1.length() + 1 + s.length())).append(s1).append(".").append(s).toString());
    }
}
