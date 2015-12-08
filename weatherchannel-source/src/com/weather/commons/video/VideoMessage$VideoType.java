// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video;


// Referenced classes of package com.weather.commons.video:
//            VideoMessage

public static final class  extends Enum
{

    private static final MUST_SEE_INTL $VALUES[];
    public static final MUST_SEE_INTL CANTORE;
    public static final MUST_SEE_INTL LOCAL;
    public static final MUST_SEE_INTL MUST_SEE;
    public static final MUST_SEE_INTL MUST_SEE_INTL;
    public static final MUST_SEE_INTL NATIONAL;
    public static final MUST_SEE_INTL ONTV;
    public static final MUST_SEE_INTL REGIONAL;
    public static final MUST_SEE_INTL TORNADO;
    public static final MUST_SEE_INTL TROPICAL;
    public static final MUST_SEE_INTL WORLD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/video/VideoMessage$VideoType, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        LOCAL = new <init>("LOCAL", 0);
        REGIONAL = new <init>("REGIONAL", 1);
        NATIONAL = new <init>("NATIONAL", 2);
        MUST_SEE = new <init>("MUST_SEE", 3);
        CANTORE = new <init>("CANTORE", 4);
        TORNADO = new <init>("TORNADO", 5);
        TROPICAL = new <init>("TROPICAL", 6);
        WORLD = new <init>("WORLD", 7);
        ONTV = new <init>("ONTV", 8);
        MUST_SEE_INTL = new <init>("MUST_SEE_INTL", 9);
        $VALUES = (new .VALUES[] {
            LOCAL, REGIONAL, NATIONAL, MUST_SEE, CANTORE, TORNADO, TROPICAL, WORLD, ONTV, MUST_SEE_INTL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
