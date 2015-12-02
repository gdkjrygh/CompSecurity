// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.event;

import com.ubercab.client.core.model.Session;

public final class SessionEvent
{

    private final Session mSession;

    public SessionEvent(Session session)
    {
        mSession = session;
    }

    public final Session getSession()
    {
        return mSession;
    }
}
