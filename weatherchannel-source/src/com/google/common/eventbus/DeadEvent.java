// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Preconditions;

public class DeadEvent
{

    private final Object event;
    private final Object source;

    public DeadEvent(Object obj, Object obj1)
    {
        source = Preconditions.checkNotNull(obj);
        event = Preconditions.checkNotNull(obj1);
    }

    public Object getEvent()
    {
        return event;
    }

    public Object getSource()
    {
        return source;
    }
}
