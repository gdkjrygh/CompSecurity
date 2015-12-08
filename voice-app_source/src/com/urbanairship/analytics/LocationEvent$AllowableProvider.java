// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.analytics;


// Referenced classes of package com.urbanairship.analytics:
//            LocationEvent

public static final class  extends Enum
{

    private static final UNKNOWN $VALUES[];
    public static final UNKNOWN GPS;
    public static final UNKNOWN NETWORK;
    public static final UNKNOWN PASSIVE;
    public static final UNKNOWN UNKNOWN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/urbanairship/analytics/LocationEvent$AllowableProvider, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        GPS = new <init>("GPS", 0);
        NETWORK = new <init>("NETWORK", 1);
        PASSIVE = new <init>("PASSIVE", 2);
        UNKNOWN = new <init>("UNKNOWN", 3);
        $VALUES = (new .VALUES[] {
            GPS, NETWORK, PASSIVE, UNKNOWN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
