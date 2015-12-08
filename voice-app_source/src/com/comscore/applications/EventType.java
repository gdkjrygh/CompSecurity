// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import java.util.Locale;

public final class EventType extends Enum
{

    public static final EventType AGGREGATE;
    public static final EventType CLOSE;
    public static final EventType HIDDEN;
    public static final EventType KEEPALIVE;
    public static final EventType START;
    public static final EventType VIEW;
    private static final EventType a[];

    private EventType(String s, int i)
    {
        super(s, i);
    }

    public static EventType valueOf(String s)
    {
        return (EventType)Enum.valueOf(com/comscore/applications/EventType, s);
    }

    public static EventType[] values()
    {
        return (EventType[])a.clone();
    }

    public String toString()
    {
        if (this == KEEPALIVE)
        {
            return "keep-alive";
        } else
        {
            return super.toString().toLowerCase(new Locale("en", "US"));
        }
    }

    static 
    {
        START = new EventType("START", 0);
        VIEW = new EventType("VIEW", 1);
        CLOSE = new EventType("CLOSE", 2);
        AGGREGATE = new EventType("AGGREGATE", 3);
        HIDDEN = new EventType("HIDDEN", 4);
        KEEPALIVE = new EventType("KEEPALIVE", 5);
        a = (new EventType[] {
            START, VIEW, CLOSE, AGGREGATE, HIDDEN, KEEPALIVE
        });
    }
}
