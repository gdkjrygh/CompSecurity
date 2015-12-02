// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;


public final class  extends Enum
{

    private static final FAKE $VALUES[];
    public static final FAKE FAKE;
    public static final FAKE PUSH;
    public static final FAKE UPDATE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/ubercab/client/feature/notification/model/NotificationData$Source, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PUSH = new <init>("PUSH", 0);
        UPDATE = new <init>("UPDATE", 1);
        FAKE = new <init>("FAKE", 2);
        $VALUES = (new .VALUES[] {
            PUSH, UPDATE, FAKE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
