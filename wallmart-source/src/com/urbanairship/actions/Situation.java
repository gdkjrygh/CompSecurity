// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.actions;


public final class Situation extends Enum
{

    private static final Situation $VALUES[];
    public static final Situation BACKGROUND_NOTIFICATION_ACTION_BUTTON;
    public static final Situation FOREGROUND_NOTIFICATION_ACTION_BUTTON;
    public static final Situation MANUAL_INVOCATION;
    public static final Situation PUSH_OPENED;
    public static final Situation PUSH_RECEIVED;
    public static final Situation WEB_VIEW_INVOCATION;

    private Situation(String s, int i)
    {
        super(s, i);
    }

    public static Situation valueOf(String s)
    {
        return (Situation)Enum.valueOf(com/urbanairship/actions/Situation, s);
    }

    public static Situation[] values()
    {
        return (Situation[])$VALUES.clone();
    }

    static 
    {
        MANUAL_INVOCATION = new Situation("MANUAL_INVOCATION", 0);
        PUSH_RECEIVED = new Situation("PUSH_RECEIVED", 1);
        PUSH_OPENED = new Situation("PUSH_OPENED", 2);
        WEB_VIEW_INVOCATION = new Situation("WEB_VIEW_INVOCATION", 3);
        FOREGROUND_NOTIFICATION_ACTION_BUTTON = new Situation("FOREGROUND_NOTIFICATION_ACTION_BUTTON", 4);
        BACKGROUND_NOTIFICATION_ACTION_BUTTON = new Situation("BACKGROUND_NOTIFICATION_ACTION_BUTTON", 5);
        $VALUES = (new Situation[] {
            MANUAL_INVOCATION, PUSH_RECEIVED, PUSH_OPENED, WEB_VIEW_INVOCATION, FOREGROUND_NOTIFICATION_ACTION_BUTTON, BACKGROUND_NOTIFICATION_ACTION_BUTTON
        });
    }
}
