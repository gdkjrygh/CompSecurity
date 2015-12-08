// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.metrics;


public final class EventType extends Enum
{

    public static final EventType HIDDEN;
    public static final EventType VIEW;
    private static final EventType a[];

    private EventType(String s, int i)
    {
        super(s, i);
    }

    public static EventType valueOf(String s)
    {
        return (EventType)Enum.valueOf(com/comscore/metrics/EventType, s);
    }

    public static EventType[] values()
    {
        return (EventType[])a.clone();
    }

    public String toString()
    {
        return super.toString().toLowerCase();
    }

    static 
    {
        VIEW = new EventType("VIEW", 0);
        HIDDEN = new EventType("HIDDEN", 1);
        a = (new EventType[] {
            VIEW, HIDDEN
        });
    }
}
