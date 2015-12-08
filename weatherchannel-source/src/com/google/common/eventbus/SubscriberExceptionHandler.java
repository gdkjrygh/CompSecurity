// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;


// Referenced classes of package com.google.common.eventbus:
//            SubscriberExceptionContext

public interface SubscriberExceptionHandler
{

    public abstract void handleException(Throwable throwable, SubscriberExceptionContext subscriberexceptioncontext);
}
