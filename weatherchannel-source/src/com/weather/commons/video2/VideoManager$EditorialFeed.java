// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2;


// Referenced classes of package com.weather.commons.video2:
//            VideoManager

public static final class  extends Enum
{

    private static final WIDGET $VALUES[];
    public static final WIDGET MAIN;
    public static final WIDGET RIGHT_NOW;
    public static final WIDGET WIDGET;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/commons/video2/VideoManager$EditorialFeed, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MAIN = new <init>("MAIN", 0);
        RIGHT_NOW = new <init>("RIGHT_NOW", 1);
        WIDGET = new <init>("WIDGET", 2);
        $VALUES = (new .VALUES[] {
            MAIN, RIGHT_NOW, WIDGET
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
