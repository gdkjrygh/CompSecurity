// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.config;

import dqu;

public final class  extends Enum
    implements dqu
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/ubercab/client/core/config/AppConfigKey$Rider, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("ENABLE_SAFETY_NET", 0);
        b = new <init>("MAP_ANNOTATION_SYNC_DELAY_MS", 1);
        c = new <init>("MAP_ANNOTATION_SYNC_DELAY_ON_TRIP_MS", 2);
        d = new <init>("SURGE_RATIONALE", 3);
        e = new <init>("SLIDER_STYLE", 4);
        f = new <init>("TAG_TOKENS", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
