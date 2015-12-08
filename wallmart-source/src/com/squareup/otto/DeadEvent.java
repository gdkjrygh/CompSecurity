// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.otto;


public class DeadEvent
{

    public final Object event;
    public final Object source;

    public DeadEvent(Object obj, Object obj1)
    {
        source = obj;
        event = obj1;
    }
}
