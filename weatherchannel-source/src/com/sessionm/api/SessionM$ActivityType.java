// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api;


// Referenced classes of package com.sessionm.api:
//            SessionM

public static final class  extends Enum
{

    private static final INTERSTITIAL $VALUES[];
    public static final INTERSTITIAL ACHIEVEMENT;
    public static final INTERSTITIAL INTERSTITIAL;
    public static final INTERSTITIAL PORTAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/sessionm/api/SessionM$ActivityType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PORTAL = new <init>("PORTAL", 0);
        ACHIEVEMENT = new <init>("ACHIEVEMENT", 1);
        INTERSTITIAL = new <init>("INTERSTITIAL", 2);
        $VALUES = (new .VALUES[] {
            PORTAL, ACHIEVEMENT, INTERSTITIAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
