// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package de.greenrobot.event:
//            EventBus, Subscription

static final class eventQueue
{

    boolean canceled;
    Object event;
    List eventQueue;
    boolean isMainThread;
    boolean isPosting;
    Subscription subscription;

    ()
    {
        eventQueue = new ArrayList();
    }
}
