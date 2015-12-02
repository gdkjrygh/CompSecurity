// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.config;

import dqu;

public final class  extends Enum
    implements dqu
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/ubercab/client/core/config/AppConfigKey$Rider$FavoriteLocationDistanceConstraints, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("MAXIMUM_DROPOFF_DISTANCE_IN_METERS", 0);
        b = new <init>("MAXIMUM_PICKUP_DISTANCE_IN_METERS", 1);
        c = new <init>("MINIMUM_DROPOFF_DISTANCE_IN_METERS", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
