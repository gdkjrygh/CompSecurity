// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.ads2.ui;


// Referenced classes of package com.weather.ads2.ui:
//            DfpAdViewGenerator

public static final class  extends Enum
{

    private static final AUTO_SERVER $VALUES[];
    public static final AUTO_SERVER AUTO_CLIENT;
    public static final AUTO_SERVER AUTO_SERVER;
    public static final AUTO_SERVER MANUAL;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/weather/ads2/ui/DfpAdViewGenerator$ImpressionRecordingOption, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MANUAL = new <init>("MANUAL", 0);
        AUTO_CLIENT = new <init>("AUTO_CLIENT", 1);
        AUTO_SERVER = new <init>("AUTO_SERVER", 2);
        $VALUES = (new .VALUES[] {
            MANUAL, AUTO_CLIENT, AUTO_SERVER
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
